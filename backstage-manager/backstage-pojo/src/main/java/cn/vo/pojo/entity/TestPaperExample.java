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

        public Criteria andMonthjudgeIsNull() {
            addCriterion("monthJudge is null");
            return (Criteria) this;
        }

        public Criteria andMonthjudgeIsNotNull() {
            addCriterion("monthJudge is not null");
            return (Criteria) this;
        }

        public Criteria andMonthjudgeEqualTo(Integer value) {
            addCriterion("monthJudge =", value, "monthjudge");
            return (Criteria) this;
        }

        public Criteria andMonthjudgeNotEqualTo(Integer value) {
            addCriterion("monthJudge <>", value, "monthjudge");
            return (Criteria) this;
        }

        public Criteria andMonthjudgeGreaterThan(Integer value) {
            addCriterion("monthJudge >", value, "monthjudge");
            return (Criteria) this;
        }

        public Criteria andMonthjudgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthJudge >=", value, "monthjudge");
            return (Criteria) this;
        }

        public Criteria andMonthjudgeLessThan(Integer value) {
            addCriterion("monthJudge <", value, "monthjudge");
            return (Criteria) this;
        }

        public Criteria andMonthjudgeLessThanOrEqualTo(Integer value) {
            addCriterion("monthJudge <=", value, "monthjudge");
            return (Criteria) this;
        }

        public Criteria andMonthjudgeIn(List<Integer> values) {
            addCriterion("monthJudge in", values, "monthjudge");
            return (Criteria) this;
        }

        public Criteria andMonthjudgeNotIn(List<Integer> values) {
            addCriterion("monthJudge not in", values, "monthjudge");
            return (Criteria) this;
        }

        public Criteria andMonthjudgeBetween(Integer value1, Integer value2) {
            addCriterion("monthJudge between", value1, value2, "monthjudge");
            return (Criteria) this;
        }

        public Criteria andMonthjudgeNotBetween(Integer value1, Integer value2) {
            addCriterion("monthJudge not between", value1, value2, "monthjudge");
            return (Criteria) this;
        }

        public Criteria andAppealIsNull() {
            addCriterion("appeal is null");
            return (Criteria) this;
        }

        public Criteria andAppealIsNotNull() {
            addCriterion("appeal is not null");
            return (Criteria) this;
        }

        public Criteria andAppealEqualTo(String value) {
            addCriterion("appeal =", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealNotEqualTo(String value) {
            addCriterion("appeal <>", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealGreaterThan(String value) {
            addCriterion("appeal >", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealGreaterThanOrEqualTo(String value) {
            addCriterion("appeal >=", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealLessThan(String value) {
            addCriterion("appeal <", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealLessThanOrEqualTo(String value) {
            addCriterion("appeal <=", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealLike(String value) {
            addCriterion("appeal like", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealNotLike(String value) {
            addCriterion("appeal not like", value, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealIn(List<String> values) {
            addCriterion("appeal in", values, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealNotIn(List<String> values) {
            addCriterion("appeal not in", values, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealBetween(String value1, String value2) {
            addCriterion("appeal between", value1, value2, "appeal");
            return (Criteria) this;
        }

        public Criteria andAppealNotBetween(String value1, String value2) {
            addCriterion("appeal not between", value1, value2, "appeal");
            return (Criteria) this;
        }

        public Criteria andQcheckIsNull() {
            addCriterion("qcheck is null");
            return (Criteria) this;
        }

        public Criteria andQcheckIsNotNull() {
            addCriterion("qcheck is not null");
            return (Criteria) this;
        }

        public Criteria andQcheckEqualTo(String value) {
            addCriterion("qcheck =", value, "qcheck");
            return (Criteria) this;
        }

        public Criteria andQcheckNotEqualTo(String value) {
            addCriterion("qcheck <>", value, "qcheck");
            return (Criteria) this;
        }

        public Criteria andQcheckGreaterThan(String value) {
            addCriterion("qcheck >", value, "qcheck");
            return (Criteria) this;
        }

        public Criteria andQcheckGreaterThanOrEqualTo(String value) {
            addCriterion("qcheck >=", value, "qcheck");
            return (Criteria) this;
        }

        public Criteria andQcheckLessThan(String value) {
            addCriterion("qcheck <", value, "qcheck");
            return (Criteria) this;
        }

        public Criteria andQcheckLessThanOrEqualTo(String value) {
            addCriterion("qcheck <=", value, "qcheck");
            return (Criteria) this;
        }

        public Criteria andQcheckLike(String value) {
            addCriterion("qcheck like", value, "qcheck");
            return (Criteria) this;
        }

        public Criteria andQcheckNotLike(String value) {
            addCriterion("qcheck not like", value, "qcheck");
            return (Criteria) this;
        }

        public Criteria andQcheckIn(List<String> values) {
            addCriterion("qcheck in", values, "qcheck");
            return (Criteria) this;
        }

        public Criteria andQcheckNotIn(List<String> values) {
            addCriterion("qcheck not in", values, "qcheck");
            return (Criteria) this;
        }

        public Criteria andQcheckBetween(String value1, String value2) {
            addCriterion("qcheck between", value1, value2, "qcheck");
            return (Criteria) this;
        }

        public Criteria andQcheckNotBetween(String value1, String value2) {
            addCriterion("qcheck not between", value1, value2, "qcheck");
            return (Criteria) this;
        }

        public Criteria andQchecksnIsNull() {
            addCriterion("qchecksn is null");
            return (Criteria) this;
        }

        public Criteria andQchecksnIsNotNull() {
            addCriterion("qchecksn is not null");
            return (Criteria) this;
        }

        public Criteria andQchecksnEqualTo(String value) {
            addCriterion("qchecksn =", value, "qchecksn");
            return (Criteria) this;
        }

        public Criteria andQchecksnNotEqualTo(String value) {
            addCriterion("qchecksn <>", value, "qchecksn");
            return (Criteria) this;
        }

        public Criteria andQchecksnGreaterThan(String value) {
            addCriterion("qchecksn >", value, "qchecksn");
            return (Criteria) this;
        }

        public Criteria andQchecksnGreaterThanOrEqualTo(String value) {
            addCriterion("qchecksn >=", value, "qchecksn");
            return (Criteria) this;
        }

        public Criteria andQchecksnLessThan(String value) {
            addCriterion("qchecksn <", value, "qchecksn");
            return (Criteria) this;
        }

        public Criteria andQchecksnLessThanOrEqualTo(String value) {
            addCriterion("qchecksn <=", value, "qchecksn");
            return (Criteria) this;
        }

        public Criteria andQchecksnLike(String value) {
            addCriterion("qchecksn like", value, "qchecksn");
            return (Criteria) this;
        }

        public Criteria andQchecksnNotLike(String value) {
            addCriterion("qchecksn not like", value, "qchecksn");
            return (Criteria) this;
        }

        public Criteria andQchecksnIn(List<String> values) {
            addCriterion("qchecksn in", values, "qchecksn");
            return (Criteria) this;
        }

        public Criteria andQchecksnNotIn(List<String> values) {
            addCriterion("qchecksn not in", values, "qchecksn");
            return (Criteria) this;
        }

        public Criteria andQchecksnBetween(String value1, String value2) {
            addCriterion("qchecksn between", value1, value2, "qchecksn");
            return (Criteria) this;
        }

        public Criteria andQchecksnNotBetween(String value1, String value2) {
            addCriterion("qchecksn not between", value1, value2, "qchecksn");
            return (Criteria) this;
        }

        public Criteria andQcheckinputIsNull() {
            addCriterion("qcheckInput is null");
            return (Criteria) this;
        }

        public Criteria andQcheckinputIsNotNull() {
            addCriterion("qcheckInput is not null");
            return (Criteria) this;
        }

        public Criteria andQcheckinputEqualTo(String value) {
            addCriterion("qcheckInput =", value, "qcheckinput");
            return (Criteria) this;
        }

        public Criteria andQcheckinputNotEqualTo(String value) {
            addCriterion("qcheckInput <>", value, "qcheckinput");
            return (Criteria) this;
        }

        public Criteria andQcheckinputGreaterThan(String value) {
            addCriterion("qcheckInput >", value, "qcheckinput");
            return (Criteria) this;
        }

        public Criteria andQcheckinputGreaterThanOrEqualTo(String value) {
            addCriterion("qcheckInput >=", value, "qcheckinput");
            return (Criteria) this;
        }

        public Criteria andQcheckinputLessThan(String value) {
            addCriterion("qcheckInput <", value, "qcheckinput");
            return (Criteria) this;
        }

        public Criteria andQcheckinputLessThanOrEqualTo(String value) {
            addCriterion("qcheckInput <=", value, "qcheckinput");
            return (Criteria) this;
        }

        public Criteria andQcheckinputLike(String value) {
            addCriterion("qcheckInput like", value, "qcheckinput");
            return (Criteria) this;
        }

        public Criteria andQcheckinputNotLike(String value) {
            addCriterion("qcheckInput not like", value, "qcheckinput");
            return (Criteria) this;
        }

        public Criteria andQcheckinputIn(List<String> values) {
            addCriterion("qcheckInput in", values, "qcheckinput");
            return (Criteria) this;
        }

        public Criteria andQcheckinputNotIn(List<String> values) {
            addCriterion("qcheckInput not in", values, "qcheckinput");
            return (Criteria) this;
        }

        public Criteria andQcheckinputBetween(String value1, String value2) {
            addCriterion("qcheckInput between", value1, value2, "qcheckinput");
            return (Criteria) this;
        }

        public Criteria andQcheckinputNotBetween(String value1, String value2) {
            addCriterion("qcheckInput not between", value1, value2, "qcheckinput");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusIsNull() {
            addCriterion("qcheckStatus is null");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusIsNotNull() {
            addCriterion("qcheckStatus is not null");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusEqualTo(String value) {
            addCriterion("qcheckStatus =", value, "qcheckstatus");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusNotEqualTo(String value) {
            addCriterion("qcheckStatus <>", value, "qcheckstatus");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusGreaterThan(String value) {
            addCriterion("qcheckStatus >", value, "qcheckstatus");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("qcheckStatus >=", value, "qcheckstatus");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusLessThan(String value) {
            addCriterion("qcheckStatus <", value, "qcheckstatus");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusLessThanOrEqualTo(String value) {
            addCriterion("qcheckStatus <=", value, "qcheckstatus");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusLike(String value) {
            addCriterion("qcheckStatus like", value, "qcheckstatus");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusNotLike(String value) {
            addCriterion("qcheckStatus not like", value, "qcheckstatus");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusIn(List<String> values) {
            addCriterion("qcheckStatus in", values, "qcheckstatus");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusNotIn(List<String> values) {
            addCriterion("qcheckStatus not in", values, "qcheckstatus");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusBetween(String value1, String value2) {
            addCriterion("qcheckStatus between", value1, value2, "qcheckstatus");
            return (Criteria) this;
        }

        public Criteria andQcheckstatusNotBetween(String value1, String value2) {
            addCriterion("qcheckStatus not between", value1, value2, "qcheckstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNull() {
            addCriterion("checkStatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("checkStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(String value) {
            addCriterion("checkStatus =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(String value) {
            addCriterion("checkStatus <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(String value) {
            addCriterion("checkStatus >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("checkStatus >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(String value) {
            addCriterion("checkStatus <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(String value) {
            addCriterion("checkStatus <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLike(String value) {
            addCriterion("checkStatus like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotLike(String value) {
            addCriterion("checkStatus not like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<String> values) {
            addCriterion("checkStatus in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<String> values) {
            addCriterion("checkStatus not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(String value1, String value2) {
            addCriterion("checkStatus between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(String value1, String value2) {
            addCriterion("checkStatus not between", value1, value2, "checkstatus");
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

        public Criteria andExecutedateIsNull() {
            addCriterion("executeDate is null");
            return (Criteria) this;
        }

        public Criteria andExecutedateIsNotNull() {
            addCriterion("executeDate is not null");
            return (Criteria) this;
        }

        public Criteria andExecutedateEqualTo(String value) {
            addCriterion("executeDate =", value, "executedate");
            return (Criteria) this;
        }

        public Criteria andExecutedateNotEqualTo(String value) {
            addCriterion("executeDate <>", value, "executedate");
            return (Criteria) this;
        }

        public Criteria andExecutedateGreaterThan(String value) {
            addCriterion("executeDate >", value, "executedate");
            return (Criteria) this;
        }

        public Criteria andExecutedateGreaterThanOrEqualTo(String value) {
            addCriterion("executeDate >=", value, "executedate");
            return (Criteria) this;
        }

        public Criteria andExecutedateLessThan(String value) {
            addCriterion("executeDate <", value, "executedate");
            return (Criteria) this;
        }

        public Criteria andExecutedateLessThanOrEqualTo(String value) {
            addCriterion("executeDate <=", value, "executedate");
            return (Criteria) this;
        }

        public Criteria andExecutedateLike(String value) {
            addCriterion("executeDate like", value, "executedate");
            return (Criteria) this;
        }

        public Criteria andExecutedateNotLike(String value) {
            addCriterion("executeDate not like", value, "executedate");
            return (Criteria) this;
        }

        public Criteria andExecutedateIn(List<String> values) {
            addCriterion("executeDate in", values, "executedate");
            return (Criteria) this;
        }

        public Criteria andExecutedateNotIn(List<String> values) {
            addCriterion("executeDate not in", values, "executedate");
            return (Criteria) this;
        }

        public Criteria andExecutedateBetween(String value1, String value2) {
            addCriterion("executeDate between", value1, value2, "executedate");
            return (Criteria) this;
        }

        public Criteria andExecutedateNotBetween(String value1, String value2) {
            addCriterion("executeDate not between", value1, value2, "executedate");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("startTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("startTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endTime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endTime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andPersonnameIsNull() {
            addCriterion("personName is null");
            return (Criteria) this;
        }

        public Criteria andPersonnameIsNotNull() {
            addCriterion("personName is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnameEqualTo(String value) {
            addCriterion("personName =", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotEqualTo(String value) {
            addCriterion("personName <>", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameGreaterThan(String value) {
            addCriterion("personName >", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("personName >=", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameLessThan(String value) {
            addCriterion("personName <", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameLessThanOrEqualTo(String value) {
            addCriterion("personName <=", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameLike(String value) {
            addCriterion("personName like", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotLike(String value) {
            addCriterion("personName not like", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameIn(List<String> values) {
            addCriterion("personName in", values, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotIn(List<String> values) {
            addCriterion("personName not in", values, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameBetween(String value1, String value2) {
            addCriterion("personName between", value1, value2, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotBetween(String value1, String value2) {
            addCriterion("personName not between", value1, value2, "personname");
            return (Criteria) this;
        }

        public Criteria andCashiernameIsNull() {
            addCriterion("cashierName is null");
            return (Criteria) this;
        }

        public Criteria andCashiernameIsNotNull() {
            addCriterion("cashierName is not null");
            return (Criteria) this;
        }

        public Criteria andCashiernameEqualTo(String value) {
            addCriterion("cashierName =", value, "cashiername");
            return (Criteria) this;
        }

        public Criteria andCashiernameNotEqualTo(String value) {
            addCriterion("cashierName <>", value, "cashiername");
            return (Criteria) this;
        }

        public Criteria andCashiernameGreaterThan(String value) {
            addCriterion("cashierName >", value, "cashiername");
            return (Criteria) this;
        }

        public Criteria andCashiernameGreaterThanOrEqualTo(String value) {
            addCriterion("cashierName >=", value, "cashiername");
            return (Criteria) this;
        }

        public Criteria andCashiernameLessThan(String value) {
            addCriterion("cashierName <", value, "cashiername");
            return (Criteria) this;
        }

        public Criteria andCashiernameLessThanOrEqualTo(String value) {
            addCriterion("cashierName <=", value, "cashiername");
            return (Criteria) this;
        }

        public Criteria andCashiernameLike(String value) {
            addCriterion("cashierName like", value, "cashiername");
            return (Criteria) this;
        }

        public Criteria andCashiernameNotLike(String value) {
            addCriterion("cashierName not like", value, "cashiername");
            return (Criteria) this;
        }

        public Criteria andCashiernameIn(List<String> values) {
            addCriterion("cashierName in", values, "cashiername");
            return (Criteria) this;
        }

        public Criteria andCashiernameNotIn(List<String> values) {
            addCriterion("cashierName not in", values, "cashiername");
            return (Criteria) this;
        }

        public Criteria andCashiernameBetween(String value1, String value2) {
            addCriterion("cashierName between", value1, value2, "cashiername");
            return (Criteria) this;
        }

        public Criteria andCashiernameNotBetween(String value1, String value2) {
            addCriterion("cashierName not between", value1, value2, "cashiername");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyIsNull() {
            addCriterion("populationQty is null");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyIsNotNull() {
            addCriterion("populationQty is not null");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyEqualTo(String value) {
            addCriterion("populationQty =", value, "populationqty");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyNotEqualTo(String value) {
            addCriterion("populationQty <>", value, "populationqty");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyGreaterThan(String value) {
            addCriterion("populationQty >", value, "populationqty");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyGreaterThanOrEqualTo(String value) {
            addCriterion("populationQty >=", value, "populationqty");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyLessThan(String value) {
            addCriterion("populationQty <", value, "populationqty");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyLessThanOrEqualTo(String value) {
            addCriterion("populationQty <=", value, "populationqty");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyLike(String value) {
            addCriterion("populationQty like", value, "populationqty");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyNotLike(String value) {
            addCriterion("populationQty not like", value, "populationqty");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyIn(List<String> values) {
            addCriterion("populationQty in", values, "populationqty");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyNotIn(List<String> values) {
            addCriterion("populationQty not in", values, "populationqty");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyBetween(String value1, String value2) {
            addCriterion("populationQty between", value1, value2, "populationqty");
            return (Criteria) this;
        }

        public Criteria andPopulationqtyNotBetween(String value1, String value2) {
            addCriterion("populationQty not between", value1, value2, "populationqty");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyIsNull() {
            addCriterion("consumeQty is null");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyIsNotNull() {
            addCriterion("consumeQty is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyEqualTo(String value) {
            addCriterion("consumeQty =", value, "consumeqty");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyNotEqualTo(String value) {
            addCriterion("consumeQty <>", value, "consumeqty");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyGreaterThan(String value) {
            addCriterion("consumeQty >", value, "consumeqty");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyGreaterThanOrEqualTo(String value) {
            addCriterion("consumeQty >=", value, "consumeqty");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyLessThan(String value) {
            addCriterion("consumeQty <", value, "consumeqty");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyLessThanOrEqualTo(String value) {
            addCriterion("consumeQty <=", value, "consumeqty");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyLike(String value) {
            addCriterion("consumeQty like", value, "consumeqty");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyNotLike(String value) {
            addCriterion("consumeQty not like", value, "consumeqty");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyIn(List<String> values) {
            addCriterion("consumeQty in", values, "consumeqty");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyNotIn(List<String> values) {
            addCriterion("consumeQty not in", values, "consumeqty");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyBetween(String value1, String value2) {
            addCriterion("consumeQty between", value1, value2, "consumeqty");
            return (Criteria) this;
        }

        public Criteria andConsumeqtyNotBetween(String value1, String value2) {
            addCriterion("consumeQty not between", value1, value2, "consumeqty");
            return (Criteria) this;
        }

        public Criteria andCommodityIsNull() {
            addCriterion("commodity is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIsNotNull() {
            addCriterion("commodity is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityEqualTo(String value) {
            addCriterion("commodity =", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotEqualTo(String value) {
            addCriterion("commodity <>", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityGreaterThan(String value) {
            addCriterion("commodity >", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityGreaterThanOrEqualTo(String value) {
            addCriterion("commodity >=", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLessThan(String value) {
            addCriterion("commodity <", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLessThanOrEqualTo(String value) {
            addCriterion("commodity <=", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLike(String value) {
            addCriterion("commodity like", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotLike(String value) {
            addCriterion("commodity not like", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityIn(List<String> values) {
            addCriterion("commodity in", values, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotIn(List<String> values) {
            addCriterion("commodity not in", values, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityBetween(String value1, String value2) {
            addCriterion("commodity between", value1, value2, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotBetween(String value1, String value2) {
            addCriterion("commodity not between", value1, value2, "commodity");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andCrerttimeIsNull() {
            addCriterion("crertTime is null");
            return (Criteria) this;
        }

        public Criteria andCrerttimeIsNotNull() {
            addCriterion("crertTime is not null");
            return (Criteria) this;
        }

        public Criteria andCrerttimeEqualTo(String value) {
            addCriterion("crertTime =", value, "crerttime");
            return (Criteria) this;
        }

        public Criteria andCrerttimeNotEqualTo(String value) {
            addCriterion("crertTime <>", value, "crerttime");
            return (Criteria) this;
        }

        public Criteria andCrerttimeGreaterThan(String value) {
            addCriterion("crertTime >", value, "crerttime");
            return (Criteria) this;
        }

        public Criteria andCrerttimeGreaterThanOrEqualTo(String value) {
            addCriterion("crertTime >=", value, "crerttime");
            return (Criteria) this;
        }

        public Criteria andCrerttimeLessThan(String value) {
            addCriterion("crertTime <", value, "crerttime");
            return (Criteria) this;
        }

        public Criteria andCrerttimeLessThanOrEqualTo(String value) {
            addCriterion("crertTime <=", value, "crerttime");
            return (Criteria) this;
        }

        public Criteria andCrerttimeLike(String value) {
            addCriterion("crertTime like", value, "crerttime");
            return (Criteria) this;
        }

        public Criteria andCrerttimeNotLike(String value) {
            addCriterion("crertTime not like", value, "crerttime");
            return (Criteria) this;
        }

        public Criteria andCrerttimeIn(List<String> values) {
            addCriterion("crertTime in", values, "crerttime");
            return (Criteria) this;
        }

        public Criteria andCrerttimeNotIn(List<String> values) {
            addCriterion("crertTime not in", values, "crerttime");
            return (Criteria) this;
        }

        public Criteria andCrerttimeBetween(String value1, String value2) {
            addCriterion("crertTime between", value1, value2, "crerttime");
            return (Criteria) this;
        }

        public Criteria andCrerttimeNotBetween(String value1, String value2) {
            addCriterion("crertTime not between", value1, value2, "crerttime");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andTrough1IsNull() {
            addCriterion("trough1 is null");
            return (Criteria) this;
        }

        public Criteria andTrough1IsNotNull() {
            addCriterion("trough1 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough1EqualTo(String value) {
            addCriterion("trough1 =", value, "trough1");
            return (Criteria) this;
        }

        public Criteria andTrough1NotEqualTo(String value) {
            addCriterion("trough1 <>", value, "trough1");
            return (Criteria) this;
        }

        public Criteria andTrough1GreaterThan(String value) {
            addCriterion("trough1 >", value, "trough1");
            return (Criteria) this;
        }

        public Criteria andTrough1GreaterThanOrEqualTo(String value) {
            addCriterion("trough1 >=", value, "trough1");
            return (Criteria) this;
        }

        public Criteria andTrough1LessThan(String value) {
            addCriterion("trough1 <", value, "trough1");
            return (Criteria) this;
        }

        public Criteria andTrough1LessThanOrEqualTo(String value) {
            addCriterion("trough1 <=", value, "trough1");
            return (Criteria) this;
        }

        public Criteria andTrough1Like(String value) {
            addCriterion("trough1 like", value, "trough1");
            return (Criteria) this;
        }

        public Criteria andTrough1NotLike(String value) {
            addCriterion("trough1 not like", value, "trough1");
            return (Criteria) this;
        }

        public Criteria andTrough1In(List<String> values) {
            addCriterion("trough1 in", values, "trough1");
            return (Criteria) this;
        }

        public Criteria andTrough1NotIn(List<String> values) {
            addCriterion("trough1 not in", values, "trough1");
            return (Criteria) this;
        }

        public Criteria andTrough1Between(String value1, String value2) {
            addCriterion("trough1 between", value1, value2, "trough1");
            return (Criteria) this;
        }

        public Criteria andTrough1NotBetween(String value1, String value2) {
            addCriterion("trough1 not between", value1, value2, "trough1");
            return (Criteria) this;
        }

        public Criteria andTrough2IsNull() {
            addCriterion("trough2 is null");
            return (Criteria) this;
        }

        public Criteria andTrough2IsNotNull() {
            addCriterion("trough2 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough2EqualTo(String value) {
            addCriterion("trough2 =", value, "trough2");
            return (Criteria) this;
        }

        public Criteria andTrough2NotEqualTo(String value) {
            addCriterion("trough2 <>", value, "trough2");
            return (Criteria) this;
        }

        public Criteria andTrough2GreaterThan(String value) {
            addCriterion("trough2 >", value, "trough2");
            return (Criteria) this;
        }

        public Criteria andTrough2GreaterThanOrEqualTo(String value) {
            addCriterion("trough2 >=", value, "trough2");
            return (Criteria) this;
        }

        public Criteria andTrough2LessThan(String value) {
            addCriterion("trough2 <", value, "trough2");
            return (Criteria) this;
        }

        public Criteria andTrough2LessThanOrEqualTo(String value) {
            addCriterion("trough2 <=", value, "trough2");
            return (Criteria) this;
        }

        public Criteria andTrough2Like(String value) {
            addCriterion("trough2 like", value, "trough2");
            return (Criteria) this;
        }

        public Criteria andTrough2NotLike(String value) {
            addCriterion("trough2 not like", value, "trough2");
            return (Criteria) this;
        }

        public Criteria andTrough2In(List<String> values) {
            addCriterion("trough2 in", values, "trough2");
            return (Criteria) this;
        }

        public Criteria andTrough2NotIn(List<String> values) {
            addCriterion("trough2 not in", values, "trough2");
            return (Criteria) this;
        }

        public Criteria andTrough2Between(String value1, String value2) {
            addCriterion("trough2 between", value1, value2, "trough2");
            return (Criteria) this;
        }

        public Criteria andTrough2NotBetween(String value1, String value2) {
            addCriterion("trough2 not between", value1, value2, "trough2");
            return (Criteria) this;
        }

        public Criteria andTrough3IsNull() {
            addCriterion("trough3 is null");
            return (Criteria) this;
        }

        public Criteria andTrough3IsNotNull() {
            addCriterion("trough3 is not null");
            return (Criteria) this;
        }

        public Criteria andTrough3EqualTo(String value) {
            addCriterion("trough3 =", value, "trough3");
            return (Criteria) this;
        }

        public Criteria andTrough3NotEqualTo(String value) {
            addCriterion("trough3 <>", value, "trough3");
            return (Criteria) this;
        }

        public Criteria andTrough3GreaterThan(String value) {
            addCriterion("trough3 >", value, "trough3");
            return (Criteria) this;
        }

        public Criteria andTrough3GreaterThanOrEqualTo(String value) {
            addCriterion("trough3 >=", value, "trough3");
            return (Criteria) this;
        }

        public Criteria andTrough3LessThan(String value) {
            addCriterion("trough3 <", value, "trough3");
            return (Criteria) this;
        }

        public Criteria andTrough3LessThanOrEqualTo(String value) {
            addCriterion("trough3 <=", value, "trough3");
            return (Criteria) this;
        }

        public Criteria andTrough3Like(String value) {
            addCriterion("trough3 like", value, "trough3");
            return (Criteria) this;
        }

        public Criteria andTrough3NotLike(String value) {
            addCriterion("trough3 not like", value, "trough3");
            return (Criteria) this;
        }

        public Criteria andTrough3In(List<String> values) {
            addCriterion("trough3 in", values, "trough3");
            return (Criteria) this;
        }

        public Criteria andTrough3NotIn(List<String> values) {
            addCriterion("trough3 not in", values, "trough3");
            return (Criteria) this;
        }

        public Criteria andTrough3Between(String value1, String value2) {
            addCriterion("trough3 between", value1, value2, "trough3");
            return (Criteria) this;
        }

        public Criteria andTrough3NotBetween(String value1, String value2) {
            addCriterion("trough3 not between", value1, value2, "trough3");
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

        public Criteria andTopic1SixIsNull() {
            addCriterion("topic1_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic1SixIsNotNull() {
            addCriterion("topic1_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic1SixEqualTo(String value) {
            addCriterion("topic1_six =", value, "topic1Six");
            return (Criteria) this;
        }

        public Criteria andTopic1SixNotEqualTo(String value) {
            addCriterion("topic1_six <>", value, "topic1Six");
            return (Criteria) this;
        }

        public Criteria andTopic1SixGreaterThan(String value) {
            addCriterion("topic1_six >", value, "topic1Six");
            return (Criteria) this;
        }

        public Criteria andTopic1SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic1_six >=", value, "topic1Six");
            return (Criteria) this;
        }

        public Criteria andTopic1SixLessThan(String value) {
            addCriterion("topic1_six <", value, "topic1Six");
            return (Criteria) this;
        }

        public Criteria andTopic1SixLessThanOrEqualTo(String value) {
            addCriterion("topic1_six <=", value, "topic1Six");
            return (Criteria) this;
        }

        public Criteria andTopic1SixLike(String value) {
            addCriterion("topic1_six like", value, "topic1Six");
            return (Criteria) this;
        }

        public Criteria andTopic1SixNotLike(String value) {
            addCriterion("topic1_six not like", value, "topic1Six");
            return (Criteria) this;
        }

        public Criteria andTopic1SixIn(List<String> values) {
            addCriterion("topic1_six in", values, "topic1Six");
            return (Criteria) this;
        }

        public Criteria andTopic1SixNotIn(List<String> values) {
            addCriterion("topic1_six not in", values, "topic1Six");
            return (Criteria) this;
        }

        public Criteria andTopic1SixBetween(String value1, String value2) {
            addCriterion("topic1_six between", value1, value2, "topic1Six");
            return (Criteria) this;
        }

        public Criteria andTopic1SixNotBetween(String value1, String value2) {
            addCriterion("topic1_six not between", value1, value2, "topic1Six");
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

        public Criteria andTopic2SixIsNull() {
            addCriterion("topic2_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic2SixIsNotNull() {
            addCriterion("topic2_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic2SixEqualTo(String value) {
            addCriterion("topic2_six =", value, "topic2Six");
            return (Criteria) this;
        }

        public Criteria andTopic2SixNotEqualTo(String value) {
            addCriterion("topic2_six <>", value, "topic2Six");
            return (Criteria) this;
        }

        public Criteria andTopic2SixGreaterThan(String value) {
            addCriterion("topic2_six >", value, "topic2Six");
            return (Criteria) this;
        }

        public Criteria andTopic2SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic2_six >=", value, "topic2Six");
            return (Criteria) this;
        }

        public Criteria andTopic2SixLessThan(String value) {
            addCriterion("topic2_six <", value, "topic2Six");
            return (Criteria) this;
        }

        public Criteria andTopic2SixLessThanOrEqualTo(String value) {
            addCriterion("topic2_six <=", value, "topic2Six");
            return (Criteria) this;
        }

        public Criteria andTopic2SixLike(String value) {
            addCriterion("topic2_six like", value, "topic2Six");
            return (Criteria) this;
        }

        public Criteria andTopic2SixNotLike(String value) {
            addCriterion("topic2_six not like", value, "topic2Six");
            return (Criteria) this;
        }

        public Criteria andTopic2SixIn(List<String> values) {
            addCriterion("topic2_six in", values, "topic2Six");
            return (Criteria) this;
        }

        public Criteria andTopic2SixNotIn(List<String> values) {
            addCriterion("topic2_six not in", values, "topic2Six");
            return (Criteria) this;
        }

        public Criteria andTopic2SixBetween(String value1, String value2) {
            addCriterion("topic2_six between", value1, value2, "topic2Six");
            return (Criteria) this;
        }

        public Criteria andTopic2SixNotBetween(String value1, String value2) {
            addCriterion("topic2_six not between", value1, value2, "topic2Six");
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

        public Criteria andTopic3SixIsNull() {
            addCriterion("topic3_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic3SixIsNotNull() {
            addCriterion("topic3_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic3SixEqualTo(String value) {
            addCriterion("topic3_six =", value, "topic3Six");
            return (Criteria) this;
        }

        public Criteria andTopic3SixNotEqualTo(String value) {
            addCriterion("topic3_six <>", value, "topic3Six");
            return (Criteria) this;
        }

        public Criteria andTopic3SixGreaterThan(String value) {
            addCriterion("topic3_six >", value, "topic3Six");
            return (Criteria) this;
        }

        public Criteria andTopic3SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic3_six >=", value, "topic3Six");
            return (Criteria) this;
        }

        public Criteria andTopic3SixLessThan(String value) {
            addCriterion("topic3_six <", value, "topic3Six");
            return (Criteria) this;
        }

        public Criteria andTopic3SixLessThanOrEqualTo(String value) {
            addCriterion("topic3_six <=", value, "topic3Six");
            return (Criteria) this;
        }

        public Criteria andTopic3SixLike(String value) {
            addCriterion("topic3_six like", value, "topic3Six");
            return (Criteria) this;
        }

        public Criteria andTopic3SixNotLike(String value) {
            addCriterion("topic3_six not like", value, "topic3Six");
            return (Criteria) this;
        }

        public Criteria andTopic3SixIn(List<String> values) {
            addCriterion("topic3_six in", values, "topic3Six");
            return (Criteria) this;
        }

        public Criteria andTopic3SixNotIn(List<String> values) {
            addCriterion("topic3_six not in", values, "topic3Six");
            return (Criteria) this;
        }

        public Criteria andTopic3SixBetween(String value1, String value2) {
            addCriterion("topic3_six between", value1, value2, "topic3Six");
            return (Criteria) this;
        }

        public Criteria andTopic3SixNotBetween(String value1, String value2) {
            addCriterion("topic3_six not between", value1, value2, "topic3Six");
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

        public Criteria andTopic4SixIsNull() {
            addCriterion("topic4_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic4SixIsNotNull() {
            addCriterion("topic4_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic4SixEqualTo(String value) {
            addCriterion("topic4_six =", value, "topic4Six");
            return (Criteria) this;
        }

        public Criteria andTopic4SixNotEqualTo(String value) {
            addCriterion("topic4_six <>", value, "topic4Six");
            return (Criteria) this;
        }

        public Criteria andTopic4SixGreaterThan(String value) {
            addCriterion("topic4_six >", value, "topic4Six");
            return (Criteria) this;
        }

        public Criteria andTopic4SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic4_six >=", value, "topic4Six");
            return (Criteria) this;
        }

        public Criteria andTopic4SixLessThan(String value) {
            addCriterion("topic4_six <", value, "topic4Six");
            return (Criteria) this;
        }

        public Criteria andTopic4SixLessThanOrEqualTo(String value) {
            addCriterion("topic4_six <=", value, "topic4Six");
            return (Criteria) this;
        }

        public Criteria andTopic4SixLike(String value) {
            addCriterion("topic4_six like", value, "topic4Six");
            return (Criteria) this;
        }

        public Criteria andTopic4SixNotLike(String value) {
            addCriterion("topic4_six not like", value, "topic4Six");
            return (Criteria) this;
        }

        public Criteria andTopic4SixIn(List<String> values) {
            addCriterion("topic4_six in", values, "topic4Six");
            return (Criteria) this;
        }

        public Criteria andTopic4SixNotIn(List<String> values) {
            addCriterion("topic4_six not in", values, "topic4Six");
            return (Criteria) this;
        }

        public Criteria andTopic4SixBetween(String value1, String value2) {
            addCriterion("topic4_six between", value1, value2, "topic4Six");
            return (Criteria) this;
        }

        public Criteria andTopic4SixNotBetween(String value1, String value2) {
            addCriterion("topic4_six not between", value1, value2, "topic4Six");
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

        public Criteria andTopic5SixIsNull() {
            addCriterion("topic5_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic5SixIsNotNull() {
            addCriterion("topic5_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic5SixEqualTo(String value) {
            addCriterion("topic5_six =", value, "topic5Six");
            return (Criteria) this;
        }

        public Criteria andTopic5SixNotEqualTo(String value) {
            addCriterion("topic5_six <>", value, "topic5Six");
            return (Criteria) this;
        }

        public Criteria andTopic5SixGreaterThan(String value) {
            addCriterion("topic5_six >", value, "topic5Six");
            return (Criteria) this;
        }

        public Criteria andTopic5SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic5_six >=", value, "topic5Six");
            return (Criteria) this;
        }

        public Criteria andTopic5SixLessThan(String value) {
            addCriterion("topic5_six <", value, "topic5Six");
            return (Criteria) this;
        }

        public Criteria andTopic5SixLessThanOrEqualTo(String value) {
            addCriterion("topic5_six <=", value, "topic5Six");
            return (Criteria) this;
        }

        public Criteria andTopic5SixLike(String value) {
            addCriterion("topic5_six like", value, "topic5Six");
            return (Criteria) this;
        }

        public Criteria andTopic5SixNotLike(String value) {
            addCriterion("topic5_six not like", value, "topic5Six");
            return (Criteria) this;
        }

        public Criteria andTopic5SixIn(List<String> values) {
            addCriterion("topic5_six in", values, "topic5Six");
            return (Criteria) this;
        }

        public Criteria andTopic5SixNotIn(List<String> values) {
            addCriterion("topic5_six not in", values, "topic5Six");
            return (Criteria) this;
        }

        public Criteria andTopic5SixBetween(String value1, String value2) {
            addCriterion("topic5_six between", value1, value2, "topic5Six");
            return (Criteria) this;
        }

        public Criteria andTopic5SixNotBetween(String value1, String value2) {
            addCriterion("topic5_six not between", value1, value2, "topic5Six");
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

        public Criteria andTopic6SixIsNull() {
            addCriterion("topic6_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic6SixIsNotNull() {
            addCriterion("topic6_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic6SixEqualTo(String value) {
            addCriterion("topic6_six =", value, "topic6Six");
            return (Criteria) this;
        }

        public Criteria andTopic6SixNotEqualTo(String value) {
            addCriterion("topic6_six <>", value, "topic6Six");
            return (Criteria) this;
        }

        public Criteria andTopic6SixGreaterThan(String value) {
            addCriterion("topic6_six >", value, "topic6Six");
            return (Criteria) this;
        }

        public Criteria andTopic6SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic6_six >=", value, "topic6Six");
            return (Criteria) this;
        }

        public Criteria andTopic6SixLessThan(String value) {
            addCriterion("topic6_six <", value, "topic6Six");
            return (Criteria) this;
        }

        public Criteria andTopic6SixLessThanOrEqualTo(String value) {
            addCriterion("topic6_six <=", value, "topic6Six");
            return (Criteria) this;
        }

        public Criteria andTopic6SixLike(String value) {
            addCriterion("topic6_six like", value, "topic6Six");
            return (Criteria) this;
        }

        public Criteria andTopic6SixNotLike(String value) {
            addCriterion("topic6_six not like", value, "topic6Six");
            return (Criteria) this;
        }

        public Criteria andTopic6SixIn(List<String> values) {
            addCriterion("topic6_six in", values, "topic6Six");
            return (Criteria) this;
        }

        public Criteria andTopic6SixNotIn(List<String> values) {
            addCriterion("topic6_six not in", values, "topic6Six");
            return (Criteria) this;
        }

        public Criteria andTopic6SixBetween(String value1, String value2) {
            addCriterion("topic6_six between", value1, value2, "topic6Six");
            return (Criteria) this;
        }

        public Criteria andTopic6SixNotBetween(String value1, String value2) {
            addCriterion("topic6_six not between", value1, value2, "topic6Six");
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

        public Criteria andTopic7SixIsNull() {
            addCriterion("topic7_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic7SixIsNotNull() {
            addCriterion("topic7_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic7SixEqualTo(String value) {
            addCriterion("topic7_six =", value, "topic7Six");
            return (Criteria) this;
        }

        public Criteria andTopic7SixNotEqualTo(String value) {
            addCriterion("topic7_six <>", value, "topic7Six");
            return (Criteria) this;
        }

        public Criteria andTopic7SixGreaterThan(String value) {
            addCriterion("topic7_six >", value, "topic7Six");
            return (Criteria) this;
        }

        public Criteria andTopic7SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic7_six >=", value, "topic7Six");
            return (Criteria) this;
        }

        public Criteria andTopic7SixLessThan(String value) {
            addCriterion("topic7_six <", value, "topic7Six");
            return (Criteria) this;
        }

        public Criteria andTopic7SixLessThanOrEqualTo(String value) {
            addCriterion("topic7_six <=", value, "topic7Six");
            return (Criteria) this;
        }

        public Criteria andTopic7SixLike(String value) {
            addCriterion("topic7_six like", value, "topic7Six");
            return (Criteria) this;
        }

        public Criteria andTopic7SixNotLike(String value) {
            addCriterion("topic7_six not like", value, "topic7Six");
            return (Criteria) this;
        }

        public Criteria andTopic7SixIn(List<String> values) {
            addCriterion("topic7_six in", values, "topic7Six");
            return (Criteria) this;
        }

        public Criteria andTopic7SixNotIn(List<String> values) {
            addCriterion("topic7_six not in", values, "topic7Six");
            return (Criteria) this;
        }

        public Criteria andTopic7SixBetween(String value1, String value2) {
            addCriterion("topic7_six between", value1, value2, "topic7Six");
            return (Criteria) this;
        }

        public Criteria andTopic7SixNotBetween(String value1, String value2) {
            addCriterion("topic7_six not between", value1, value2, "topic7Six");
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

        public Criteria andTopic8SixIsNull() {
            addCriterion("topic8_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic8SixIsNotNull() {
            addCriterion("topic8_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic8SixEqualTo(String value) {
            addCriterion("topic8_six =", value, "topic8Six");
            return (Criteria) this;
        }

        public Criteria andTopic8SixNotEqualTo(String value) {
            addCriterion("topic8_six <>", value, "topic8Six");
            return (Criteria) this;
        }

        public Criteria andTopic8SixGreaterThan(String value) {
            addCriterion("topic8_six >", value, "topic8Six");
            return (Criteria) this;
        }

        public Criteria andTopic8SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic8_six >=", value, "topic8Six");
            return (Criteria) this;
        }

        public Criteria andTopic8SixLessThan(String value) {
            addCriterion("topic8_six <", value, "topic8Six");
            return (Criteria) this;
        }

        public Criteria andTopic8SixLessThanOrEqualTo(String value) {
            addCriterion("topic8_six <=", value, "topic8Six");
            return (Criteria) this;
        }

        public Criteria andTopic8SixLike(String value) {
            addCriterion("topic8_six like", value, "topic8Six");
            return (Criteria) this;
        }

        public Criteria andTopic8SixNotLike(String value) {
            addCriterion("topic8_six not like", value, "topic8Six");
            return (Criteria) this;
        }

        public Criteria andTopic8SixIn(List<String> values) {
            addCriterion("topic8_six in", values, "topic8Six");
            return (Criteria) this;
        }

        public Criteria andTopic8SixNotIn(List<String> values) {
            addCriterion("topic8_six not in", values, "topic8Six");
            return (Criteria) this;
        }

        public Criteria andTopic8SixBetween(String value1, String value2) {
            addCriterion("topic8_six between", value1, value2, "topic8Six");
            return (Criteria) this;
        }

        public Criteria andTopic8SixNotBetween(String value1, String value2) {
            addCriterion("topic8_six not between", value1, value2, "topic8Six");
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

        public Criteria andTopic9SixIsNull() {
            addCriterion("topic9_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic9SixIsNotNull() {
            addCriterion("topic9_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic9SixEqualTo(String value) {
            addCriterion("topic9_six =", value, "topic9Six");
            return (Criteria) this;
        }

        public Criteria andTopic9SixNotEqualTo(String value) {
            addCriterion("topic9_six <>", value, "topic9Six");
            return (Criteria) this;
        }

        public Criteria andTopic9SixGreaterThan(String value) {
            addCriterion("topic9_six >", value, "topic9Six");
            return (Criteria) this;
        }

        public Criteria andTopic9SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic9_six >=", value, "topic9Six");
            return (Criteria) this;
        }

        public Criteria andTopic9SixLessThan(String value) {
            addCriterion("topic9_six <", value, "topic9Six");
            return (Criteria) this;
        }

        public Criteria andTopic9SixLessThanOrEqualTo(String value) {
            addCriterion("topic9_six <=", value, "topic9Six");
            return (Criteria) this;
        }

        public Criteria andTopic9SixLike(String value) {
            addCriterion("topic9_six like", value, "topic9Six");
            return (Criteria) this;
        }

        public Criteria andTopic9SixNotLike(String value) {
            addCriterion("topic9_six not like", value, "topic9Six");
            return (Criteria) this;
        }

        public Criteria andTopic9SixIn(List<String> values) {
            addCriterion("topic9_six in", values, "topic9Six");
            return (Criteria) this;
        }

        public Criteria andTopic9SixNotIn(List<String> values) {
            addCriterion("topic9_six not in", values, "topic9Six");
            return (Criteria) this;
        }

        public Criteria andTopic9SixBetween(String value1, String value2) {
            addCriterion("topic9_six between", value1, value2, "topic9Six");
            return (Criteria) this;
        }

        public Criteria andTopic9SixNotBetween(String value1, String value2) {
            addCriterion("topic9_six not between", value1, value2, "topic9Six");
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

        public Criteria andTopic10SixIsNull() {
            addCriterion("topic10_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic10SixIsNotNull() {
            addCriterion("topic10_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic10SixEqualTo(String value) {
            addCriterion("topic10_six =", value, "topic10Six");
            return (Criteria) this;
        }

        public Criteria andTopic10SixNotEqualTo(String value) {
            addCriterion("topic10_six <>", value, "topic10Six");
            return (Criteria) this;
        }

        public Criteria andTopic10SixGreaterThan(String value) {
            addCriterion("topic10_six >", value, "topic10Six");
            return (Criteria) this;
        }

        public Criteria andTopic10SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic10_six >=", value, "topic10Six");
            return (Criteria) this;
        }

        public Criteria andTopic10SixLessThan(String value) {
            addCriterion("topic10_six <", value, "topic10Six");
            return (Criteria) this;
        }

        public Criteria andTopic10SixLessThanOrEqualTo(String value) {
            addCriterion("topic10_six <=", value, "topic10Six");
            return (Criteria) this;
        }

        public Criteria andTopic10SixLike(String value) {
            addCriterion("topic10_six like", value, "topic10Six");
            return (Criteria) this;
        }

        public Criteria andTopic10SixNotLike(String value) {
            addCriterion("topic10_six not like", value, "topic10Six");
            return (Criteria) this;
        }

        public Criteria andTopic10SixIn(List<String> values) {
            addCriterion("topic10_six in", values, "topic10Six");
            return (Criteria) this;
        }

        public Criteria andTopic10SixNotIn(List<String> values) {
            addCriterion("topic10_six not in", values, "topic10Six");
            return (Criteria) this;
        }

        public Criteria andTopic10SixBetween(String value1, String value2) {
            addCriterion("topic10_six between", value1, value2, "topic10Six");
            return (Criteria) this;
        }

        public Criteria andTopic10SixNotBetween(String value1, String value2) {
            addCriterion("topic10_six not between", value1, value2, "topic10Six");
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

        public Criteria andTopic11SixIsNull() {
            addCriterion("topic11_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic11SixIsNotNull() {
            addCriterion("topic11_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic11SixEqualTo(String value) {
            addCriterion("topic11_six =", value, "topic11Six");
            return (Criteria) this;
        }

        public Criteria andTopic11SixNotEqualTo(String value) {
            addCriterion("topic11_six <>", value, "topic11Six");
            return (Criteria) this;
        }

        public Criteria andTopic11SixGreaterThan(String value) {
            addCriterion("topic11_six >", value, "topic11Six");
            return (Criteria) this;
        }

        public Criteria andTopic11SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic11_six >=", value, "topic11Six");
            return (Criteria) this;
        }

        public Criteria andTopic11SixLessThan(String value) {
            addCriterion("topic11_six <", value, "topic11Six");
            return (Criteria) this;
        }

        public Criteria andTopic11SixLessThanOrEqualTo(String value) {
            addCriterion("topic11_six <=", value, "topic11Six");
            return (Criteria) this;
        }

        public Criteria andTopic11SixLike(String value) {
            addCriterion("topic11_six like", value, "topic11Six");
            return (Criteria) this;
        }

        public Criteria andTopic11SixNotLike(String value) {
            addCriterion("topic11_six not like", value, "topic11Six");
            return (Criteria) this;
        }

        public Criteria andTopic11SixIn(List<String> values) {
            addCriterion("topic11_six in", values, "topic11Six");
            return (Criteria) this;
        }

        public Criteria andTopic11SixNotIn(List<String> values) {
            addCriterion("topic11_six not in", values, "topic11Six");
            return (Criteria) this;
        }

        public Criteria andTopic11SixBetween(String value1, String value2) {
            addCriterion("topic11_six between", value1, value2, "topic11Six");
            return (Criteria) this;
        }

        public Criteria andTopic11SixNotBetween(String value1, String value2) {
            addCriterion("topic11_six not between", value1, value2, "topic11Six");
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

        public Criteria andTopic12SixIsNull() {
            addCriterion("topic12_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic12SixIsNotNull() {
            addCriterion("topic12_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic12SixEqualTo(String value) {
            addCriterion("topic12_six =", value, "topic12Six");
            return (Criteria) this;
        }

        public Criteria andTopic12SixNotEqualTo(String value) {
            addCriterion("topic12_six <>", value, "topic12Six");
            return (Criteria) this;
        }

        public Criteria andTopic12SixGreaterThan(String value) {
            addCriterion("topic12_six >", value, "topic12Six");
            return (Criteria) this;
        }

        public Criteria andTopic12SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic12_six >=", value, "topic12Six");
            return (Criteria) this;
        }

        public Criteria andTopic12SixLessThan(String value) {
            addCriterion("topic12_six <", value, "topic12Six");
            return (Criteria) this;
        }

        public Criteria andTopic12SixLessThanOrEqualTo(String value) {
            addCriterion("topic12_six <=", value, "topic12Six");
            return (Criteria) this;
        }

        public Criteria andTopic12SixLike(String value) {
            addCriterion("topic12_six like", value, "topic12Six");
            return (Criteria) this;
        }

        public Criteria andTopic12SixNotLike(String value) {
            addCriterion("topic12_six not like", value, "topic12Six");
            return (Criteria) this;
        }

        public Criteria andTopic12SixIn(List<String> values) {
            addCriterion("topic12_six in", values, "topic12Six");
            return (Criteria) this;
        }

        public Criteria andTopic12SixNotIn(List<String> values) {
            addCriterion("topic12_six not in", values, "topic12Six");
            return (Criteria) this;
        }

        public Criteria andTopic12SixBetween(String value1, String value2) {
            addCriterion("topic12_six between", value1, value2, "topic12Six");
            return (Criteria) this;
        }

        public Criteria andTopic12SixNotBetween(String value1, String value2) {
            addCriterion("topic12_six not between", value1, value2, "topic12Six");
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

        public Criteria andTopic13SixIsNull() {
            addCriterion("topic13_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic13SixIsNotNull() {
            addCriterion("topic13_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic13SixEqualTo(String value) {
            addCriterion("topic13_six =", value, "topic13Six");
            return (Criteria) this;
        }

        public Criteria andTopic13SixNotEqualTo(String value) {
            addCriterion("topic13_six <>", value, "topic13Six");
            return (Criteria) this;
        }

        public Criteria andTopic13SixGreaterThan(String value) {
            addCriterion("topic13_six >", value, "topic13Six");
            return (Criteria) this;
        }

        public Criteria andTopic13SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic13_six >=", value, "topic13Six");
            return (Criteria) this;
        }

        public Criteria andTopic13SixLessThan(String value) {
            addCriterion("topic13_six <", value, "topic13Six");
            return (Criteria) this;
        }

        public Criteria andTopic13SixLessThanOrEqualTo(String value) {
            addCriterion("topic13_six <=", value, "topic13Six");
            return (Criteria) this;
        }

        public Criteria andTopic13SixLike(String value) {
            addCriterion("topic13_six like", value, "topic13Six");
            return (Criteria) this;
        }

        public Criteria andTopic13SixNotLike(String value) {
            addCriterion("topic13_six not like", value, "topic13Six");
            return (Criteria) this;
        }

        public Criteria andTopic13SixIn(List<String> values) {
            addCriterion("topic13_six in", values, "topic13Six");
            return (Criteria) this;
        }

        public Criteria andTopic13SixNotIn(List<String> values) {
            addCriterion("topic13_six not in", values, "topic13Six");
            return (Criteria) this;
        }

        public Criteria andTopic13SixBetween(String value1, String value2) {
            addCriterion("topic13_six between", value1, value2, "topic13Six");
            return (Criteria) this;
        }

        public Criteria andTopic13SixNotBetween(String value1, String value2) {
            addCriterion("topic13_six not between", value1, value2, "topic13Six");
            return (Criteria) this;
        }

        public Criteria andTopic14OneIsNull() {
            addCriterion("topic14_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic14OneIsNotNull() {
            addCriterion("topic14_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic14OneEqualTo(String value) {
            addCriterion("topic14_one =", value, "topic14One");
            return (Criteria) this;
        }

        public Criteria andTopic14OneNotEqualTo(String value) {
            addCriterion("topic14_one <>", value, "topic14One");
            return (Criteria) this;
        }

        public Criteria andTopic14OneGreaterThan(String value) {
            addCriterion("topic14_one >", value, "topic14One");
            return (Criteria) this;
        }

        public Criteria andTopic14OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic14_one >=", value, "topic14One");
            return (Criteria) this;
        }

        public Criteria andTopic14OneLessThan(String value) {
            addCriterion("topic14_one <", value, "topic14One");
            return (Criteria) this;
        }

        public Criteria andTopic14OneLessThanOrEqualTo(String value) {
            addCriterion("topic14_one <=", value, "topic14One");
            return (Criteria) this;
        }

        public Criteria andTopic14OneLike(String value) {
            addCriterion("topic14_one like", value, "topic14One");
            return (Criteria) this;
        }

        public Criteria andTopic14OneNotLike(String value) {
            addCriterion("topic14_one not like", value, "topic14One");
            return (Criteria) this;
        }

        public Criteria andTopic14OneIn(List<String> values) {
            addCriterion("topic14_one in", values, "topic14One");
            return (Criteria) this;
        }

        public Criteria andTopic14OneNotIn(List<String> values) {
            addCriterion("topic14_one not in", values, "topic14One");
            return (Criteria) this;
        }

        public Criteria andTopic14OneBetween(String value1, String value2) {
            addCriterion("topic14_one between", value1, value2, "topic14One");
            return (Criteria) this;
        }

        public Criteria andTopic14OneNotBetween(String value1, String value2) {
            addCriterion("topic14_one not between", value1, value2, "topic14One");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoIsNull() {
            addCriterion("topic14_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoIsNotNull() {
            addCriterion("topic14_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoEqualTo(String value) {
            addCriterion("topic14_two =", value, "topic14Two");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoNotEqualTo(String value) {
            addCriterion("topic14_two <>", value, "topic14Two");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoGreaterThan(String value) {
            addCriterion("topic14_two >", value, "topic14Two");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic14_two >=", value, "topic14Two");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoLessThan(String value) {
            addCriterion("topic14_two <", value, "topic14Two");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoLessThanOrEqualTo(String value) {
            addCriterion("topic14_two <=", value, "topic14Two");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoLike(String value) {
            addCriterion("topic14_two like", value, "topic14Two");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoNotLike(String value) {
            addCriterion("topic14_two not like", value, "topic14Two");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoIn(List<String> values) {
            addCriterion("topic14_two in", values, "topic14Two");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoNotIn(List<String> values) {
            addCriterion("topic14_two not in", values, "topic14Two");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoBetween(String value1, String value2) {
            addCriterion("topic14_two between", value1, value2, "topic14Two");
            return (Criteria) this;
        }

        public Criteria andTopic14TwoNotBetween(String value1, String value2) {
            addCriterion("topic14_two not between", value1, value2, "topic14Two");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeIsNull() {
            addCriterion("topic14_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeIsNotNull() {
            addCriterion("topic14_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeEqualTo(String value) {
            addCriterion("topic14_three =", value, "topic14Three");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeNotEqualTo(String value) {
            addCriterion("topic14_three <>", value, "topic14Three");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeGreaterThan(String value) {
            addCriterion("topic14_three >", value, "topic14Three");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic14_three >=", value, "topic14Three");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeLessThan(String value) {
            addCriterion("topic14_three <", value, "topic14Three");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic14_three <=", value, "topic14Three");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeLike(String value) {
            addCriterion("topic14_three like", value, "topic14Three");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeNotLike(String value) {
            addCriterion("topic14_three not like", value, "topic14Three");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeIn(List<String> values) {
            addCriterion("topic14_three in", values, "topic14Three");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeNotIn(List<String> values) {
            addCriterion("topic14_three not in", values, "topic14Three");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeBetween(String value1, String value2) {
            addCriterion("topic14_three between", value1, value2, "topic14Three");
            return (Criteria) this;
        }

        public Criteria andTopic14ThreeNotBetween(String value1, String value2) {
            addCriterion("topic14_three not between", value1, value2, "topic14Three");
            return (Criteria) this;
        }

        public Criteria andTopic14FourIsNull() {
            addCriterion("topic14_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic14FourIsNotNull() {
            addCriterion("topic14_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic14FourEqualTo(String value) {
            addCriterion("topic14_four =", value, "topic14Four");
            return (Criteria) this;
        }

        public Criteria andTopic14FourNotEqualTo(String value) {
            addCriterion("topic14_four <>", value, "topic14Four");
            return (Criteria) this;
        }

        public Criteria andTopic14FourGreaterThan(String value) {
            addCriterion("topic14_four >", value, "topic14Four");
            return (Criteria) this;
        }

        public Criteria andTopic14FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic14_four >=", value, "topic14Four");
            return (Criteria) this;
        }

        public Criteria andTopic14FourLessThan(String value) {
            addCriterion("topic14_four <", value, "topic14Four");
            return (Criteria) this;
        }

        public Criteria andTopic14FourLessThanOrEqualTo(String value) {
            addCriterion("topic14_four <=", value, "topic14Four");
            return (Criteria) this;
        }

        public Criteria andTopic14FourLike(String value) {
            addCriterion("topic14_four like", value, "topic14Four");
            return (Criteria) this;
        }

        public Criteria andTopic14FourNotLike(String value) {
            addCriterion("topic14_four not like", value, "topic14Four");
            return (Criteria) this;
        }

        public Criteria andTopic14FourIn(List<String> values) {
            addCriterion("topic14_four in", values, "topic14Four");
            return (Criteria) this;
        }

        public Criteria andTopic14FourNotIn(List<String> values) {
            addCriterion("topic14_four not in", values, "topic14Four");
            return (Criteria) this;
        }

        public Criteria andTopic14FourBetween(String value1, String value2) {
            addCriterion("topic14_four between", value1, value2, "topic14Four");
            return (Criteria) this;
        }

        public Criteria andTopic14FourNotBetween(String value1, String value2) {
            addCriterion("topic14_four not between", value1, value2, "topic14Four");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionIsNull() {
            addCriterion("topic14_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionIsNotNull() {
            addCriterion("topic14_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionEqualTo(String value) {
            addCriterion("topic14_fraction =", value, "topic14Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionNotEqualTo(String value) {
            addCriterion("topic14_fraction <>", value, "topic14Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionGreaterThan(String value) {
            addCriterion("topic14_fraction >", value, "topic14Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic14_fraction >=", value, "topic14Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionLessThan(String value) {
            addCriterion("topic14_fraction <", value, "topic14Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionLessThanOrEqualTo(String value) {
            addCriterion("topic14_fraction <=", value, "topic14Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionLike(String value) {
            addCriterion("topic14_fraction like", value, "topic14Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionNotLike(String value) {
            addCriterion("topic14_fraction not like", value, "topic14Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionIn(List<String> values) {
            addCriterion("topic14_fraction in", values, "topic14Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionNotIn(List<String> values) {
            addCriterion("topic14_fraction not in", values, "topic14Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionBetween(String value1, String value2) {
            addCriterion("topic14_fraction between", value1, value2, "topic14Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic14FractionNotBetween(String value1, String value2) {
            addCriterion("topic14_fraction not between", value1, value2, "topic14Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic14SixIsNull() {
            addCriterion("topic14_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic14SixIsNotNull() {
            addCriterion("topic14_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic14SixEqualTo(String value) {
            addCriterion("topic14_six =", value, "topic14Six");
            return (Criteria) this;
        }

        public Criteria andTopic14SixNotEqualTo(String value) {
            addCriterion("topic14_six <>", value, "topic14Six");
            return (Criteria) this;
        }

        public Criteria andTopic14SixGreaterThan(String value) {
            addCriterion("topic14_six >", value, "topic14Six");
            return (Criteria) this;
        }

        public Criteria andTopic14SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic14_six >=", value, "topic14Six");
            return (Criteria) this;
        }

        public Criteria andTopic14SixLessThan(String value) {
            addCriterion("topic14_six <", value, "topic14Six");
            return (Criteria) this;
        }

        public Criteria andTopic14SixLessThanOrEqualTo(String value) {
            addCriterion("topic14_six <=", value, "topic14Six");
            return (Criteria) this;
        }

        public Criteria andTopic14SixLike(String value) {
            addCriterion("topic14_six like", value, "topic14Six");
            return (Criteria) this;
        }

        public Criteria andTopic14SixNotLike(String value) {
            addCriterion("topic14_six not like", value, "topic14Six");
            return (Criteria) this;
        }

        public Criteria andTopic14SixIn(List<String> values) {
            addCriterion("topic14_six in", values, "topic14Six");
            return (Criteria) this;
        }

        public Criteria andTopic14SixNotIn(List<String> values) {
            addCriterion("topic14_six not in", values, "topic14Six");
            return (Criteria) this;
        }

        public Criteria andTopic14SixBetween(String value1, String value2) {
            addCriterion("topic14_six between", value1, value2, "topic14Six");
            return (Criteria) this;
        }

        public Criteria andTopic14SixNotBetween(String value1, String value2) {
            addCriterion("topic14_six not between", value1, value2, "topic14Six");
            return (Criteria) this;
        }

        public Criteria andTopic15OneIsNull() {
            addCriterion("topic15_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic15OneIsNotNull() {
            addCriterion("topic15_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic15OneEqualTo(String value) {
            addCriterion("topic15_one =", value, "topic15One");
            return (Criteria) this;
        }

        public Criteria andTopic15OneNotEqualTo(String value) {
            addCriterion("topic15_one <>", value, "topic15One");
            return (Criteria) this;
        }

        public Criteria andTopic15OneGreaterThan(String value) {
            addCriterion("topic15_one >", value, "topic15One");
            return (Criteria) this;
        }

        public Criteria andTopic15OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic15_one >=", value, "topic15One");
            return (Criteria) this;
        }

        public Criteria andTopic15OneLessThan(String value) {
            addCriterion("topic15_one <", value, "topic15One");
            return (Criteria) this;
        }

        public Criteria andTopic15OneLessThanOrEqualTo(String value) {
            addCriterion("topic15_one <=", value, "topic15One");
            return (Criteria) this;
        }

        public Criteria andTopic15OneLike(String value) {
            addCriterion("topic15_one like", value, "topic15One");
            return (Criteria) this;
        }

        public Criteria andTopic15OneNotLike(String value) {
            addCriterion("topic15_one not like", value, "topic15One");
            return (Criteria) this;
        }

        public Criteria andTopic15OneIn(List<String> values) {
            addCriterion("topic15_one in", values, "topic15One");
            return (Criteria) this;
        }

        public Criteria andTopic15OneNotIn(List<String> values) {
            addCriterion("topic15_one not in", values, "topic15One");
            return (Criteria) this;
        }

        public Criteria andTopic15OneBetween(String value1, String value2) {
            addCriterion("topic15_one between", value1, value2, "topic15One");
            return (Criteria) this;
        }

        public Criteria andTopic15OneNotBetween(String value1, String value2) {
            addCriterion("topic15_one not between", value1, value2, "topic15One");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoIsNull() {
            addCriterion("topic15_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoIsNotNull() {
            addCriterion("topic15_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoEqualTo(String value) {
            addCriterion("topic15_two =", value, "topic15Two");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoNotEqualTo(String value) {
            addCriterion("topic15_two <>", value, "topic15Two");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoGreaterThan(String value) {
            addCriterion("topic15_two >", value, "topic15Two");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic15_two >=", value, "topic15Two");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoLessThan(String value) {
            addCriterion("topic15_two <", value, "topic15Two");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoLessThanOrEqualTo(String value) {
            addCriterion("topic15_two <=", value, "topic15Two");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoLike(String value) {
            addCriterion("topic15_two like", value, "topic15Two");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoNotLike(String value) {
            addCriterion("topic15_two not like", value, "topic15Two");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoIn(List<String> values) {
            addCriterion("topic15_two in", values, "topic15Two");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoNotIn(List<String> values) {
            addCriterion("topic15_two not in", values, "topic15Two");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoBetween(String value1, String value2) {
            addCriterion("topic15_two between", value1, value2, "topic15Two");
            return (Criteria) this;
        }

        public Criteria andTopic15TwoNotBetween(String value1, String value2) {
            addCriterion("topic15_two not between", value1, value2, "topic15Two");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeIsNull() {
            addCriterion("topic15_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeIsNotNull() {
            addCriterion("topic15_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeEqualTo(String value) {
            addCriterion("topic15_three =", value, "topic15Three");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeNotEqualTo(String value) {
            addCriterion("topic15_three <>", value, "topic15Three");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeGreaterThan(String value) {
            addCriterion("topic15_three >", value, "topic15Three");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic15_three >=", value, "topic15Three");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeLessThan(String value) {
            addCriterion("topic15_three <", value, "topic15Three");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic15_three <=", value, "topic15Three");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeLike(String value) {
            addCriterion("topic15_three like", value, "topic15Three");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeNotLike(String value) {
            addCriterion("topic15_three not like", value, "topic15Three");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeIn(List<String> values) {
            addCriterion("topic15_three in", values, "topic15Three");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeNotIn(List<String> values) {
            addCriterion("topic15_three not in", values, "topic15Three");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeBetween(String value1, String value2) {
            addCriterion("topic15_three between", value1, value2, "topic15Three");
            return (Criteria) this;
        }

        public Criteria andTopic15ThreeNotBetween(String value1, String value2) {
            addCriterion("topic15_three not between", value1, value2, "topic15Three");
            return (Criteria) this;
        }

        public Criteria andTopic15FourIsNull() {
            addCriterion("topic15_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic15FourIsNotNull() {
            addCriterion("topic15_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic15FourEqualTo(String value) {
            addCriterion("topic15_four =", value, "topic15Four");
            return (Criteria) this;
        }

        public Criteria andTopic15FourNotEqualTo(String value) {
            addCriterion("topic15_four <>", value, "topic15Four");
            return (Criteria) this;
        }

        public Criteria andTopic15FourGreaterThan(String value) {
            addCriterion("topic15_four >", value, "topic15Four");
            return (Criteria) this;
        }

        public Criteria andTopic15FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic15_four >=", value, "topic15Four");
            return (Criteria) this;
        }

        public Criteria andTopic15FourLessThan(String value) {
            addCriterion("topic15_four <", value, "topic15Four");
            return (Criteria) this;
        }

        public Criteria andTopic15FourLessThanOrEqualTo(String value) {
            addCriterion("topic15_four <=", value, "topic15Four");
            return (Criteria) this;
        }

        public Criteria andTopic15FourLike(String value) {
            addCriterion("topic15_four like", value, "topic15Four");
            return (Criteria) this;
        }

        public Criteria andTopic15FourNotLike(String value) {
            addCriterion("topic15_four not like", value, "topic15Four");
            return (Criteria) this;
        }

        public Criteria andTopic15FourIn(List<String> values) {
            addCriterion("topic15_four in", values, "topic15Four");
            return (Criteria) this;
        }

        public Criteria andTopic15FourNotIn(List<String> values) {
            addCriterion("topic15_four not in", values, "topic15Four");
            return (Criteria) this;
        }

        public Criteria andTopic15FourBetween(String value1, String value2) {
            addCriterion("topic15_four between", value1, value2, "topic15Four");
            return (Criteria) this;
        }

        public Criteria andTopic15FourNotBetween(String value1, String value2) {
            addCriterion("topic15_four not between", value1, value2, "topic15Four");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionIsNull() {
            addCriterion("topic15_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionIsNotNull() {
            addCriterion("topic15_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionEqualTo(String value) {
            addCriterion("topic15_fraction =", value, "topic15Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionNotEqualTo(String value) {
            addCriterion("topic15_fraction <>", value, "topic15Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionGreaterThan(String value) {
            addCriterion("topic15_fraction >", value, "topic15Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic15_fraction >=", value, "topic15Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionLessThan(String value) {
            addCriterion("topic15_fraction <", value, "topic15Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionLessThanOrEqualTo(String value) {
            addCriterion("topic15_fraction <=", value, "topic15Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionLike(String value) {
            addCriterion("topic15_fraction like", value, "topic15Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionNotLike(String value) {
            addCriterion("topic15_fraction not like", value, "topic15Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionIn(List<String> values) {
            addCriterion("topic15_fraction in", values, "topic15Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionNotIn(List<String> values) {
            addCriterion("topic15_fraction not in", values, "topic15Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionBetween(String value1, String value2) {
            addCriterion("topic15_fraction between", value1, value2, "topic15Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic15FractionNotBetween(String value1, String value2) {
            addCriterion("topic15_fraction not between", value1, value2, "topic15Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic15SixIsNull() {
            addCriterion("topic15_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic15SixIsNotNull() {
            addCriterion("topic15_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic15SixEqualTo(String value) {
            addCriterion("topic15_six =", value, "topic15Six");
            return (Criteria) this;
        }

        public Criteria andTopic15SixNotEqualTo(String value) {
            addCriterion("topic15_six <>", value, "topic15Six");
            return (Criteria) this;
        }

        public Criteria andTopic15SixGreaterThan(String value) {
            addCriterion("topic15_six >", value, "topic15Six");
            return (Criteria) this;
        }

        public Criteria andTopic15SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic15_six >=", value, "topic15Six");
            return (Criteria) this;
        }

        public Criteria andTopic15SixLessThan(String value) {
            addCriterion("topic15_six <", value, "topic15Six");
            return (Criteria) this;
        }

        public Criteria andTopic15SixLessThanOrEqualTo(String value) {
            addCriterion("topic15_six <=", value, "topic15Six");
            return (Criteria) this;
        }

        public Criteria andTopic15SixLike(String value) {
            addCriterion("topic15_six like", value, "topic15Six");
            return (Criteria) this;
        }

        public Criteria andTopic15SixNotLike(String value) {
            addCriterion("topic15_six not like", value, "topic15Six");
            return (Criteria) this;
        }

        public Criteria andTopic15SixIn(List<String> values) {
            addCriterion("topic15_six in", values, "topic15Six");
            return (Criteria) this;
        }

        public Criteria andTopic15SixNotIn(List<String> values) {
            addCriterion("topic15_six not in", values, "topic15Six");
            return (Criteria) this;
        }

        public Criteria andTopic15SixBetween(String value1, String value2) {
            addCriterion("topic15_six between", value1, value2, "topic15Six");
            return (Criteria) this;
        }

        public Criteria andTopic15SixNotBetween(String value1, String value2) {
            addCriterion("topic15_six not between", value1, value2, "topic15Six");
            return (Criteria) this;
        }

        public Criteria andTopic16OneIsNull() {
            addCriterion("topic16_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic16OneIsNotNull() {
            addCriterion("topic16_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic16OneEqualTo(String value) {
            addCriterion("topic16_one =", value, "topic16One");
            return (Criteria) this;
        }

        public Criteria andTopic16OneNotEqualTo(String value) {
            addCriterion("topic16_one <>", value, "topic16One");
            return (Criteria) this;
        }

        public Criteria andTopic16OneGreaterThan(String value) {
            addCriterion("topic16_one >", value, "topic16One");
            return (Criteria) this;
        }

        public Criteria andTopic16OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic16_one >=", value, "topic16One");
            return (Criteria) this;
        }

        public Criteria andTopic16OneLessThan(String value) {
            addCriterion("topic16_one <", value, "topic16One");
            return (Criteria) this;
        }

        public Criteria andTopic16OneLessThanOrEqualTo(String value) {
            addCriterion("topic16_one <=", value, "topic16One");
            return (Criteria) this;
        }

        public Criteria andTopic16OneLike(String value) {
            addCriterion("topic16_one like", value, "topic16One");
            return (Criteria) this;
        }

        public Criteria andTopic16OneNotLike(String value) {
            addCriterion("topic16_one not like", value, "topic16One");
            return (Criteria) this;
        }

        public Criteria andTopic16OneIn(List<String> values) {
            addCriterion("topic16_one in", values, "topic16One");
            return (Criteria) this;
        }

        public Criteria andTopic16OneNotIn(List<String> values) {
            addCriterion("topic16_one not in", values, "topic16One");
            return (Criteria) this;
        }

        public Criteria andTopic16OneBetween(String value1, String value2) {
            addCriterion("topic16_one between", value1, value2, "topic16One");
            return (Criteria) this;
        }

        public Criteria andTopic16OneNotBetween(String value1, String value2) {
            addCriterion("topic16_one not between", value1, value2, "topic16One");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoIsNull() {
            addCriterion("topic16_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoIsNotNull() {
            addCriterion("topic16_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoEqualTo(String value) {
            addCriterion("topic16_two =", value, "topic16Two");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoNotEqualTo(String value) {
            addCriterion("topic16_two <>", value, "topic16Two");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoGreaterThan(String value) {
            addCriterion("topic16_two >", value, "topic16Two");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic16_two >=", value, "topic16Two");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoLessThan(String value) {
            addCriterion("topic16_two <", value, "topic16Two");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoLessThanOrEqualTo(String value) {
            addCriterion("topic16_two <=", value, "topic16Two");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoLike(String value) {
            addCriterion("topic16_two like", value, "topic16Two");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoNotLike(String value) {
            addCriterion("topic16_two not like", value, "topic16Two");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoIn(List<String> values) {
            addCriterion("topic16_two in", values, "topic16Two");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoNotIn(List<String> values) {
            addCriterion("topic16_two not in", values, "topic16Two");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoBetween(String value1, String value2) {
            addCriterion("topic16_two between", value1, value2, "topic16Two");
            return (Criteria) this;
        }

        public Criteria andTopic16TwoNotBetween(String value1, String value2) {
            addCriterion("topic16_two not between", value1, value2, "topic16Two");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeIsNull() {
            addCriterion("topic16_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeIsNotNull() {
            addCriterion("topic16_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeEqualTo(String value) {
            addCriterion("topic16_three =", value, "topic16Three");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeNotEqualTo(String value) {
            addCriterion("topic16_three <>", value, "topic16Three");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeGreaterThan(String value) {
            addCriterion("topic16_three >", value, "topic16Three");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic16_three >=", value, "topic16Three");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeLessThan(String value) {
            addCriterion("topic16_three <", value, "topic16Three");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic16_three <=", value, "topic16Three");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeLike(String value) {
            addCriterion("topic16_three like", value, "topic16Three");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeNotLike(String value) {
            addCriterion("topic16_three not like", value, "topic16Three");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeIn(List<String> values) {
            addCriterion("topic16_three in", values, "topic16Three");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeNotIn(List<String> values) {
            addCriterion("topic16_three not in", values, "topic16Three");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeBetween(String value1, String value2) {
            addCriterion("topic16_three between", value1, value2, "topic16Three");
            return (Criteria) this;
        }

        public Criteria andTopic16ThreeNotBetween(String value1, String value2) {
            addCriterion("topic16_three not between", value1, value2, "topic16Three");
            return (Criteria) this;
        }

        public Criteria andTopic16FourIsNull() {
            addCriterion("topic16_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic16FourIsNotNull() {
            addCriterion("topic16_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic16FourEqualTo(String value) {
            addCriterion("topic16_four =", value, "topic16Four");
            return (Criteria) this;
        }

        public Criteria andTopic16FourNotEqualTo(String value) {
            addCriterion("topic16_four <>", value, "topic16Four");
            return (Criteria) this;
        }

        public Criteria andTopic16FourGreaterThan(String value) {
            addCriterion("topic16_four >", value, "topic16Four");
            return (Criteria) this;
        }

        public Criteria andTopic16FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic16_four >=", value, "topic16Four");
            return (Criteria) this;
        }

        public Criteria andTopic16FourLessThan(String value) {
            addCriterion("topic16_four <", value, "topic16Four");
            return (Criteria) this;
        }

        public Criteria andTopic16FourLessThanOrEqualTo(String value) {
            addCriterion("topic16_four <=", value, "topic16Four");
            return (Criteria) this;
        }

        public Criteria andTopic16FourLike(String value) {
            addCriterion("topic16_four like", value, "topic16Four");
            return (Criteria) this;
        }

        public Criteria andTopic16FourNotLike(String value) {
            addCriterion("topic16_four not like", value, "topic16Four");
            return (Criteria) this;
        }

        public Criteria andTopic16FourIn(List<String> values) {
            addCriterion("topic16_four in", values, "topic16Four");
            return (Criteria) this;
        }

        public Criteria andTopic16FourNotIn(List<String> values) {
            addCriterion("topic16_four not in", values, "topic16Four");
            return (Criteria) this;
        }

        public Criteria andTopic16FourBetween(String value1, String value2) {
            addCriterion("topic16_four between", value1, value2, "topic16Four");
            return (Criteria) this;
        }

        public Criteria andTopic16FourNotBetween(String value1, String value2) {
            addCriterion("topic16_four not between", value1, value2, "topic16Four");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionIsNull() {
            addCriterion("topic16_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionIsNotNull() {
            addCriterion("topic16_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionEqualTo(String value) {
            addCriterion("topic16_fraction =", value, "topic16Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionNotEqualTo(String value) {
            addCriterion("topic16_fraction <>", value, "topic16Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionGreaterThan(String value) {
            addCriterion("topic16_fraction >", value, "topic16Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic16_fraction >=", value, "topic16Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionLessThan(String value) {
            addCriterion("topic16_fraction <", value, "topic16Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionLessThanOrEqualTo(String value) {
            addCriterion("topic16_fraction <=", value, "topic16Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionLike(String value) {
            addCriterion("topic16_fraction like", value, "topic16Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionNotLike(String value) {
            addCriterion("topic16_fraction not like", value, "topic16Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionIn(List<String> values) {
            addCriterion("topic16_fraction in", values, "topic16Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionNotIn(List<String> values) {
            addCriterion("topic16_fraction not in", values, "topic16Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionBetween(String value1, String value2) {
            addCriterion("topic16_fraction between", value1, value2, "topic16Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic16FractionNotBetween(String value1, String value2) {
            addCriterion("topic16_fraction not between", value1, value2, "topic16Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic16SixIsNull() {
            addCriterion("topic16_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic16SixIsNotNull() {
            addCriterion("topic16_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic16SixEqualTo(String value) {
            addCriterion("topic16_six =", value, "topic16Six");
            return (Criteria) this;
        }

        public Criteria andTopic16SixNotEqualTo(String value) {
            addCriterion("topic16_six <>", value, "topic16Six");
            return (Criteria) this;
        }

        public Criteria andTopic16SixGreaterThan(String value) {
            addCriterion("topic16_six >", value, "topic16Six");
            return (Criteria) this;
        }

        public Criteria andTopic16SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic16_six >=", value, "topic16Six");
            return (Criteria) this;
        }

        public Criteria andTopic16SixLessThan(String value) {
            addCriterion("topic16_six <", value, "topic16Six");
            return (Criteria) this;
        }

        public Criteria andTopic16SixLessThanOrEqualTo(String value) {
            addCriterion("topic16_six <=", value, "topic16Six");
            return (Criteria) this;
        }

        public Criteria andTopic16SixLike(String value) {
            addCriterion("topic16_six like", value, "topic16Six");
            return (Criteria) this;
        }

        public Criteria andTopic16SixNotLike(String value) {
            addCriterion("topic16_six not like", value, "topic16Six");
            return (Criteria) this;
        }

        public Criteria andTopic16SixIn(List<String> values) {
            addCriterion("topic16_six in", values, "topic16Six");
            return (Criteria) this;
        }

        public Criteria andTopic16SixNotIn(List<String> values) {
            addCriterion("topic16_six not in", values, "topic16Six");
            return (Criteria) this;
        }

        public Criteria andTopic16SixBetween(String value1, String value2) {
            addCriterion("topic16_six between", value1, value2, "topic16Six");
            return (Criteria) this;
        }

        public Criteria andTopic16SixNotBetween(String value1, String value2) {
            addCriterion("topic16_six not between", value1, value2, "topic16Six");
            return (Criteria) this;
        }

        public Criteria andTopic17OneIsNull() {
            addCriterion("topic17_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic17OneIsNotNull() {
            addCriterion("topic17_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic17OneEqualTo(String value) {
            addCriterion("topic17_one =", value, "topic17One");
            return (Criteria) this;
        }

        public Criteria andTopic17OneNotEqualTo(String value) {
            addCriterion("topic17_one <>", value, "topic17One");
            return (Criteria) this;
        }

        public Criteria andTopic17OneGreaterThan(String value) {
            addCriterion("topic17_one >", value, "topic17One");
            return (Criteria) this;
        }

        public Criteria andTopic17OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic17_one >=", value, "topic17One");
            return (Criteria) this;
        }

        public Criteria andTopic17OneLessThan(String value) {
            addCriterion("topic17_one <", value, "topic17One");
            return (Criteria) this;
        }

        public Criteria andTopic17OneLessThanOrEqualTo(String value) {
            addCriterion("topic17_one <=", value, "topic17One");
            return (Criteria) this;
        }

        public Criteria andTopic17OneLike(String value) {
            addCriterion("topic17_one like", value, "topic17One");
            return (Criteria) this;
        }

        public Criteria andTopic17OneNotLike(String value) {
            addCriterion("topic17_one not like", value, "topic17One");
            return (Criteria) this;
        }

        public Criteria andTopic17OneIn(List<String> values) {
            addCriterion("topic17_one in", values, "topic17One");
            return (Criteria) this;
        }

        public Criteria andTopic17OneNotIn(List<String> values) {
            addCriterion("topic17_one not in", values, "topic17One");
            return (Criteria) this;
        }

        public Criteria andTopic17OneBetween(String value1, String value2) {
            addCriterion("topic17_one between", value1, value2, "topic17One");
            return (Criteria) this;
        }

        public Criteria andTopic17OneNotBetween(String value1, String value2) {
            addCriterion("topic17_one not between", value1, value2, "topic17One");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoIsNull() {
            addCriterion("topic17_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoIsNotNull() {
            addCriterion("topic17_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoEqualTo(String value) {
            addCriterion("topic17_two =", value, "topic17Two");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoNotEqualTo(String value) {
            addCriterion("topic17_two <>", value, "topic17Two");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoGreaterThan(String value) {
            addCriterion("topic17_two >", value, "topic17Two");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic17_two >=", value, "topic17Two");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoLessThan(String value) {
            addCriterion("topic17_two <", value, "topic17Two");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoLessThanOrEqualTo(String value) {
            addCriterion("topic17_two <=", value, "topic17Two");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoLike(String value) {
            addCriterion("topic17_two like", value, "topic17Two");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoNotLike(String value) {
            addCriterion("topic17_two not like", value, "topic17Two");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoIn(List<String> values) {
            addCriterion("topic17_two in", values, "topic17Two");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoNotIn(List<String> values) {
            addCriterion("topic17_two not in", values, "topic17Two");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoBetween(String value1, String value2) {
            addCriterion("topic17_two between", value1, value2, "topic17Two");
            return (Criteria) this;
        }

        public Criteria andTopic17TwoNotBetween(String value1, String value2) {
            addCriterion("topic17_two not between", value1, value2, "topic17Two");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeIsNull() {
            addCriterion("topic17_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeIsNotNull() {
            addCriterion("topic17_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeEqualTo(String value) {
            addCriterion("topic17_three =", value, "topic17Three");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeNotEqualTo(String value) {
            addCriterion("topic17_three <>", value, "topic17Three");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeGreaterThan(String value) {
            addCriterion("topic17_three >", value, "topic17Three");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic17_three >=", value, "topic17Three");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeLessThan(String value) {
            addCriterion("topic17_three <", value, "topic17Three");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic17_three <=", value, "topic17Three");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeLike(String value) {
            addCriterion("topic17_three like", value, "topic17Three");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeNotLike(String value) {
            addCriterion("topic17_three not like", value, "topic17Three");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeIn(List<String> values) {
            addCriterion("topic17_three in", values, "topic17Three");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeNotIn(List<String> values) {
            addCriterion("topic17_three not in", values, "topic17Three");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeBetween(String value1, String value2) {
            addCriterion("topic17_three between", value1, value2, "topic17Three");
            return (Criteria) this;
        }

        public Criteria andTopic17ThreeNotBetween(String value1, String value2) {
            addCriterion("topic17_three not between", value1, value2, "topic17Three");
            return (Criteria) this;
        }

        public Criteria andTopic17FourIsNull() {
            addCriterion("topic17_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic17FourIsNotNull() {
            addCriterion("topic17_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic17FourEqualTo(String value) {
            addCriterion("topic17_four =", value, "topic17Four");
            return (Criteria) this;
        }

        public Criteria andTopic17FourNotEqualTo(String value) {
            addCriterion("topic17_four <>", value, "topic17Four");
            return (Criteria) this;
        }

        public Criteria andTopic17FourGreaterThan(String value) {
            addCriterion("topic17_four >", value, "topic17Four");
            return (Criteria) this;
        }

        public Criteria andTopic17FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic17_four >=", value, "topic17Four");
            return (Criteria) this;
        }

        public Criteria andTopic17FourLessThan(String value) {
            addCriterion("topic17_four <", value, "topic17Four");
            return (Criteria) this;
        }

        public Criteria andTopic17FourLessThanOrEqualTo(String value) {
            addCriterion("topic17_four <=", value, "topic17Four");
            return (Criteria) this;
        }

        public Criteria andTopic17FourLike(String value) {
            addCriterion("topic17_four like", value, "topic17Four");
            return (Criteria) this;
        }

        public Criteria andTopic17FourNotLike(String value) {
            addCriterion("topic17_four not like", value, "topic17Four");
            return (Criteria) this;
        }

        public Criteria andTopic17FourIn(List<String> values) {
            addCriterion("topic17_four in", values, "topic17Four");
            return (Criteria) this;
        }

        public Criteria andTopic17FourNotIn(List<String> values) {
            addCriterion("topic17_four not in", values, "topic17Four");
            return (Criteria) this;
        }

        public Criteria andTopic17FourBetween(String value1, String value2) {
            addCriterion("topic17_four between", value1, value2, "topic17Four");
            return (Criteria) this;
        }

        public Criteria andTopic17FourNotBetween(String value1, String value2) {
            addCriterion("topic17_four not between", value1, value2, "topic17Four");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionIsNull() {
            addCriterion("topic17_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionIsNotNull() {
            addCriterion("topic17_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionEqualTo(String value) {
            addCriterion("topic17_fraction =", value, "topic17Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionNotEqualTo(String value) {
            addCriterion("topic17_fraction <>", value, "topic17Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionGreaterThan(String value) {
            addCriterion("topic17_fraction >", value, "topic17Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic17_fraction >=", value, "topic17Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionLessThan(String value) {
            addCriterion("topic17_fraction <", value, "topic17Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionLessThanOrEqualTo(String value) {
            addCriterion("topic17_fraction <=", value, "topic17Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionLike(String value) {
            addCriterion("topic17_fraction like", value, "topic17Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionNotLike(String value) {
            addCriterion("topic17_fraction not like", value, "topic17Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionIn(List<String> values) {
            addCriterion("topic17_fraction in", values, "topic17Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionNotIn(List<String> values) {
            addCriterion("topic17_fraction not in", values, "topic17Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionBetween(String value1, String value2) {
            addCriterion("topic17_fraction between", value1, value2, "topic17Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic17FractionNotBetween(String value1, String value2) {
            addCriterion("topic17_fraction not between", value1, value2, "topic17Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic17SixIsNull() {
            addCriterion("topic17_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic17SixIsNotNull() {
            addCriterion("topic17_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic17SixEqualTo(String value) {
            addCriterion("topic17_six =", value, "topic17Six");
            return (Criteria) this;
        }

        public Criteria andTopic17SixNotEqualTo(String value) {
            addCriterion("topic17_six <>", value, "topic17Six");
            return (Criteria) this;
        }

        public Criteria andTopic17SixGreaterThan(String value) {
            addCriterion("topic17_six >", value, "topic17Six");
            return (Criteria) this;
        }

        public Criteria andTopic17SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic17_six >=", value, "topic17Six");
            return (Criteria) this;
        }

        public Criteria andTopic17SixLessThan(String value) {
            addCriterion("topic17_six <", value, "topic17Six");
            return (Criteria) this;
        }

        public Criteria andTopic17SixLessThanOrEqualTo(String value) {
            addCriterion("topic17_six <=", value, "topic17Six");
            return (Criteria) this;
        }

        public Criteria andTopic17SixLike(String value) {
            addCriterion("topic17_six like", value, "topic17Six");
            return (Criteria) this;
        }

        public Criteria andTopic17SixNotLike(String value) {
            addCriterion("topic17_six not like", value, "topic17Six");
            return (Criteria) this;
        }

        public Criteria andTopic17SixIn(List<String> values) {
            addCriterion("topic17_six in", values, "topic17Six");
            return (Criteria) this;
        }

        public Criteria andTopic17SixNotIn(List<String> values) {
            addCriterion("topic17_six not in", values, "topic17Six");
            return (Criteria) this;
        }

        public Criteria andTopic17SixBetween(String value1, String value2) {
            addCriterion("topic17_six between", value1, value2, "topic17Six");
            return (Criteria) this;
        }

        public Criteria andTopic17SixNotBetween(String value1, String value2) {
            addCriterion("topic17_six not between", value1, value2, "topic17Six");
            return (Criteria) this;
        }

        public Criteria andTopic18OneIsNull() {
            addCriterion("topic18_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic18OneIsNotNull() {
            addCriterion("topic18_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic18OneEqualTo(String value) {
            addCriterion("topic18_one =", value, "topic18One");
            return (Criteria) this;
        }

        public Criteria andTopic18OneNotEqualTo(String value) {
            addCriterion("topic18_one <>", value, "topic18One");
            return (Criteria) this;
        }

        public Criteria andTopic18OneGreaterThan(String value) {
            addCriterion("topic18_one >", value, "topic18One");
            return (Criteria) this;
        }

        public Criteria andTopic18OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic18_one >=", value, "topic18One");
            return (Criteria) this;
        }

        public Criteria andTopic18OneLessThan(String value) {
            addCriterion("topic18_one <", value, "topic18One");
            return (Criteria) this;
        }

        public Criteria andTopic18OneLessThanOrEqualTo(String value) {
            addCriterion("topic18_one <=", value, "topic18One");
            return (Criteria) this;
        }

        public Criteria andTopic18OneLike(String value) {
            addCriterion("topic18_one like", value, "topic18One");
            return (Criteria) this;
        }

        public Criteria andTopic18OneNotLike(String value) {
            addCriterion("topic18_one not like", value, "topic18One");
            return (Criteria) this;
        }

        public Criteria andTopic18OneIn(List<String> values) {
            addCriterion("topic18_one in", values, "topic18One");
            return (Criteria) this;
        }

        public Criteria andTopic18OneNotIn(List<String> values) {
            addCriterion("topic18_one not in", values, "topic18One");
            return (Criteria) this;
        }

        public Criteria andTopic18OneBetween(String value1, String value2) {
            addCriterion("topic18_one between", value1, value2, "topic18One");
            return (Criteria) this;
        }

        public Criteria andTopic18OneNotBetween(String value1, String value2) {
            addCriterion("topic18_one not between", value1, value2, "topic18One");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoIsNull() {
            addCriterion("topic18_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoIsNotNull() {
            addCriterion("topic18_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoEqualTo(String value) {
            addCriterion("topic18_two =", value, "topic18Two");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoNotEqualTo(String value) {
            addCriterion("topic18_two <>", value, "topic18Two");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoGreaterThan(String value) {
            addCriterion("topic18_two >", value, "topic18Two");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic18_two >=", value, "topic18Two");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoLessThan(String value) {
            addCriterion("topic18_two <", value, "topic18Two");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoLessThanOrEqualTo(String value) {
            addCriterion("topic18_two <=", value, "topic18Two");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoLike(String value) {
            addCriterion("topic18_two like", value, "topic18Two");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoNotLike(String value) {
            addCriterion("topic18_two not like", value, "topic18Two");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoIn(List<String> values) {
            addCriterion("topic18_two in", values, "topic18Two");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoNotIn(List<String> values) {
            addCriterion("topic18_two not in", values, "topic18Two");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoBetween(String value1, String value2) {
            addCriterion("topic18_two between", value1, value2, "topic18Two");
            return (Criteria) this;
        }

        public Criteria andTopic18TwoNotBetween(String value1, String value2) {
            addCriterion("topic18_two not between", value1, value2, "topic18Two");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeIsNull() {
            addCriterion("topic18_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeIsNotNull() {
            addCriterion("topic18_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeEqualTo(String value) {
            addCriterion("topic18_three =", value, "topic18Three");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeNotEqualTo(String value) {
            addCriterion("topic18_three <>", value, "topic18Three");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeGreaterThan(String value) {
            addCriterion("topic18_three >", value, "topic18Three");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic18_three >=", value, "topic18Three");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeLessThan(String value) {
            addCriterion("topic18_three <", value, "topic18Three");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic18_three <=", value, "topic18Three");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeLike(String value) {
            addCriterion("topic18_three like", value, "topic18Three");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeNotLike(String value) {
            addCriterion("topic18_three not like", value, "topic18Three");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeIn(List<String> values) {
            addCriterion("topic18_three in", values, "topic18Three");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeNotIn(List<String> values) {
            addCriterion("topic18_three not in", values, "topic18Three");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeBetween(String value1, String value2) {
            addCriterion("topic18_three between", value1, value2, "topic18Three");
            return (Criteria) this;
        }

        public Criteria andTopic18ThreeNotBetween(String value1, String value2) {
            addCriterion("topic18_three not between", value1, value2, "topic18Three");
            return (Criteria) this;
        }

        public Criteria andTopic18FourIsNull() {
            addCriterion("topic18_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic18FourIsNotNull() {
            addCriterion("topic18_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic18FourEqualTo(String value) {
            addCriterion("topic18_four =", value, "topic18Four");
            return (Criteria) this;
        }

        public Criteria andTopic18FourNotEqualTo(String value) {
            addCriterion("topic18_four <>", value, "topic18Four");
            return (Criteria) this;
        }

        public Criteria andTopic18FourGreaterThan(String value) {
            addCriterion("topic18_four >", value, "topic18Four");
            return (Criteria) this;
        }

        public Criteria andTopic18FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic18_four >=", value, "topic18Four");
            return (Criteria) this;
        }

        public Criteria andTopic18FourLessThan(String value) {
            addCriterion("topic18_four <", value, "topic18Four");
            return (Criteria) this;
        }

        public Criteria andTopic18FourLessThanOrEqualTo(String value) {
            addCriterion("topic18_four <=", value, "topic18Four");
            return (Criteria) this;
        }

        public Criteria andTopic18FourLike(String value) {
            addCriterion("topic18_four like", value, "topic18Four");
            return (Criteria) this;
        }

        public Criteria andTopic18FourNotLike(String value) {
            addCriterion("topic18_four not like", value, "topic18Four");
            return (Criteria) this;
        }

        public Criteria andTopic18FourIn(List<String> values) {
            addCriterion("topic18_four in", values, "topic18Four");
            return (Criteria) this;
        }

        public Criteria andTopic18FourNotIn(List<String> values) {
            addCriterion("topic18_four not in", values, "topic18Four");
            return (Criteria) this;
        }

        public Criteria andTopic18FourBetween(String value1, String value2) {
            addCriterion("topic18_four between", value1, value2, "topic18Four");
            return (Criteria) this;
        }

        public Criteria andTopic18FourNotBetween(String value1, String value2) {
            addCriterion("topic18_four not between", value1, value2, "topic18Four");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionIsNull() {
            addCriterion("topic18_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionIsNotNull() {
            addCriterion("topic18_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionEqualTo(String value) {
            addCriterion("topic18_fraction =", value, "topic18Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionNotEqualTo(String value) {
            addCriterion("topic18_fraction <>", value, "topic18Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionGreaterThan(String value) {
            addCriterion("topic18_fraction >", value, "topic18Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic18_fraction >=", value, "topic18Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionLessThan(String value) {
            addCriterion("topic18_fraction <", value, "topic18Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionLessThanOrEqualTo(String value) {
            addCriterion("topic18_fraction <=", value, "topic18Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionLike(String value) {
            addCriterion("topic18_fraction like", value, "topic18Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionNotLike(String value) {
            addCriterion("topic18_fraction not like", value, "topic18Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionIn(List<String> values) {
            addCriterion("topic18_fraction in", values, "topic18Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionNotIn(List<String> values) {
            addCriterion("topic18_fraction not in", values, "topic18Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionBetween(String value1, String value2) {
            addCriterion("topic18_fraction between", value1, value2, "topic18Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic18FractionNotBetween(String value1, String value2) {
            addCriterion("topic18_fraction not between", value1, value2, "topic18Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic18SixIsNull() {
            addCriterion("topic18_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic18SixIsNotNull() {
            addCriterion("topic18_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic18SixEqualTo(String value) {
            addCriterion("topic18_six =", value, "topic18Six");
            return (Criteria) this;
        }

        public Criteria andTopic18SixNotEqualTo(String value) {
            addCriterion("topic18_six <>", value, "topic18Six");
            return (Criteria) this;
        }

        public Criteria andTopic18SixGreaterThan(String value) {
            addCriterion("topic18_six >", value, "topic18Six");
            return (Criteria) this;
        }

        public Criteria andTopic18SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic18_six >=", value, "topic18Six");
            return (Criteria) this;
        }

        public Criteria andTopic18SixLessThan(String value) {
            addCriterion("topic18_six <", value, "topic18Six");
            return (Criteria) this;
        }

        public Criteria andTopic18SixLessThanOrEqualTo(String value) {
            addCriterion("topic18_six <=", value, "topic18Six");
            return (Criteria) this;
        }

        public Criteria andTopic18SixLike(String value) {
            addCriterion("topic18_six like", value, "topic18Six");
            return (Criteria) this;
        }

        public Criteria andTopic18SixNotLike(String value) {
            addCriterion("topic18_six not like", value, "topic18Six");
            return (Criteria) this;
        }

        public Criteria andTopic18SixIn(List<String> values) {
            addCriterion("topic18_six in", values, "topic18Six");
            return (Criteria) this;
        }

        public Criteria andTopic18SixNotIn(List<String> values) {
            addCriterion("topic18_six not in", values, "topic18Six");
            return (Criteria) this;
        }

        public Criteria andTopic18SixBetween(String value1, String value2) {
            addCriterion("topic18_six between", value1, value2, "topic18Six");
            return (Criteria) this;
        }

        public Criteria andTopic18SixNotBetween(String value1, String value2) {
            addCriterion("topic18_six not between", value1, value2, "topic18Six");
            return (Criteria) this;
        }

        public Criteria andTopic19OneIsNull() {
            addCriterion("topic19_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic19OneIsNotNull() {
            addCriterion("topic19_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic19OneEqualTo(String value) {
            addCriterion("topic19_one =", value, "topic19One");
            return (Criteria) this;
        }

        public Criteria andTopic19OneNotEqualTo(String value) {
            addCriterion("topic19_one <>", value, "topic19One");
            return (Criteria) this;
        }

        public Criteria andTopic19OneGreaterThan(String value) {
            addCriterion("topic19_one >", value, "topic19One");
            return (Criteria) this;
        }

        public Criteria andTopic19OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic19_one >=", value, "topic19One");
            return (Criteria) this;
        }

        public Criteria andTopic19OneLessThan(String value) {
            addCriterion("topic19_one <", value, "topic19One");
            return (Criteria) this;
        }

        public Criteria andTopic19OneLessThanOrEqualTo(String value) {
            addCriterion("topic19_one <=", value, "topic19One");
            return (Criteria) this;
        }

        public Criteria andTopic19OneLike(String value) {
            addCriterion("topic19_one like", value, "topic19One");
            return (Criteria) this;
        }

        public Criteria andTopic19OneNotLike(String value) {
            addCriterion("topic19_one not like", value, "topic19One");
            return (Criteria) this;
        }

        public Criteria andTopic19OneIn(List<String> values) {
            addCriterion("topic19_one in", values, "topic19One");
            return (Criteria) this;
        }

        public Criteria andTopic19OneNotIn(List<String> values) {
            addCriterion("topic19_one not in", values, "topic19One");
            return (Criteria) this;
        }

        public Criteria andTopic19OneBetween(String value1, String value2) {
            addCriterion("topic19_one between", value1, value2, "topic19One");
            return (Criteria) this;
        }

        public Criteria andTopic19OneNotBetween(String value1, String value2) {
            addCriterion("topic19_one not between", value1, value2, "topic19One");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoIsNull() {
            addCriterion("topic19_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoIsNotNull() {
            addCriterion("topic19_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoEqualTo(String value) {
            addCriterion("topic19_two =", value, "topic19Two");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoNotEqualTo(String value) {
            addCriterion("topic19_two <>", value, "topic19Two");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoGreaterThan(String value) {
            addCriterion("topic19_two >", value, "topic19Two");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic19_two >=", value, "topic19Two");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoLessThan(String value) {
            addCriterion("topic19_two <", value, "topic19Two");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoLessThanOrEqualTo(String value) {
            addCriterion("topic19_two <=", value, "topic19Two");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoLike(String value) {
            addCriterion("topic19_two like", value, "topic19Two");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoNotLike(String value) {
            addCriterion("topic19_two not like", value, "topic19Two");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoIn(List<String> values) {
            addCriterion("topic19_two in", values, "topic19Two");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoNotIn(List<String> values) {
            addCriterion("topic19_two not in", values, "topic19Two");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoBetween(String value1, String value2) {
            addCriterion("topic19_two between", value1, value2, "topic19Two");
            return (Criteria) this;
        }

        public Criteria andTopic19TwoNotBetween(String value1, String value2) {
            addCriterion("topic19_two not between", value1, value2, "topic19Two");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeIsNull() {
            addCriterion("topic19_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeIsNotNull() {
            addCriterion("topic19_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeEqualTo(String value) {
            addCriterion("topic19_three =", value, "topic19Three");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeNotEqualTo(String value) {
            addCriterion("topic19_three <>", value, "topic19Three");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeGreaterThan(String value) {
            addCriterion("topic19_three >", value, "topic19Three");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic19_three >=", value, "topic19Three");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeLessThan(String value) {
            addCriterion("topic19_three <", value, "topic19Three");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic19_three <=", value, "topic19Three");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeLike(String value) {
            addCriterion("topic19_three like", value, "topic19Three");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeNotLike(String value) {
            addCriterion("topic19_three not like", value, "topic19Three");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeIn(List<String> values) {
            addCriterion("topic19_three in", values, "topic19Three");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeNotIn(List<String> values) {
            addCriterion("topic19_three not in", values, "topic19Three");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeBetween(String value1, String value2) {
            addCriterion("topic19_three between", value1, value2, "topic19Three");
            return (Criteria) this;
        }

        public Criteria andTopic19ThreeNotBetween(String value1, String value2) {
            addCriterion("topic19_three not between", value1, value2, "topic19Three");
            return (Criteria) this;
        }

        public Criteria andTopic19FourIsNull() {
            addCriterion("topic19_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic19FourIsNotNull() {
            addCriterion("topic19_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic19FourEqualTo(String value) {
            addCriterion("topic19_four =", value, "topic19Four");
            return (Criteria) this;
        }

        public Criteria andTopic19FourNotEqualTo(String value) {
            addCriterion("topic19_four <>", value, "topic19Four");
            return (Criteria) this;
        }

        public Criteria andTopic19FourGreaterThan(String value) {
            addCriterion("topic19_four >", value, "topic19Four");
            return (Criteria) this;
        }

        public Criteria andTopic19FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic19_four >=", value, "topic19Four");
            return (Criteria) this;
        }

        public Criteria andTopic19FourLessThan(String value) {
            addCriterion("topic19_four <", value, "topic19Four");
            return (Criteria) this;
        }

        public Criteria andTopic19FourLessThanOrEqualTo(String value) {
            addCriterion("topic19_four <=", value, "topic19Four");
            return (Criteria) this;
        }

        public Criteria andTopic19FourLike(String value) {
            addCriterion("topic19_four like", value, "topic19Four");
            return (Criteria) this;
        }

        public Criteria andTopic19FourNotLike(String value) {
            addCriterion("topic19_four not like", value, "topic19Four");
            return (Criteria) this;
        }

        public Criteria andTopic19FourIn(List<String> values) {
            addCriterion("topic19_four in", values, "topic19Four");
            return (Criteria) this;
        }

        public Criteria andTopic19FourNotIn(List<String> values) {
            addCriterion("topic19_four not in", values, "topic19Four");
            return (Criteria) this;
        }

        public Criteria andTopic19FourBetween(String value1, String value2) {
            addCriterion("topic19_four between", value1, value2, "topic19Four");
            return (Criteria) this;
        }

        public Criteria andTopic19FourNotBetween(String value1, String value2) {
            addCriterion("topic19_four not between", value1, value2, "topic19Four");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionIsNull() {
            addCriterion("topic19_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionIsNotNull() {
            addCriterion("topic19_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionEqualTo(String value) {
            addCriterion("topic19_fraction =", value, "topic19Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionNotEqualTo(String value) {
            addCriterion("topic19_fraction <>", value, "topic19Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionGreaterThan(String value) {
            addCriterion("topic19_fraction >", value, "topic19Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic19_fraction >=", value, "topic19Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionLessThan(String value) {
            addCriterion("topic19_fraction <", value, "topic19Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionLessThanOrEqualTo(String value) {
            addCriterion("topic19_fraction <=", value, "topic19Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionLike(String value) {
            addCriterion("topic19_fraction like", value, "topic19Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionNotLike(String value) {
            addCriterion("topic19_fraction not like", value, "topic19Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionIn(List<String> values) {
            addCriterion("topic19_fraction in", values, "topic19Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionNotIn(List<String> values) {
            addCriterion("topic19_fraction not in", values, "topic19Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionBetween(String value1, String value2) {
            addCriterion("topic19_fraction between", value1, value2, "topic19Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic19FractionNotBetween(String value1, String value2) {
            addCriterion("topic19_fraction not between", value1, value2, "topic19Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic19SixIsNull() {
            addCriterion("topic19_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic19SixIsNotNull() {
            addCriterion("topic19_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic19SixEqualTo(String value) {
            addCriterion("topic19_six =", value, "topic19Six");
            return (Criteria) this;
        }

        public Criteria andTopic19SixNotEqualTo(String value) {
            addCriterion("topic19_six <>", value, "topic19Six");
            return (Criteria) this;
        }

        public Criteria andTopic19SixGreaterThan(String value) {
            addCriterion("topic19_six >", value, "topic19Six");
            return (Criteria) this;
        }

        public Criteria andTopic19SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic19_six >=", value, "topic19Six");
            return (Criteria) this;
        }

        public Criteria andTopic19SixLessThan(String value) {
            addCriterion("topic19_six <", value, "topic19Six");
            return (Criteria) this;
        }

        public Criteria andTopic19SixLessThanOrEqualTo(String value) {
            addCriterion("topic19_six <=", value, "topic19Six");
            return (Criteria) this;
        }

        public Criteria andTopic19SixLike(String value) {
            addCriterion("topic19_six like", value, "topic19Six");
            return (Criteria) this;
        }

        public Criteria andTopic19SixNotLike(String value) {
            addCriterion("topic19_six not like", value, "topic19Six");
            return (Criteria) this;
        }

        public Criteria andTopic19SixIn(List<String> values) {
            addCriterion("topic19_six in", values, "topic19Six");
            return (Criteria) this;
        }

        public Criteria andTopic19SixNotIn(List<String> values) {
            addCriterion("topic19_six not in", values, "topic19Six");
            return (Criteria) this;
        }

        public Criteria andTopic19SixBetween(String value1, String value2) {
            addCriterion("topic19_six between", value1, value2, "topic19Six");
            return (Criteria) this;
        }

        public Criteria andTopic19SixNotBetween(String value1, String value2) {
            addCriterion("topic19_six not between", value1, value2, "topic19Six");
            return (Criteria) this;
        }

        public Criteria andTopic20OneIsNull() {
            addCriterion("topic20_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic20OneIsNotNull() {
            addCriterion("topic20_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic20OneEqualTo(String value) {
            addCriterion("topic20_one =", value, "topic20One");
            return (Criteria) this;
        }

        public Criteria andTopic20OneNotEqualTo(String value) {
            addCriterion("topic20_one <>", value, "topic20One");
            return (Criteria) this;
        }

        public Criteria andTopic20OneGreaterThan(String value) {
            addCriterion("topic20_one >", value, "topic20One");
            return (Criteria) this;
        }

        public Criteria andTopic20OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic20_one >=", value, "topic20One");
            return (Criteria) this;
        }

        public Criteria andTopic20OneLessThan(String value) {
            addCriterion("topic20_one <", value, "topic20One");
            return (Criteria) this;
        }

        public Criteria andTopic20OneLessThanOrEqualTo(String value) {
            addCriterion("topic20_one <=", value, "topic20One");
            return (Criteria) this;
        }

        public Criteria andTopic20OneLike(String value) {
            addCriterion("topic20_one like", value, "topic20One");
            return (Criteria) this;
        }

        public Criteria andTopic20OneNotLike(String value) {
            addCriterion("topic20_one not like", value, "topic20One");
            return (Criteria) this;
        }

        public Criteria andTopic20OneIn(List<String> values) {
            addCriterion("topic20_one in", values, "topic20One");
            return (Criteria) this;
        }

        public Criteria andTopic20OneNotIn(List<String> values) {
            addCriterion("topic20_one not in", values, "topic20One");
            return (Criteria) this;
        }

        public Criteria andTopic20OneBetween(String value1, String value2) {
            addCriterion("topic20_one between", value1, value2, "topic20One");
            return (Criteria) this;
        }

        public Criteria andTopic20OneNotBetween(String value1, String value2) {
            addCriterion("topic20_one not between", value1, value2, "topic20One");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoIsNull() {
            addCriterion("topic20_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoIsNotNull() {
            addCriterion("topic20_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoEqualTo(String value) {
            addCriterion("topic20_two =", value, "topic20Two");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoNotEqualTo(String value) {
            addCriterion("topic20_two <>", value, "topic20Two");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoGreaterThan(String value) {
            addCriterion("topic20_two >", value, "topic20Two");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic20_two >=", value, "topic20Two");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoLessThan(String value) {
            addCriterion("topic20_two <", value, "topic20Two");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoLessThanOrEqualTo(String value) {
            addCriterion("topic20_two <=", value, "topic20Two");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoLike(String value) {
            addCriterion("topic20_two like", value, "topic20Two");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoNotLike(String value) {
            addCriterion("topic20_two not like", value, "topic20Two");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoIn(List<String> values) {
            addCriterion("topic20_two in", values, "topic20Two");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoNotIn(List<String> values) {
            addCriterion("topic20_two not in", values, "topic20Two");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoBetween(String value1, String value2) {
            addCriterion("topic20_two between", value1, value2, "topic20Two");
            return (Criteria) this;
        }

        public Criteria andTopic20TwoNotBetween(String value1, String value2) {
            addCriterion("topic20_two not between", value1, value2, "topic20Two");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeIsNull() {
            addCriterion("topic20_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeIsNotNull() {
            addCriterion("topic20_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeEqualTo(String value) {
            addCriterion("topic20_three =", value, "topic20Three");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeNotEqualTo(String value) {
            addCriterion("topic20_three <>", value, "topic20Three");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeGreaterThan(String value) {
            addCriterion("topic20_three >", value, "topic20Three");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic20_three >=", value, "topic20Three");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeLessThan(String value) {
            addCriterion("topic20_three <", value, "topic20Three");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic20_three <=", value, "topic20Three");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeLike(String value) {
            addCriterion("topic20_three like", value, "topic20Three");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeNotLike(String value) {
            addCriterion("topic20_three not like", value, "topic20Three");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeIn(List<String> values) {
            addCriterion("topic20_three in", values, "topic20Three");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeNotIn(List<String> values) {
            addCriterion("topic20_three not in", values, "topic20Three");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeBetween(String value1, String value2) {
            addCriterion("topic20_three between", value1, value2, "topic20Three");
            return (Criteria) this;
        }

        public Criteria andTopic20ThreeNotBetween(String value1, String value2) {
            addCriterion("topic20_three not between", value1, value2, "topic20Three");
            return (Criteria) this;
        }

        public Criteria andTopic20FourIsNull() {
            addCriterion("topic20_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic20FourIsNotNull() {
            addCriterion("topic20_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic20FourEqualTo(String value) {
            addCriterion("topic20_four =", value, "topic20Four");
            return (Criteria) this;
        }

        public Criteria andTopic20FourNotEqualTo(String value) {
            addCriterion("topic20_four <>", value, "topic20Four");
            return (Criteria) this;
        }

        public Criteria andTopic20FourGreaterThan(String value) {
            addCriterion("topic20_four >", value, "topic20Four");
            return (Criteria) this;
        }

        public Criteria andTopic20FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic20_four >=", value, "topic20Four");
            return (Criteria) this;
        }

        public Criteria andTopic20FourLessThan(String value) {
            addCriterion("topic20_four <", value, "topic20Four");
            return (Criteria) this;
        }

        public Criteria andTopic20FourLessThanOrEqualTo(String value) {
            addCriterion("topic20_four <=", value, "topic20Four");
            return (Criteria) this;
        }

        public Criteria andTopic20FourLike(String value) {
            addCriterion("topic20_four like", value, "topic20Four");
            return (Criteria) this;
        }

        public Criteria andTopic20FourNotLike(String value) {
            addCriterion("topic20_four not like", value, "topic20Four");
            return (Criteria) this;
        }

        public Criteria andTopic20FourIn(List<String> values) {
            addCriterion("topic20_four in", values, "topic20Four");
            return (Criteria) this;
        }

        public Criteria andTopic20FourNotIn(List<String> values) {
            addCriterion("topic20_four not in", values, "topic20Four");
            return (Criteria) this;
        }

        public Criteria andTopic20FourBetween(String value1, String value2) {
            addCriterion("topic20_four between", value1, value2, "topic20Four");
            return (Criteria) this;
        }

        public Criteria andTopic20FourNotBetween(String value1, String value2) {
            addCriterion("topic20_four not between", value1, value2, "topic20Four");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionIsNull() {
            addCriterion("topic20_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionIsNotNull() {
            addCriterion("topic20_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionEqualTo(String value) {
            addCriterion("topic20_fraction =", value, "topic20Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionNotEqualTo(String value) {
            addCriterion("topic20_fraction <>", value, "topic20Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionGreaterThan(String value) {
            addCriterion("topic20_fraction >", value, "topic20Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic20_fraction >=", value, "topic20Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionLessThan(String value) {
            addCriterion("topic20_fraction <", value, "topic20Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionLessThanOrEqualTo(String value) {
            addCriterion("topic20_fraction <=", value, "topic20Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionLike(String value) {
            addCriterion("topic20_fraction like", value, "topic20Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionNotLike(String value) {
            addCriterion("topic20_fraction not like", value, "topic20Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionIn(List<String> values) {
            addCriterion("topic20_fraction in", values, "topic20Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionNotIn(List<String> values) {
            addCriterion("topic20_fraction not in", values, "topic20Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionBetween(String value1, String value2) {
            addCriterion("topic20_fraction between", value1, value2, "topic20Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic20FractionNotBetween(String value1, String value2) {
            addCriterion("topic20_fraction not between", value1, value2, "topic20Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic20SixIsNull() {
            addCriterion("topic20_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic20SixIsNotNull() {
            addCriterion("topic20_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic20SixEqualTo(String value) {
            addCriterion("topic20_six =", value, "topic20Six");
            return (Criteria) this;
        }

        public Criteria andTopic20SixNotEqualTo(String value) {
            addCriterion("topic20_six <>", value, "topic20Six");
            return (Criteria) this;
        }

        public Criteria andTopic20SixGreaterThan(String value) {
            addCriterion("topic20_six >", value, "topic20Six");
            return (Criteria) this;
        }

        public Criteria andTopic20SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic20_six >=", value, "topic20Six");
            return (Criteria) this;
        }

        public Criteria andTopic20SixLessThan(String value) {
            addCriterion("topic20_six <", value, "topic20Six");
            return (Criteria) this;
        }

        public Criteria andTopic20SixLessThanOrEqualTo(String value) {
            addCriterion("topic20_six <=", value, "topic20Six");
            return (Criteria) this;
        }

        public Criteria andTopic20SixLike(String value) {
            addCriterion("topic20_six like", value, "topic20Six");
            return (Criteria) this;
        }

        public Criteria andTopic20SixNotLike(String value) {
            addCriterion("topic20_six not like", value, "topic20Six");
            return (Criteria) this;
        }

        public Criteria andTopic20SixIn(List<String> values) {
            addCriterion("topic20_six in", values, "topic20Six");
            return (Criteria) this;
        }

        public Criteria andTopic20SixNotIn(List<String> values) {
            addCriterion("topic20_six not in", values, "topic20Six");
            return (Criteria) this;
        }

        public Criteria andTopic20SixBetween(String value1, String value2) {
            addCriterion("topic20_six between", value1, value2, "topic20Six");
            return (Criteria) this;
        }

        public Criteria andTopic20SixNotBetween(String value1, String value2) {
            addCriterion("topic20_six not between", value1, value2, "topic20Six");
            return (Criteria) this;
        }

        public Criteria andTopic21OneIsNull() {
            addCriterion("topic21_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic21OneIsNotNull() {
            addCriterion("topic21_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic21OneEqualTo(String value) {
            addCriterion("topic21_one =", value, "topic21One");
            return (Criteria) this;
        }

        public Criteria andTopic21OneNotEqualTo(String value) {
            addCriterion("topic21_one <>", value, "topic21One");
            return (Criteria) this;
        }

        public Criteria andTopic21OneGreaterThan(String value) {
            addCriterion("topic21_one >", value, "topic21One");
            return (Criteria) this;
        }

        public Criteria andTopic21OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic21_one >=", value, "topic21One");
            return (Criteria) this;
        }

        public Criteria andTopic21OneLessThan(String value) {
            addCriterion("topic21_one <", value, "topic21One");
            return (Criteria) this;
        }

        public Criteria andTopic21OneLessThanOrEqualTo(String value) {
            addCriterion("topic21_one <=", value, "topic21One");
            return (Criteria) this;
        }

        public Criteria andTopic21OneLike(String value) {
            addCriterion("topic21_one like", value, "topic21One");
            return (Criteria) this;
        }

        public Criteria andTopic21OneNotLike(String value) {
            addCriterion("topic21_one not like", value, "topic21One");
            return (Criteria) this;
        }

        public Criteria andTopic21OneIn(List<String> values) {
            addCriterion("topic21_one in", values, "topic21One");
            return (Criteria) this;
        }

        public Criteria andTopic21OneNotIn(List<String> values) {
            addCriterion("topic21_one not in", values, "topic21One");
            return (Criteria) this;
        }

        public Criteria andTopic21OneBetween(String value1, String value2) {
            addCriterion("topic21_one between", value1, value2, "topic21One");
            return (Criteria) this;
        }

        public Criteria andTopic21OneNotBetween(String value1, String value2) {
            addCriterion("topic21_one not between", value1, value2, "topic21One");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoIsNull() {
            addCriterion("topic21_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoIsNotNull() {
            addCriterion("topic21_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoEqualTo(String value) {
            addCriterion("topic21_two =", value, "topic21Two");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoNotEqualTo(String value) {
            addCriterion("topic21_two <>", value, "topic21Two");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoGreaterThan(String value) {
            addCriterion("topic21_two >", value, "topic21Two");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic21_two >=", value, "topic21Two");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoLessThan(String value) {
            addCriterion("topic21_two <", value, "topic21Two");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoLessThanOrEqualTo(String value) {
            addCriterion("topic21_two <=", value, "topic21Two");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoLike(String value) {
            addCriterion("topic21_two like", value, "topic21Two");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoNotLike(String value) {
            addCriterion("topic21_two not like", value, "topic21Two");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoIn(List<String> values) {
            addCriterion("topic21_two in", values, "topic21Two");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoNotIn(List<String> values) {
            addCriterion("topic21_two not in", values, "topic21Two");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoBetween(String value1, String value2) {
            addCriterion("topic21_two between", value1, value2, "topic21Two");
            return (Criteria) this;
        }

        public Criteria andTopic21TwoNotBetween(String value1, String value2) {
            addCriterion("topic21_two not between", value1, value2, "topic21Two");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeIsNull() {
            addCriterion("topic21_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeIsNotNull() {
            addCriterion("topic21_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeEqualTo(String value) {
            addCriterion("topic21_three =", value, "topic21Three");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeNotEqualTo(String value) {
            addCriterion("topic21_three <>", value, "topic21Three");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeGreaterThan(String value) {
            addCriterion("topic21_three >", value, "topic21Three");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic21_three >=", value, "topic21Three");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeLessThan(String value) {
            addCriterion("topic21_three <", value, "topic21Three");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic21_three <=", value, "topic21Three");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeLike(String value) {
            addCriterion("topic21_three like", value, "topic21Three");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeNotLike(String value) {
            addCriterion("topic21_three not like", value, "topic21Three");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeIn(List<String> values) {
            addCriterion("topic21_three in", values, "topic21Three");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeNotIn(List<String> values) {
            addCriterion("topic21_three not in", values, "topic21Three");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeBetween(String value1, String value2) {
            addCriterion("topic21_three between", value1, value2, "topic21Three");
            return (Criteria) this;
        }

        public Criteria andTopic21ThreeNotBetween(String value1, String value2) {
            addCriterion("topic21_three not between", value1, value2, "topic21Three");
            return (Criteria) this;
        }

        public Criteria andTopic21FourIsNull() {
            addCriterion("topic21_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic21FourIsNotNull() {
            addCriterion("topic21_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic21FourEqualTo(String value) {
            addCriterion("topic21_four =", value, "topic21Four");
            return (Criteria) this;
        }

        public Criteria andTopic21FourNotEqualTo(String value) {
            addCriterion("topic21_four <>", value, "topic21Four");
            return (Criteria) this;
        }

        public Criteria andTopic21FourGreaterThan(String value) {
            addCriterion("topic21_four >", value, "topic21Four");
            return (Criteria) this;
        }

        public Criteria andTopic21FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic21_four >=", value, "topic21Four");
            return (Criteria) this;
        }

        public Criteria andTopic21FourLessThan(String value) {
            addCriterion("topic21_four <", value, "topic21Four");
            return (Criteria) this;
        }

        public Criteria andTopic21FourLessThanOrEqualTo(String value) {
            addCriterion("topic21_four <=", value, "topic21Four");
            return (Criteria) this;
        }

        public Criteria andTopic21FourLike(String value) {
            addCriterion("topic21_four like", value, "topic21Four");
            return (Criteria) this;
        }

        public Criteria andTopic21FourNotLike(String value) {
            addCriterion("topic21_four not like", value, "topic21Four");
            return (Criteria) this;
        }

        public Criteria andTopic21FourIn(List<String> values) {
            addCriterion("topic21_four in", values, "topic21Four");
            return (Criteria) this;
        }

        public Criteria andTopic21FourNotIn(List<String> values) {
            addCriterion("topic21_four not in", values, "topic21Four");
            return (Criteria) this;
        }

        public Criteria andTopic21FourBetween(String value1, String value2) {
            addCriterion("topic21_four between", value1, value2, "topic21Four");
            return (Criteria) this;
        }

        public Criteria andTopic21FourNotBetween(String value1, String value2) {
            addCriterion("topic21_four not between", value1, value2, "topic21Four");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionIsNull() {
            addCriterion("topic21_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionIsNotNull() {
            addCriterion("topic21_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionEqualTo(String value) {
            addCriterion("topic21_fraction =", value, "topic21Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionNotEqualTo(String value) {
            addCriterion("topic21_fraction <>", value, "topic21Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionGreaterThan(String value) {
            addCriterion("topic21_fraction >", value, "topic21Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic21_fraction >=", value, "topic21Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionLessThan(String value) {
            addCriterion("topic21_fraction <", value, "topic21Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionLessThanOrEqualTo(String value) {
            addCriterion("topic21_fraction <=", value, "topic21Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionLike(String value) {
            addCriterion("topic21_fraction like", value, "topic21Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionNotLike(String value) {
            addCriterion("topic21_fraction not like", value, "topic21Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionIn(List<String> values) {
            addCriterion("topic21_fraction in", values, "topic21Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionNotIn(List<String> values) {
            addCriterion("topic21_fraction not in", values, "topic21Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionBetween(String value1, String value2) {
            addCriterion("topic21_fraction between", value1, value2, "topic21Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic21FractionNotBetween(String value1, String value2) {
            addCriterion("topic21_fraction not between", value1, value2, "topic21Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic21SixIsNull() {
            addCriterion("topic21_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic21SixIsNotNull() {
            addCriterion("topic21_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic21SixEqualTo(String value) {
            addCriterion("topic21_six =", value, "topic21Six");
            return (Criteria) this;
        }

        public Criteria andTopic21SixNotEqualTo(String value) {
            addCriterion("topic21_six <>", value, "topic21Six");
            return (Criteria) this;
        }

        public Criteria andTopic21SixGreaterThan(String value) {
            addCriterion("topic21_six >", value, "topic21Six");
            return (Criteria) this;
        }

        public Criteria andTopic21SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic21_six >=", value, "topic21Six");
            return (Criteria) this;
        }

        public Criteria andTopic21SixLessThan(String value) {
            addCriterion("topic21_six <", value, "topic21Six");
            return (Criteria) this;
        }

        public Criteria andTopic21SixLessThanOrEqualTo(String value) {
            addCriterion("topic21_six <=", value, "topic21Six");
            return (Criteria) this;
        }

        public Criteria andTopic21SixLike(String value) {
            addCriterion("topic21_six like", value, "topic21Six");
            return (Criteria) this;
        }

        public Criteria andTopic21SixNotLike(String value) {
            addCriterion("topic21_six not like", value, "topic21Six");
            return (Criteria) this;
        }

        public Criteria andTopic21SixIn(List<String> values) {
            addCriterion("topic21_six in", values, "topic21Six");
            return (Criteria) this;
        }

        public Criteria andTopic21SixNotIn(List<String> values) {
            addCriterion("topic21_six not in", values, "topic21Six");
            return (Criteria) this;
        }

        public Criteria andTopic21SixBetween(String value1, String value2) {
            addCriterion("topic21_six between", value1, value2, "topic21Six");
            return (Criteria) this;
        }

        public Criteria andTopic21SixNotBetween(String value1, String value2) {
            addCriterion("topic21_six not between", value1, value2, "topic21Six");
            return (Criteria) this;
        }

        public Criteria andTopic22OneIsNull() {
            addCriterion("topic22_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic22OneIsNotNull() {
            addCriterion("topic22_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic22OneEqualTo(String value) {
            addCriterion("topic22_one =", value, "topic22One");
            return (Criteria) this;
        }

        public Criteria andTopic22OneNotEqualTo(String value) {
            addCriterion("topic22_one <>", value, "topic22One");
            return (Criteria) this;
        }

        public Criteria andTopic22OneGreaterThan(String value) {
            addCriterion("topic22_one >", value, "topic22One");
            return (Criteria) this;
        }

        public Criteria andTopic22OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic22_one >=", value, "topic22One");
            return (Criteria) this;
        }

        public Criteria andTopic22OneLessThan(String value) {
            addCriterion("topic22_one <", value, "topic22One");
            return (Criteria) this;
        }

        public Criteria andTopic22OneLessThanOrEqualTo(String value) {
            addCriterion("topic22_one <=", value, "topic22One");
            return (Criteria) this;
        }

        public Criteria andTopic22OneLike(String value) {
            addCriterion("topic22_one like", value, "topic22One");
            return (Criteria) this;
        }

        public Criteria andTopic22OneNotLike(String value) {
            addCriterion("topic22_one not like", value, "topic22One");
            return (Criteria) this;
        }

        public Criteria andTopic22OneIn(List<String> values) {
            addCriterion("topic22_one in", values, "topic22One");
            return (Criteria) this;
        }

        public Criteria andTopic22OneNotIn(List<String> values) {
            addCriterion("topic22_one not in", values, "topic22One");
            return (Criteria) this;
        }

        public Criteria andTopic22OneBetween(String value1, String value2) {
            addCriterion("topic22_one between", value1, value2, "topic22One");
            return (Criteria) this;
        }

        public Criteria andTopic22OneNotBetween(String value1, String value2) {
            addCriterion("topic22_one not between", value1, value2, "topic22One");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoIsNull() {
            addCriterion("topic22_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoIsNotNull() {
            addCriterion("topic22_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoEqualTo(String value) {
            addCriterion("topic22_two =", value, "topic22Two");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoNotEqualTo(String value) {
            addCriterion("topic22_two <>", value, "topic22Two");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoGreaterThan(String value) {
            addCriterion("topic22_two >", value, "topic22Two");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic22_two >=", value, "topic22Two");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoLessThan(String value) {
            addCriterion("topic22_two <", value, "topic22Two");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoLessThanOrEqualTo(String value) {
            addCriterion("topic22_two <=", value, "topic22Two");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoLike(String value) {
            addCriterion("topic22_two like", value, "topic22Two");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoNotLike(String value) {
            addCriterion("topic22_two not like", value, "topic22Two");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoIn(List<String> values) {
            addCriterion("topic22_two in", values, "topic22Two");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoNotIn(List<String> values) {
            addCriterion("topic22_two not in", values, "topic22Two");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoBetween(String value1, String value2) {
            addCriterion("topic22_two between", value1, value2, "topic22Two");
            return (Criteria) this;
        }

        public Criteria andTopic22TwoNotBetween(String value1, String value2) {
            addCriterion("topic22_two not between", value1, value2, "topic22Two");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeIsNull() {
            addCriterion("topic22_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeIsNotNull() {
            addCriterion("topic22_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeEqualTo(String value) {
            addCriterion("topic22_three =", value, "topic22Three");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeNotEqualTo(String value) {
            addCriterion("topic22_three <>", value, "topic22Three");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeGreaterThan(String value) {
            addCriterion("topic22_three >", value, "topic22Three");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic22_three >=", value, "topic22Three");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeLessThan(String value) {
            addCriterion("topic22_three <", value, "topic22Three");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic22_three <=", value, "topic22Three");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeLike(String value) {
            addCriterion("topic22_three like", value, "topic22Three");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeNotLike(String value) {
            addCriterion("topic22_three not like", value, "topic22Three");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeIn(List<String> values) {
            addCriterion("topic22_three in", values, "topic22Three");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeNotIn(List<String> values) {
            addCriterion("topic22_three not in", values, "topic22Three");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeBetween(String value1, String value2) {
            addCriterion("topic22_three between", value1, value2, "topic22Three");
            return (Criteria) this;
        }

        public Criteria andTopic22ThreeNotBetween(String value1, String value2) {
            addCriterion("topic22_three not between", value1, value2, "topic22Three");
            return (Criteria) this;
        }

        public Criteria andTopic22FourIsNull() {
            addCriterion("topic22_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic22FourIsNotNull() {
            addCriterion("topic22_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic22FourEqualTo(String value) {
            addCriterion("topic22_four =", value, "topic22Four");
            return (Criteria) this;
        }

        public Criteria andTopic22FourNotEqualTo(String value) {
            addCriterion("topic22_four <>", value, "topic22Four");
            return (Criteria) this;
        }

        public Criteria andTopic22FourGreaterThan(String value) {
            addCriterion("topic22_four >", value, "topic22Four");
            return (Criteria) this;
        }

        public Criteria andTopic22FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic22_four >=", value, "topic22Four");
            return (Criteria) this;
        }

        public Criteria andTopic22FourLessThan(String value) {
            addCriterion("topic22_four <", value, "topic22Four");
            return (Criteria) this;
        }

        public Criteria andTopic22FourLessThanOrEqualTo(String value) {
            addCriterion("topic22_four <=", value, "topic22Four");
            return (Criteria) this;
        }

        public Criteria andTopic22FourLike(String value) {
            addCriterion("topic22_four like", value, "topic22Four");
            return (Criteria) this;
        }

        public Criteria andTopic22FourNotLike(String value) {
            addCriterion("topic22_four not like", value, "topic22Four");
            return (Criteria) this;
        }

        public Criteria andTopic22FourIn(List<String> values) {
            addCriterion("topic22_four in", values, "topic22Four");
            return (Criteria) this;
        }

        public Criteria andTopic22FourNotIn(List<String> values) {
            addCriterion("topic22_four not in", values, "topic22Four");
            return (Criteria) this;
        }

        public Criteria andTopic22FourBetween(String value1, String value2) {
            addCriterion("topic22_four between", value1, value2, "topic22Four");
            return (Criteria) this;
        }

        public Criteria andTopic22FourNotBetween(String value1, String value2) {
            addCriterion("topic22_four not between", value1, value2, "topic22Four");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionIsNull() {
            addCriterion("topic22_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionIsNotNull() {
            addCriterion("topic22_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionEqualTo(String value) {
            addCriterion("topic22_fraction =", value, "topic22Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionNotEqualTo(String value) {
            addCriterion("topic22_fraction <>", value, "topic22Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionGreaterThan(String value) {
            addCriterion("topic22_fraction >", value, "topic22Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic22_fraction >=", value, "topic22Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionLessThan(String value) {
            addCriterion("topic22_fraction <", value, "topic22Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionLessThanOrEqualTo(String value) {
            addCriterion("topic22_fraction <=", value, "topic22Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionLike(String value) {
            addCriterion("topic22_fraction like", value, "topic22Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionNotLike(String value) {
            addCriterion("topic22_fraction not like", value, "topic22Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionIn(List<String> values) {
            addCriterion("topic22_fraction in", values, "topic22Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionNotIn(List<String> values) {
            addCriterion("topic22_fraction not in", values, "topic22Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionBetween(String value1, String value2) {
            addCriterion("topic22_fraction between", value1, value2, "topic22Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic22FractionNotBetween(String value1, String value2) {
            addCriterion("topic22_fraction not between", value1, value2, "topic22Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic22SixIsNull() {
            addCriterion("topic22_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic22SixIsNotNull() {
            addCriterion("topic22_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic22SixEqualTo(String value) {
            addCriterion("topic22_six =", value, "topic22Six");
            return (Criteria) this;
        }

        public Criteria andTopic22SixNotEqualTo(String value) {
            addCriterion("topic22_six <>", value, "topic22Six");
            return (Criteria) this;
        }

        public Criteria andTopic22SixGreaterThan(String value) {
            addCriterion("topic22_six >", value, "topic22Six");
            return (Criteria) this;
        }

        public Criteria andTopic22SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic22_six >=", value, "topic22Six");
            return (Criteria) this;
        }

        public Criteria andTopic22SixLessThan(String value) {
            addCriterion("topic22_six <", value, "topic22Six");
            return (Criteria) this;
        }

        public Criteria andTopic22SixLessThanOrEqualTo(String value) {
            addCriterion("topic22_six <=", value, "topic22Six");
            return (Criteria) this;
        }

        public Criteria andTopic22SixLike(String value) {
            addCriterion("topic22_six like", value, "topic22Six");
            return (Criteria) this;
        }

        public Criteria andTopic22SixNotLike(String value) {
            addCriterion("topic22_six not like", value, "topic22Six");
            return (Criteria) this;
        }

        public Criteria andTopic22SixIn(List<String> values) {
            addCriterion("topic22_six in", values, "topic22Six");
            return (Criteria) this;
        }

        public Criteria andTopic22SixNotIn(List<String> values) {
            addCriterion("topic22_six not in", values, "topic22Six");
            return (Criteria) this;
        }

        public Criteria andTopic22SixBetween(String value1, String value2) {
            addCriterion("topic22_six between", value1, value2, "topic22Six");
            return (Criteria) this;
        }

        public Criteria andTopic22SixNotBetween(String value1, String value2) {
            addCriterion("topic22_six not between", value1, value2, "topic22Six");
            return (Criteria) this;
        }

        public Criteria andTopic23OneIsNull() {
            addCriterion("topic23_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic23OneIsNotNull() {
            addCriterion("topic23_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic23OneEqualTo(String value) {
            addCriterion("topic23_one =", value, "topic23One");
            return (Criteria) this;
        }

        public Criteria andTopic23OneNotEqualTo(String value) {
            addCriterion("topic23_one <>", value, "topic23One");
            return (Criteria) this;
        }

        public Criteria andTopic23OneGreaterThan(String value) {
            addCriterion("topic23_one >", value, "topic23One");
            return (Criteria) this;
        }

        public Criteria andTopic23OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic23_one >=", value, "topic23One");
            return (Criteria) this;
        }

        public Criteria andTopic23OneLessThan(String value) {
            addCriterion("topic23_one <", value, "topic23One");
            return (Criteria) this;
        }

        public Criteria andTopic23OneLessThanOrEqualTo(String value) {
            addCriterion("topic23_one <=", value, "topic23One");
            return (Criteria) this;
        }

        public Criteria andTopic23OneLike(String value) {
            addCriterion("topic23_one like", value, "topic23One");
            return (Criteria) this;
        }

        public Criteria andTopic23OneNotLike(String value) {
            addCriterion("topic23_one not like", value, "topic23One");
            return (Criteria) this;
        }

        public Criteria andTopic23OneIn(List<String> values) {
            addCriterion("topic23_one in", values, "topic23One");
            return (Criteria) this;
        }

        public Criteria andTopic23OneNotIn(List<String> values) {
            addCriterion("topic23_one not in", values, "topic23One");
            return (Criteria) this;
        }

        public Criteria andTopic23OneBetween(String value1, String value2) {
            addCriterion("topic23_one between", value1, value2, "topic23One");
            return (Criteria) this;
        }

        public Criteria andTopic23OneNotBetween(String value1, String value2) {
            addCriterion("topic23_one not between", value1, value2, "topic23One");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoIsNull() {
            addCriterion("topic23_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoIsNotNull() {
            addCriterion("topic23_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoEqualTo(String value) {
            addCriterion("topic23_two =", value, "topic23Two");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoNotEqualTo(String value) {
            addCriterion("topic23_two <>", value, "topic23Two");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoGreaterThan(String value) {
            addCriterion("topic23_two >", value, "topic23Two");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic23_two >=", value, "topic23Two");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoLessThan(String value) {
            addCriterion("topic23_two <", value, "topic23Two");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoLessThanOrEqualTo(String value) {
            addCriterion("topic23_two <=", value, "topic23Two");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoLike(String value) {
            addCriterion("topic23_two like", value, "topic23Two");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoNotLike(String value) {
            addCriterion("topic23_two not like", value, "topic23Two");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoIn(List<String> values) {
            addCriterion("topic23_two in", values, "topic23Two");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoNotIn(List<String> values) {
            addCriterion("topic23_two not in", values, "topic23Two");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoBetween(String value1, String value2) {
            addCriterion("topic23_two between", value1, value2, "topic23Two");
            return (Criteria) this;
        }

        public Criteria andTopic23TwoNotBetween(String value1, String value2) {
            addCriterion("topic23_two not between", value1, value2, "topic23Two");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeIsNull() {
            addCriterion("topic23_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeIsNotNull() {
            addCriterion("topic23_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeEqualTo(String value) {
            addCriterion("topic23_three =", value, "topic23Three");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeNotEqualTo(String value) {
            addCriterion("topic23_three <>", value, "topic23Three");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeGreaterThan(String value) {
            addCriterion("topic23_three >", value, "topic23Three");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic23_three >=", value, "topic23Three");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeLessThan(String value) {
            addCriterion("topic23_three <", value, "topic23Three");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic23_three <=", value, "topic23Three");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeLike(String value) {
            addCriterion("topic23_three like", value, "topic23Three");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeNotLike(String value) {
            addCriterion("topic23_three not like", value, "topic23Three");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeIn(List<String> values) {
            addCriterion("topic23_three in", values, "topic23Three");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeNotIn(List<String> values) {
            addCriterion("topic23_three not in", values, "topic23Three");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeBetween(String value1, String value2) {
            addCriterion("topic23_three between", value1, value2, "topic23Three");
            return (Criteria) this;
        }

        public Criteria andTopic23ThreeNotBetween(String value1, String value2) {
            addCriterion("topic23_three not between", value1, value2, "topic23Three");
            return (Criteria) this;
        }

        public Criteria andTopic23FourIsNull() {
            addCriterion("topic23_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic23FourIsNotNull() {
            addCriterion("topic23_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic23FourEqualTo(String value) {
            addCriterion("topic23_four =", value, "topic23Four");
            return (Criteria) this;
        }

        public Criteria andTopic23FourNotEqualTo(String value) {
            addCriterion("topic23_four <>", value, "topic23Four");
            return (Criteria) this;
        }

        public Criteria andTopic23FourGreaterThan(String value) {
            addCriterion("topic23_four >", value, "topic23Four");
            return (Criteria) this;
        }

        public Criteria andTopic23FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic23_four >=", value, "topic23Four");
            return (Criteria) this;
        }

        public Criteria andTopic23FourLessThan(String value) {
            addCriterion("topic23_four <", value, "topic23Four");
            return (Criteria) this;
        }

        public Criteria andTopic23FourLessThanOrEqualTo(String value) {
            addCriterion("topic23_four <=", value, "topic23Four");
            return (Criteria) this;
        }

        public Criteria andTopic23FourLike(String value) {
            addCriterion("topic23_four like", value, "topic23Four");
            return (Criteria) this;
        }

        public Criteria andTopic23FourNotLike(String value) {
            addCriterion("topic23_four not like", value, "topic23Four");
            return (Criteria) this;
        }

        public Criteria andTopic23FourIn(List<String> values) {
            addCriterion("topic23_four in", values, "topic23Four");
            return (Criteria) this;
        }

        public Criteria andTopic23FourNotIn(List<String> values) {
            addCriterion("topic23_four not in", values, "topic23Four");
            return (Criteria) this;
        }

        public Criteria andTopic23FourBetween(String value1, String value2) {
            addCriterion("topic23_four between", value1, value2, "topic23Four");
            return (Criteria) this;
        }

        public Criteria andTopic23FourNotBetween(String value1, String value2) {
            addCriterion("topic23_four not between", value1, value2, "topic23Four");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionIsNull() {
            addCriterion("topic23_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionIsNotNull() {
            addCriterion("topic23_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionEqualTo(String value) {
            addCriterion("topic23_fraction =", value, "topic23Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionNotEqualTo(String value) {
            addCriterion("topic23_fraction <>", value, "topic23Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionGreaterThan(String value) {
            addCriterion("topic23_fraction >", value, "topic23Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic23_fraction >=", value, "topic23Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionLessThan(String value) {
            addCriterion("topic23_fraction <", value, "topic23Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionLessThanOrEqualTo(String value) {
            addCriterion("topic23_fraction <=", value, "topic23Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionLike(String value) {
            addCriterion("topic23_fraction like", value, "topic23Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionNotLike(String value) {
            addCriterion("topic23_fraction not like", value, "topic23Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionIn(List<String> values) {
            addCriterion("topic23_fraction in", values, "topic23Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionNotIn(List<String> values) {
            addCriterion("topic23_fraction not in", values, "topic23Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionBetween(String value1, String value2) {
            addCriterion("topic23_fraction between", value1, value2, "topic23Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic23FractionNotBetween(String value1, String value2) {
            addCriterion("topic23_fraction not between", value1, value2, "topic23Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic23SixIsNull() {
            addCriterion("topic23_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic23SixIsNotNull() {
            addCriterion("topic23_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic23SixEqualTo(String value) {
            addCriterion("topic23_six =", value, "topic23Six");
            return (Criteria) this;
        }

        public Criteria andTopic23SixNotEqualTo(String value) {
            addCriterion("topic23_six <>", value, "topic23Six");
            return (Criteria) this;
        }

        public Criteria andTopic23SixGreaterThan(String value) {
            addCriterion("topic23_six >", value, "topic23Six");
            return (Criteria) this;
        }

        public Criteria andTopic23SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic23_six >=", value, "topic23Six");
            return (Criteria) this;
        }

        public Criteria andTopic23SixLessThan(String value) {
            addCriterion("topic23_six <", value, "topic23Six");
            return (Criteria) this;
        }

        public Criteria andTopic23SixLessThanOrEqualTo(String value) {
            addCriterion("topic23_six <=", value, "topic23Six");
            return (Criteria) this;
        }

        public Criteria andTopic23SixLike(String value) {
            addCriterion("topic23_six like", value, "topic23Six");
            return (Criteria) this;
        }

        public Criteria andTopic23SixNotLike(String value) {
            addCriterion("topic23_six not like", value, "topic23Six");
            return (Criteria) this;
        }

        public Criteria andTopic23SixIn(List<String> values) {
            addCriterion("topic23_six in", values, "topic23Six");
            return (Criteria) this;
        }

        public Criteria andTopic23SixNotIn(List<String> values) {
            addCriterion("topic23_six not in", values, "topic23Six");
            return (Criteria) this;
        }

        public Criteria andTopic23SixBetween(String value1, String value2) {
            addCriterion("topic23_six between", value1, value2, "topic23Six");
            return (Criteria) this;
        }

        public Criteria andTopic23SixNotBetween(String value1, String value2) {
            addCriterion("topic23_six not between", value1, value2, "topic23Six");
            return (Criteria) this;
        }

        public Criteria andTopic24OneIsNull() {
            addCriterion("topic24_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic24OneIsNotNull() {
            addCriterion("topic24_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic24OneEqualTo(String value) {
            addCriterion("topic24_one =", value, "topic24One");
            return (Criteria) this;
        }

        public Criteria andTopic24OneNotEqualTo(String value) {
            addCriterion("topic24_one <>", value, "topic24One");
            return (Criteria) this;
        }

        public Criteria andTopic24OneGreaterThan(String value) {
            addCriterion("topic24_one >", value, "topic24One");
            return (Criteria) this;
        }

        public Criteria andTopic24OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic24_one >=", value, "topic24One");
            return (Criteria) this;
        }

        public Criteria andTopic24OneLessThan(String value) {
            addCriterion("topic24_one <", value, "topic24One");
            return (Criteria) this;
        }

        public Criteria andTopic24OneLessThanOrEqualTo(String value) {
            addCriterion("topic24_one <=", value, "topic24One");
            return (Criteria) this;
        }

        public Criteria andTopic24OneLike(String value) {
            addCriterion("topic24_one like", value, "topic24One");
            return (Criteria) this;
        }

        public Criteria andTopic24OneNotLike(String value) {
            addCriterion("topic24_one not like", value, "topic24One");
            return (Criteria) this;
        }

        public Criteria andTopic24OneIn(List<String> values) {
            addCriterion("topic24_one in", values, "topic24One");
            return (Criteria) this;
        }

        public Criteria andTopic24OneNotIn(List<String> values) {
            addCriterion("topic24_one not in", values, "topic24One");
            return (Criteria) this;
        }

        public Criteria andTopic24OneBetween(String value1, String value2) {
            addCriterion("topic24_one between", value1, value2, "topic24One");
            return (Criteria) this;
        }

        public Criteria andTopic24OneNotBetween(String value1, String value2) {
            addCriterion("topic24_one not between", value1, value2, "topic24One");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoIsNull() {
            addCriterion("topic24_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoIsNotNull() {
            addCriterion("topic24_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoEqualTo(String value) {
            addCriterion("topic24_two =", value, "topic24Two");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoNotEqualTo(String value) {
            addCriterion("topic24_two <>", value, "topic24Two");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoGreaterThan(String value) {
            addCriterion("topic24_two >", value, "topic24Two");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic24_two >=", value, "topic24Two");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoLessThan(String value) {
            addCriterion("topic24_two <", value, "topic24Two");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoLessThanOrEqualTo(String value) {
            addCriterion("topic24_two <=", value, "topic24Two");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoLike(String value) {
            addCriterion("topic24_two like", value, "topic24Two");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoNotLike(String value) {
            addCriterion("topic24_two not like", value, "topic24Two");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoIn(List<String> values) {
            addCriterion("topic24_two in", values, "topic24Two");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoNotIn(List<String> values) {
            addCriterion("topic24_two not in", values, "topic24Two");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoBetween(String value1, String value2) {
            addCriterion("topic24_two between", value1, value2, "topic24Two");
            return (Criteria) this;
        }

        public Criteria andTopic24TwoNotBetween(String value1, String value2) {
            addCriterion("topic24_two not between", value1, value2, "topic24Two");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeIsNull() {
            addCriterion("topic24_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeIsNotNull() {
            addCriterion("topic24_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeEqualTo(String value) {
            addCriterion("topic24_three =", value, "topic24Three");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeNotEqualTo(String value) {
            addCriterion("topic24_three <>", value, "topic24Three");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeGreaterThan(String value) {
            addCriterion("topic24_three >", value, "topic24Three");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic24_three >=", value, "topic24Three");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeLessThan(String value) {
            addCriterion("topic24_three <", value, "topic24Three");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic24_three <=", value, "topic24Three");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeLike(String value) {
            addCriterion("topic24_three like", value, "topic24Three");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeNotLike(String value) {
            addCriterion("topic24_three not like", value, "topic24Three");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeIn(List<String> values) {
            addCriterion("topic24_three in", values, "topic24Three");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeNotIn(List<String> values) {
            addCriterion("topic24_three not in", values, "topic24Three");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeBetween(String value1, String value2) {
            addCriterion("topic24_three between", value1, value2, "topic24Three");
            return (Criteria) this;
        }

        public Criteria andTopic24ThreeNotBetween(String value1, String value2) {
            addCriterion("topic24_three not between", value1, value2, "topic24Three");
            return (Criteria) this;
        }

        public Criteria andTopic24FourIsNull() {
            addCriterion("topic24_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic24FourIsNotNull() {
            addCriterion("topic24_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic24FourEqualTo(String value) {
            addCriterion("topic24_four =", value, "topic24Four");
            return (Criteria) this;
        }

        public Criteria andTopic24FourNotEqualTo(String value) {
            addCriterion("topic24_four <>", value, "topic24Four");
            return (Criteria) this;
        }

        public Criteria andTopic24FourGreaterThan(String value) {
            addCriterion("topic24_four >", value, "topic24Four");
            return (Criteria) this;
        }

        public Criteria andTopic24FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic24_four >=", value, "topic24Four");
            return (Criteria) this;
        }

        public Criteria andTopic24FourLessThan(String value) {
            addCriterion("topic24_four <", value, "topic24Four");
            return (Criteria) this;
        }

        public Criteria andTopic24FourLessThanOrEqualTo(String value) {
            addCriterion("topic24_four <=", value, "topic24Four");
            return (Criteria) this;
        }

        public Criteria andTopic24FourLike(String value) {
            addCriterion("topic24_four like", value, "topic24Four");
            return (Criteria) this;
        }

        public Criteria andTopic24FourNotLike(String value) {
            addCriterion("topic24_four not like", value, "topic24Four");
            return (Criteria) this;
        }

        public Criteria andTopic24FourIn(List<String> values) {
            addCriterion("topic24_four in", values, "topic24Four");
            return (Criteria) this;
        }

        public Criteria andTopic24FourNotIn(List<String> values) {
            addCriterion("topic24_four not in", values, "topic24Four");
            return (Criteria) this;
        }

        public Criteria andTopic24FourBetween(String value1, String value2) {
            addCriterion("topic24_four between", value1, value2, "topic24Four");
            return (Criteria) this;
        }

        public Criteria andTopic24FourNotBetween(String value1, String value2) {
            addCriterion("topic24_four not between", value1, value2, "topic24Four");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionIsNull() {
            addCriterion("topic24_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionIsNotNull() {
            addCriterion("topic24_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionEqualTo(String value) {
            addCriterion("topic24_fraction =", value, "topic24Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionNotEqualTo(String value) {
            addCriterion("topic24_fraction <>", value, "topic24Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionGreaterThan(String value) {
            addCriterion("topic24_fraction >", value, "topic24Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic24_fraction >=", value, "topic24Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionLessThan(String value) {
            addCriterion("topic24_fraction <", value, "topic24Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionLessThanOrEqualTo(String value) {
            addCriterion("topic24_fraction <=", value, "topic24Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionLike(String value) {
            addCriterion("topic24_fraction like", value, "topic24Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionNotLike(String value) {
            addCriterion("topic24_fraction not like", value, "topic24Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionIn(List<String> values) {
            addCriterion("topic24_fraction in", values, "topic24Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionNotIn(List<String> values) {
            addCriterion("topic24_fraction not in", values, "topic24Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionBetween(String value1, String value2) {
            addCriterion("topic24_fraction between", value1, value2, "topic24Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic24FractionNotBetween(String value1, String value2) {
            addCriterion("topic24_fraction not between", value1, value2, "topic24Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic24SixIsNull() {
            addCriterion("topic24_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic24SixIsNotNull() {
            addCriterion("topic24_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic24SixEqualTo(String value) {
            addCriterion("topic24_six =", value, "topic24Six");
            return (Criteria) this;
        }

        public Criteria andTopic24SixNotEqualTo(String value) {
            addCriterion("topic24_six <>", value, "topic24Six");
            return (Criteria) this;
        }

        public Criteria andTopic24SixGreaterThan(String value) {
            addCriterion("topic24_six >", value, "topic24Six");
            return (Criteria) this;
        }

        public Criteria andTopic24SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic24_six >=", value, "topic24Six");
            return (Criteria) this;
        }

        public Criteria andTopic24SixLessThan(String value) {
            addCriterion("topic24_six <", value, "topic24Six");
            return (Criteria) this;
        }

        public Criteria andTopic24SixLessThanOrEqualTo(String value) {
            addCriterion("topic24_six <=", value, "topic24Six");
            return (Criteria) this;
        }

        public Criteria andTopic24SixLike(String value) {
            addCriterion("topic24_six like", value, "topic24Six");
            return (Criteria) this;
        }

        public Criteria andTopic24SixNotLike(String value) {
            addCriterion("topic24_six not like", value, "topic24Six");
            return (Criteria) this;
        }

        public Criteria andTopic24SixIn(List<String> values) {
            addCriterion("topic24_six in", values, "topic24Six");
            return (Criteria) this;
        }

        public Criteria andTopic24SixNotIn(List<String> values) {
            addCriterion("topic24_six not in", values, "topic24Six");
            return (Criteria) this;
        }

        public Criteria andTopic24SixBetween(String value1, String value2) {
            addCriterion("topic24_six between", value1, value2, "topic24Six");
            return (Criteria) this;
        }

        public Criteria andTopic24SixNotBetween(String value1, String value2) {
            addCriterion("topic24_six not between", value1, value2, "topic24Six");
            return (Criteria) this;
        }

        public Criteria andTopic25OneIsNull() {
            addCriterion("topic25_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic25OneIsNotNull() {
            addCriterion("topic25_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic25OneEqualTo(String value) {
            addCriterion("topic25_one =", value, "topic25One");
            return (Criteria) this;
        }

        public Criteria andTopic25OneNotEqualTo(String value) {
            addCriterion("topic25_one <>", value, "topic25One");
            return (Criteria) this;
        }

        public Criteria andTopic25OneGreaterThan(String value) {
            addCriterion("topic25_one >", value, "topic25One");
            return (Criteria) this;
        }

        public Criteria andTopic25OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic25_one >=", value, "topic25One");
            return (Criteria) this;
        }

        public Criteria andTopic25OneLessThan(String value) {
            addCriterion("topic25_one <", value, "topic25One");
            return (Criteria) this;
        }

        public Criteria andTopic25OneLessThanOrEqualTo(String value) {
            addCriterion("topic25_one <=", value, "topic25One");
            return (Criteria) this;
        }

        public Criteria andTopic25OneLike(String value) {
            addCriterion("topic25_one like", value, "topic25One");
            return (Criteria) this;
        }

        public Criteria andTopic25OneNotLike(String value) {
            addCriterion("topic25_one not like", value, "topic25One");
            return (Criteria) this;
        }

        public Criteria andTopic25OneIn(List<String> values) {
            addCriterion("topic25_one in", values, "topic25One");
            return (Criteria) this;
        }

        public Criteria andTopic25OneNotIn(List<String> values) {
            addCriterion("topic25_one not in", values, "topic25One");
            return (Criteria) this;
        }

        public Criteria andTopic25OneBetween(String value1, String value2) {
            addCriterion("topic25_one between", value1, value2, "topic25One");
            return (Criteria) this;
        }

        public Criteria andTopic25OneNotBetween(String value1, String value2) {
            addCriterion("topic25_one not between", value1, value2, "topic25One");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoIsNull() {
            addCriterion("topic25_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoIsNotNull() {
            addCriterion("topic25_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoEqualTo(String value) {
            addCriterion("topic25_two =", value, "topic25Two");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoNotEqualTo(String value) {
            addCriterion("topic25_two <>", value, "topic25Two");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoGreaterThan(String value) {
            addCriterion("topic25_two >", value, "topic25Two");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic25_two >=", value, "topic25Two");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoLessThan(String value) {
            addCriterion("topic25_two <", value, "topic25Two");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoLessThanOrEqualTo(String value) {
            addCriterion("topic25_two <=", value, "topic25Two");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoLike(String value) {
            addCriterion("topic25_two like", value, "topic25Two");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoNotLike(String value) {
            addCriterion("topic25_two not like", value, "topic25Two");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoIn(List<String> values) {
            addCriterion("topic25_two in", values, "topic25Two");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoNotIn(List<String> values) {
            addCriterion("topic25_two not in", values, "topic25Two");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoBetween(String value1, String value2) {
            addCriterion("topic25_two between", value1, value2, "topic25Two");
            return (Criteria) this;
        }

        public Criteria andTopic25TwoNotBetween(String value1, String value2) {
            addCriterion("topic25_two not between", value1, value2, "topic25Two");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeIsNull() {
            addCriterion("topic25_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeIsNotNull() {
            addCriterion("topic25_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeEqualTo(String value) {
            addCriterion("topic25_three =", value, "topic25Three");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeNotEqualTo(String value) {
            addCriterion("topic25_three <>", value, "topic25Three");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeGreaterThan(String value) {
            addCriterion("topic25_three >", value, "topic25Three");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic25_three >=", value, "topic25Three");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeLessThan(String value) {
            addCriterion("topic25_three <", value, "topic25Three");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic25_three <=", value, "topic25Three");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeLike(String value) {
            addCriterion("topic25_three like", value, "topic25Three");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeNotLike(String value) {
            addCriterion("topic25_three not like", value, "topic25Three");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeIn(List<String> values) {
            addCriterion("topic25_three in", values, "topic25Three");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeNotIn(List<String> values) {
            addCriterion("topic25_three not in", values, "topic25Three");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeBetween(String value1, String value2) {
            addCriterion("topic25_three between", value1, value2, "topic25Three");
            return (Criteria) this;
        }

        public Criteria andTopic25ThreeNotBetween(String value1, String value2) {
            addCriterion("topic25_three not between", value1, value2, "topic25Three");
            return (Criteria) this;
        }

        public Criteria andTopic25FourIsNull() {
            addCriterion("topic25_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic25FourIsNotNull() {
            addCriterion("topic25_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic25FourEqualTo(String value) {
            addCriterion("topic25_four =", value, "topic25Four");
            return (Criteria) this;
        }

        public Criteria andTopic25FourNotEqualTo(String value) {
            addCriterion("topic25_four <>", value, "topic25Four");
            return (Criteria) this;
        }

        public Criteria andTopic25FourGreaterThan(String value) {
            addCriterion("topic25_four >", value, "topic25Four");
            return (Criteria) this;
        }

        public Criteria andTopic25FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic25_four >=", value, "topic25Four");
            return (Criteria) this;
        }

        public Criteria andTopic25FourLessThan(String value) {
            addCriterion("topic25_four <", value, "topic25Four");
            return (Criteria) this;
        }

        public Criteria andTopic25FourLessThanOrEqualTo(String value) {
            addCriterion("topic25_four <=", value, "topic25Four");
            return (Criteria) this;
        }

        public Criteria andTopic25FourLike(String value) {
            addCriterion("topic25_four like", value, "topic25Four");
            return (Criteria) this;
        }

        public Criteria andTopic25FourNotLike(String value) {
            addCriterion("topic25_four not like", value, "topic25Four");
            return (Criteria) this;
        }

        public Criteria andTopic25FourIn(List<String> values) {
            addCriterion("topic25_four in", values, "topic25Four");
            return (Criteria) this;
        }

        public Criteria andTopic25FourNotIn(List<String> values) {
            addCriterion("topic25_four not in", values, "topic25Four");
            return (Criteria) this;
        }

        public Criteria andTopic25FourBetween(String value1, String value2) {
            addCriterion("topic25_four between", value1, value2, "topic25Four");
            return (Criteria) this;
        }

        public Criteria andTopic25FourNotBetween(String value1, String value2) {
            addCriterion("topic25_four not between", value1, value2, "topic25Four");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionIsNull() {
            addCriterion("topic25_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionIsNotNull() {
            addCriterion("topic25_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionEqualTo(String value) {
            addCriterion("topic25_fraction =", value, "topic25Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionNotEqualTo(String value) {
            addCriterion("topic25_fraction <>", value, "topic25Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionGreaterThan(String value) {
            addCriterion("topic25_fraction >", value, "topic25Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic25_fraction >=", value, "topic25Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionLessThan(String value) {
            addCriterion("topic25_fraction <", value, "topic25Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionLessThanOrEqualTo(String value) {
            addCriterion("topic25_fraction <=", value, "topic25Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionLike(String value) {
            addCriterion("topic25_fraction like", value, "topic25Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionNotLike(String value) {
            addCriterion("topic25_fraction not like", value, "topic25Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionIn(List<String> values) {
            addCriterion("topic25_fraction in", values, "topic25Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionNotIn(List<String> values) {
            addCriterion("topic25_fraction not in", values, "topic25Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionBetween(String value1, String value2) {
            addCriterion("topic25_fraction between", value1, value2, "topic25Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic25FractionNotBetween(String value1, String value2) {
            addCriterion("topic25_fraction not between", value1, value2, "topic25Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic25SixIsNull() {
            addCriterion("topic25_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic25SixIsNotNull() {
            addCriterion("topic25_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic25SixEqualTo(String value) {
            addCriterion("topic25_six =", value, "topic25Six");
            return (Criteria) this;
        }

        public Criteria andTopic25SixNotEqualTo(String value) {
            addCriterion("topic25_six <>", value, "topic25Six");
            return (Criteria) this;
        }

        public Criteria andTopic25SixGreaterThan(String value) {
            addCriterion("topic25_six >", value, "topic25Six");
            return (Criteria) this;
        }

        public Criteria andTopic25SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic25_six >=", value, "topic25Six");
            return (Criteria) this;
        }

        public Criteria andTopic25SixLessThan(String value) {
            addCriterion("topic25_six <", value, "topic25Six");
            return (Criteria) this;
        }

        public Criteria andTopic25SixLessThanOrEqualTo(String value) {
            addCriterion("topic25_six <=", value, "topic25Six");
            return (Criteria) this;
        }

        public Criteria andTopic25SixLike(String value) {
            addCriterion("topic25_six like", value, "topic25Six");
            return (Criteria) this;
        }

        public Criteria andTopic25SixNotLike(String value) {
            addCriterion("topic25_six not like", value, "topic25Six");
            return (Criteria) this;
        }

        public Criteria andTopic25SixIn(List<String> values) {
            addCriterion("topic25_six in", values, "topic25Six");
            return (Criteria) this;
        }

        public Criteria andTopic25SixNotIn(List<String> values) {
            addCriterion("topic25_six not in", values, "topic25Six");
            return (Criteria) this;
        }

        public Criteria andTopic25SixBetween(String value1, String value2) {
            addCriterion("topic25_six between", value1, value2, "topic25Six");
            return (Criteria) this;
        }

        public Criteria andTopic25SixNotBetween(String value1, String value2) {
            addCriterion("topic25_six not between", value1, value2, "topic25Six");
            return (Criteria) this;
        }

        public Criteria andTopic26OneIsNull() {
            addCriterion("topic26_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic26OneIsNotNull() {
            addCriterion("topic26_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic26OneEqualTo(String value) {
            addCriterion("topic26_one =", value, "topic26One");
            return (Criteria) this;
        }

        public Criteria andTopic26OneNotEqualTo(String value) {
            addCriterion("topic26_one <>", value, "topic26One");
            return (Criteria) this;
        }

        public Criteria andTopic26OneGreaterThan(String value) {
            addCriterion("topic26_one >", value, "topic26One");
            return (Criteria) this;
        }

        public Criteria andTopic26OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic26_one >=", value, "topic26One");
            return (Criteria) this;
        }

        public Criteria andTopic26OneLessThan(String value) {
            addCriterion("topic26_one <", value, "topic26One");
            return (Criteria) this;
        }

        public Criteria andTopic26OneLessThanOrEqualTo(String value) {
            addCriterion("topic26_one <=", value, "topic26One");
            return (Criteria) this;
        }

        public Criteria andTopic26OneLike(String value) {
            addCriterion("topic26_one like", value, "topic26One");
            return (Criteria) this;
        }

        public Criteria andTopic26OneNotLike(String value) {
            addCriterion("topic26_one not like", value, "topic26One");
            return (Criteria) this;
        }

        public Criteria andTopic26OneIn(List<String> values) {
            addCriterion("topic26_one in", values, "topic26One");
            return (Criteria) this;
        }

        public Criteria andTopic26OneNotIn(List<String> values) {
            addCriterion("topic26_one not in", values, "topic26One");
            return (Criteria) this;
        }

        public Criteria andTopic26OneBetween(String value1, String value2) {
            addCriterion("topic26_one between", value1, value2, "topic26One");
            return (Criteria) this;
        }

        public Criteria andTopic26OneNotBetween(String value1, String value2) {
            addCriterion("topic26_one not between", value1, value2, "topic26One");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoIsNull() {
            addCriterion("topic26_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoIsNotNull() {
            addCriterion("topic26_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoEqualTo(String value) {
            addCriterion("topic26_two =", value, "topic26Two");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoNotEqualTo(String value) {
            addCriterion("topic26_two <>", value, "topic26Two");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoGreaterThan(String value) {
            addCriterion("topic26_two >", value, "topic26Two");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic26_two >=", value, "topic26Two");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoLessThan(String value) {
            addCriterion("topic26_two <", value, "topic26Two");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoLessThanOrEqualTo(String value) {
            addCriterion("topic26_two <=", value, "topic26Two");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoLike(String value) {
            addCriterion("topic26_two like", value, "topic26Two");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoNotLike(String value) {
            addCriterion("topic26_two not like", value, "topic26Two");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoIn(List<String> values) {
            addCriterion("topic26_two in", values, "topic26Two");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoNotIn(List<String> values) {
            addCriterion("topic26_two not in", values, "topic26Two");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoBetween(String value1, String value2) {
            addCriterion("topic26_two between", value1, value2, "topic26Two");
            return (Criteria) this;
        }

        public Criteria andTopic26TwoNotBetween(String value1, String value2) {
            addCriterion("topic26_two not between", value1, value2, "topic26Two");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeIsNull() {
            addCriterion("topic26_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeIsNotNull() {
            addCriterion("topic26_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeEqualTo(String value) {
            addCriterion("topic26_three =", value, "topic26Three");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeNotEqualTo(String value) {
            addCriterion("topic26_three <>", value, "topic26Three");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeGreaterThan(String value) {
            addCriterion("topic26_three >", value, "topic26Three");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic26_three >=", value, "topic26Three");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeLessThan(String value) {
            addCriterion("topic26_three <", value, "topic26Three");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic26_three <=", value, "topic26Three");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeLike(String value) {
            addCriterion("topic26_three like", value, "topic26Three");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeNotLike(String value) {
            addCriterion("topic26_three not like", value, "topic26Three");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeIn(List<String> values) {
            addCriterion("topic26_three in", values, "topic26Three");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeNotIn(List<String> values) {
            addCriterion("topic26_three not in", values, "topic26Three");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeBetween(String value1, String value2) {
            addCriterion("topic26_three between", value1, value2, "topic26Three");
            return (Criteria) this;
        }

        public Criteria andTopic26ThreeNotBetween(String value1, String value2) {
            addCriterion("topic26_three not between", value1, value2, "topic26Three");
            return (Criteria) this;
        }

        public Criteria andTopic26FourIsNull() {
            addCriterion("topic26_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic26FourIsNotNull() {
            addCriterion("topic26_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic26FourEqualTo(String value) {
            addCriterion("topic26_four =", value, "topic26Four");
            return (Criteria) this;
        }

        public Criteria andTopic26FourNotEqualTo(String value) {
            addCriterion("topic26_four <>", value, "topic26Four");
            return (Criteria) this;
        }

        public Criteria andTopic26FourGreaterThan(String value) {
            addCriterion("topic26_four >", value, "topic26Four");
            return (Criteria) this;
        }

        public Criteria andTopic26FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic26_four >=", value, "topic26Four");
            return (Criteria) this;
        }

        public Criteria andTopic26FourLessThan(String value) {
            addCriterion("topic26_four <", value, "topic26Four");
            return (Criteria) this;
        }

        public Criteria andTopic26FourLessThanOrEqualTo(String value) {
            addCriterion("topic26_four <=", value, "topic26Four");
            return (Criteria) this;
        }

        public Criteria andTopic26FourLike(String value) {
            addCriterion("topic26_four like", value, "topic26Four");
            return (Criteria) this;
        }

        public Criteria andTopic26FourNotLike(String value) {
            addCriterion("topic26_four not like", value, "topic26Four");
            return (Criteria) this;
        }

        public Criteria andTopic26FourIn(List<String> values) {
            addCriterion("topic26_four in", values, "topic26Four");
            return (Criteria) this;
        }

        public Criteria andTopic26FourNotIn(List<String> values) {
            addCriterion("topic26_four not in", values, "topic26Four");
            return (Criteria) this;
        }

        public Criteria andTopic26FourBetween(String value1, String value2) {
            addCriterion("topic26_four between", value1, value2, "topic26Four");
            return (Criteria) this;
        }

        public Criteria andTopic26FourNotBetween(String value1, String value2) {
            addCriterion("topic26_four not between", value1, value2, "topic26Four");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionIsNull() {
            addCriterion("topic26_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionIsNotNull() {
            addCriterion("topic26_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionEqualTo(String value) {
            addCriterion("topic26_fraction =", value, "topic26Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionNotEqualTo(String value) {
            addCriterion("topic26_fraction <>", value, "topic26Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionGreaterThan(String value) {
            addCriterion("topic26_fraction >", value, "topic26Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic26_fraction >=", value, "topic26Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionLessThan(String value) {
            addCriterion("topic26_fraction <", value, "topic26Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionLessThanOrEqualTo(String value) {
            addCriterion("topic26_fraction <=", value, "topic26Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionLike(String value) {
            addCriterion("topic26_fraction like", value, "topic26Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionNotLike(String value) {
            addCriterion("topic26_fraction not like", value, "topic26Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionIn(List<String> values) {
            addCriterion("topic26_fraction in", values, "topic26Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionNotIn(List<String> values) {
            addCriterion("topic26_fraction not in", values, "topic26Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionBetween(String value1, String value2) {
            addCriterion("topic26_fraction between", value1, value2, "topic26Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic26FractionNotBetween(String value1, String value2) {
            addCriterion("topic26_fraction not between", value1, value2, "topic26Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic26SixIsNull() {
            addCriterion("topic26_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic26SixIsNotNull() {
            addCriterion("topic26_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic26SixEqualTo(String value) {
            addCriterion("topic26_six =", value, "topic26Six");
            return (Criteria) this;
        }

        public Criteria andTopic26SixNotEqualTo(String value) {
            addCriterion("topic26_six <>", value, "topic26Six");
            return (Criteria) this;
        }

        public Criteria andTopic26SixGreaterThan(String value) {
            addCriterion("topic26_six >", value, "topic26Six");
            return (Criteria) this;
        }

        public Criteria andTopic26SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic26_six >=", value, "topic26Six");
            return (Criteria) this;
        }

        public Criteria andTopic26SixLessThan(String value) {
            addCriterion("topic26_six <", value, "topic26Six");
            return (Criteria) this;
        }

        public Criteria andTopic26SixLessThanOrEqualTo(String value) {
            addCriterion("topic26_six <=", value, "topic26Six");
            return (Criteria) this;
        }

        public Criteria andTopic26SixLike(String value) {
            addCriterion("topic26_six like", value, "topic26Six");
            return (Criteria) this;
        }

        public Criteria andTopic26SixNotLike(String value) {
            addCriterion("topic26_six not like", value, "topic26Six");
            return (Criteria) this;
        }

        public Criteria andTopic26SixIn(List<String> values) {
            addCriterion("topic26_six in", values, "topic26Six");
            return (Criteria) this;
        }

        public Criteria andTopic26SixNotIn(List<String> values) {
            addCriterion("topic26_six not in", values, "topic26Six");
            return (Criteria) this;
        }

        public Criteria andTopic26SixBetween(String value1, String value2) {
            addCriterion("topic26_six between", value1, value2, "topic26Six");
            return (Criteria) this;
        }

        public Criteria andTopic26SixNotBetween(String value1, String value2) {
            addCriterion("topic26_six not between", value1, value2, "topic26Six");
            return (Criteria) this;
        }

        public Criteria andTopic27OneIsNull() {
            addCriterion("topic27_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic27OneIsNotNull() {
            addCriterion("topic27_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic27OneEqualTo(String value) {
            addCriterion("topic27_one =", value, "topic27One");
            return (Criteria) this;
        }

        public Criteria andTopic27OneNotEqualTo(String value) {
            addCriterion("topic27_one <>", value, "topic27One");
            return (Criteria) this;
        }

        public Criteria andTopic27OneGreaterThan(String value) {
            addCriterion("topic27_one >", value, "topic27One");
            return (Criteria) this;
        }

        public Criteria andTopic27OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic27_one >=", value, "topic27One");
            return (Criteria) this;
        }

        public Criteria andTopic27OneLessThan(String value) {
            addCriterion("topic27_one <", value, "topic27One");
            return (Criteria) this;
        }

        public Criteria andTopic27OneLessThanOrEqualTo(String value) {
            addCriterion("topic27_one <=", value, "topic27One");
            return (Criteria) this;
        }

        public Criteria andTopic27OneLike(String value) {
            addCriterion("topic27_one like", value, "topic27One");
            return (Criteria) this;
        }

        public Criteria andTopic27OneNotLike(String value) {
            addCriterion("topic27_one not like", value, "topic27One");
            return (Criteria) this;
        }

        public Criteria andTopic27OneIn(List<String> values) {
            addCriterion("topic27_one in", values, "topic27One");
            return (Criteria) this;
        }

        public Criteria andTopic27OneNotIn(List<String> values) {
            addCriterion("topic27_one not in", values, "topic27One");
            return (Criteria) this;
        }

        public Criteria andTopic27OneBetween(String value1, String value2) {
            addCriterion("topic27_one between", value1, value2, "topic27One");
            return (Criteria) this;
        }

        public Criteria andTopic27OneNotBetween(String value1, String value2) {
            addCriterion("topic27_one not between", value1, value2, "topic27One");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoIsNull() {
            addCriterion("topic27_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoIsNotNull() {
            addCriterion("topic27_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoEqualTo(String value) {
            addCriterion("topic27_two =", value, "topic27Two");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoNotEqualTo(String value) {
            addCriterion("topic27_two <>", value, "topic27Two");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoGreaterThan(String value) {
            addCriterion("topic27_two >", value, "topic27Two");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic27_two >=", value, "topic27Two");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoLessThan(String value) {
            addCriterion("topic27_two <", value, "topic27Two");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoLessThanOrEqualTo(String value) {
            addCriterion("topic27_two <=", value, "topic27Two");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoLike(String value) {
            addCriterion("topic27_two like", value, "topic27Two");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoNotLike(String value) {
            addCriterion("topic27_two not like", value, "topic27Two");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoIn(List<String> values) {
            addCriterion("topic27_two in", values, "topic27Two");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoNotIn(List<String> values) {
            addCriterion("topic27_two not in", values, "topic27Two");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoBetween(String value1, String value2) {
            addCriterion("topic27_two between", value1, value2, "topic27Two");
            return (Criteria) this;
        }

        public Criteria andTopic27TwoNotBetween(String value1, String value2) {
            addCriterion("topic27_two not between", value1, value2, "topic27Two");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeIsNull() {
            addCriterion("topic27_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeIsNotNull() {
            addCriterion("topic27_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeEqualTo(String value) {
            addCriterion("topic27_three =", value, "topic27Three");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeNotEqualTo(String value) {
            addCriterion("topic27_three <>", value, "topic27Three");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeGreaterThan(String value) {
            addCriterion("topic27_three >", value, "topic27Three");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic27_three >=", value, "topic27Three");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeLessThan(String value) {
            addCriterion("topic27_three <", value, "topic27Three");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic27_three <=", value, "topic27Three");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeLike(String value) {
            addCriterion("topic27_three like", value, "topic27Three");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeNotLike(String value) {
            addCriterion("topic27_three not like", value, "topic27Three");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeIn(List<String> values) {
            addCriterion("topic27_three in", values, "topic27Three");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeNotIn(List<String> values) {
            addCriterion("topic27_three not in", values, "topic27Three");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeBetween(String value1, String value2) {
            addCriterion("topic27_three between", value1, value2, "topic27Three");
            return (Criteria) this;
        }

        public Criteria andTopic27ThreeNotBetween(String value1, String value2) {
            addCriterion("topic27_three not between", value1, value2, "topic27Three");
            return (Criteria) this;
        }

        public Criteria andTopic27FourIsNull() {
            addCriterion("topic27_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic27FourIsNotNull() {
            addCriterion("topic27_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic27FourEqualTo(String value) {
            addCriterion("topic27_four =", value, "topic27Four");
            return (Criteria) this;
        }

        public Criteria andTopic27FourNotEqualTo(String value) {
            addCriterion("topic27_four <>", value, "topic27Four");
            return (Criteria) this;
        }

        public Criteria andTopic27FourGreaterThan(String value) {
            addCriterion("topic27_four >", value, "topic27Four");
            return (Criteria) this;
        }

        public Criteria andTopic27FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic27_four >=", value, "topic27Four");
            return (Criteria) this;
        }

        public Criteria andTopic27FourLessThan(String value) {
            addCriterion("topic27_four <", value, "topic27Four");
            return (Criteria) this;
        }

        public Criteria andTopic27FourLessThanOrEqualTo(String value) {
            addCriterion("topic27_four <=", value, "topic27Four");
            return (Criteria) this;
        }

        public Criteria andTopic27FourLike(String value) {
            addCriterion("topic27_four like", value, "topic27Four");
            return (Criteria) this;
        }

        public Criteria andTopic27FourNotLike(String value) {
            addCriterion("topic27_four not like", value, "topic27Four");
            return (Criteria) this;
        }

        public Criteria andTopic27FourIn(List<String> values) {
            addCriterion("topic27_four in", values, "topic27Four");
            return (Criteria) this;
        }

        public Criteria andTopic27FourNotIn(List<String> values) {
            addCriterion("topic27_four not in", values, "topic27Four");
            return (Criteria) this;
        }

        public Criteria andTopic27FourBetween(String value1, String value2) {
            addCriterion("topic27_four between", value1, value2, "topic27Four");
            return (Criteria) this;
        }

        public Criteria andTopic27FourNotBetween(String value1, String value2) {
            addCriterion("topic27_four not between", value1, value2, "topic27Four");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionIsNull() {
            addCriterion("topic27_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionIsNotNull() {
            addCriterion("topic27_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionEqualTo(String value) {
            addCriterion("topic27_fraction =", value, "topic27Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionNotEqualTo(String value) {
            addCriterion("topic27_fraction <>", value, "topic27Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionGreaterThan(String value) {
            addCriterion("topic27_fraction >", value, "topic27Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic27_fraction >=", value, "topic27Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionLessThan(String value) {
            addCriterion("topic27_fraction <", value, "topic27Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionLessThanOrEqualTo(String value) {
            addCriterion("topic27_fraction <=", value, "topic27Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionLike(String value) {
            addCriterion("topic27_fraction like", value, "topic27Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionNotLike(String value) {
            addCriterion("topic27_fraction not like", value, "topic27Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionIn(List<String> values) {
            addCriterion("topic27_fraction in", values, "topic27Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionNotIn(List<String> values) {
            addCriterion("topic27_fraction not in", values, "topic27Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionBetween(String value1, String value2) {
            addCriterion("topic27_fraction between", value1, value2, "topic27Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic27FractionNotBetween(String value1, String value2) {
            addCriterion("topic27_fraction not between", value1, value2, "topic27Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic27SixIsNull() {
            addCriterion("topic27_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic27SixIsNotNull() {
            addCriterion("topic27_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic27SixEqualTo(String value) {
            addCriterion("topic27_six =", value, "topic27Six");
            return (Criteria) this;
        }

        public Criteria andTopic27SixNotEqualTo(String value) {
            addCriterion("topic27_six <>", value, "topic27Six");
            return (Criteria) this;
        }

        public Criteria andTopic27SixGreaterThan(String value) {
            addCriterion("topic27_six >", value, "topic27Six");
            return (Criteria) this;
        }

        public Criteria andTopic27SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic27_six >=", value, "topic27Six");
            return (Criteria) this;
        }

        public Criteria andTopic27SixLessThan(String value) {
            addCriterion("topic27_six <", value, "topic27Six");
            return (Criteria) this;
        }

        public Criteria andTopic27SixLessThanOrEqualTo(String value) {
            addCriterion("topic27_six <=", value, "topic27Six");
            return (Criteria) this;
        }

        public Criteria andTopic27SixLike(String value) {
            addCriterion("topic27_six like", value, "topic27Six");
            return (Criteria) this;
        }

        public Criteria andTopic27SixNotLike(String value) {
            addCriterion("topic27_six not like", value, "topic27Six");
            return (Criteria) this;
        }

        public Criteria andTopic27SixIn(List<String> values) {
            addCriterion("topic27_six in", values, "topic27Six");
            return (Criteria) this;
        }

        public Criteria andTopic27SixNotIn(List<String> values) {
            addCriterion("topic27_six not in", values, "topic27Six");
            return (Criteria) this;
        }

        public Criteria andTopic27SixBetween(String value1, String value2) {
            addCriterion("topic27_six between", value1, value2, "topic27Six");
            return (Criteria) this;
        }

        public Criteria andTopic27SixNotBetween(String value1, String value2) {
            addCriterion("topic27_six not between", value1, value2, "topic27Six");
            return (Criteria) this;
        }

        public Criteria andTopic28OneIsNull() {
            addCriterion("topic28_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic28OneIsNotNull() {
            addCriterion("topic28_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic28OneEqualTo(String value) {
            addCriterion("topic28_one =", value, "topic28One");
            return (Criteria) this;
        }

        public Criteria andTopic28OneNotEqualTo(String value) {
            addCriterion("topic28_one <>", value, "topic28One");
            return (Criteria) this;
        }

        public Criteria andTopic28OneGreaterThan(String value) {
            addCriterion("topic28_one >", value, "topic28One");
            return (Criteria) this;
        }

        public Criteria andTopic28OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic28_one >=", value, "topic28One");
            return (Criteria) this;
        }

        public Criteria andTopic28OneLessThan(String value) {
            addCriterion("topic28_one <", value, "topic28One");
            return (Criteria) this;
        }

        public Criteria andTopic28OneLessThanOrEqualTo(String value) {
            addCriterion("topic28_one <=", value, "topic28One");
            return (Criteria) this;
        }

        public Criteria andTopic28OneLike(String value) {
            addCriterion("topic28_one like", value, "topic28One");
            return (Criteria) this;
        }

        public Criteria andTopic28OneNotLike(String value) {
            addCriterion("topic28_one not like", value, "topic28One");
            return (Criteria) this;
        }

        public Criteria andTopic28OneIn(List<String> values) {
            addCriterion("topic28_one in", values, "topic28One");
            return (Criteria) this;
        }

        public Criteria andTopic28OneNotIn(List<String> values) {
            addCriterion("topic28_one not in", values, "topic28One");
            return (Criteria) this;
        }

        public Criteria andTopic28OneBetween(String value1, String value2) {
            addCriterion("topic28_one between", value1, value2, "topic28One");
            return (Criteria) this;
        }

        public Criteria andTopic28OneNotBetween(String value1, String value2) {
            addCriterion("topic28_one not between", value1, value2, "topic28One");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoIsNull() {
            addCriterion("topic28_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoIsNotNull() {
            addCriterion("topic28_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoEqualTo(String value) {
            addCriterion("topic28_two =", value, "topic28Two");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoNotEqualTo(String value) {
            addCriterion("topic28_two <>", value, "topic28Two");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoGreaterThan(String value) {
            addCriterion("topic28_two >", value, "topic28Two");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic28_two >=", value, "topic28Two");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoLessThan(String value) {
            addCriterion("topic28_two <", value, "topic28Two");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoLessThanOrEqualTo(String value) {
            addCriterion("topic28_two <=", value, "topic28Two");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoLike(String value) {
            addCriterion("topic28_two like", value, "topic28Two");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoNotLike(String value) {
            addCriterion("topic28_two not like", value, "topic28Two");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoIn(List<String> values) {
            addCriterion("topic28_two in", values, "topic28Two");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoNotIn(List<String> values) {
            addCriterion("topic28_two not in", values, "topic28Two");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoBetween(String value1, String value2) {
            addCriterion("topic28_two between", value1, value2, "topic28Two");
            return (Criteria) this;
        }

        public Criteria andTopic28TwoNotBetween(String value1, String value2) {
            addCriterion("topic28_two not between", value1, value2, "topic28Two");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeIsNull() {
            addCriterion("topic28_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeIsNotNull() {
            addCriterion("topic28_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeEqualTo(String value) {
            addCriterion("topic28_three =", value, "topic28Three");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeNotEqualTo(String value) {
            addCriterion("topic28_three <>", value, "topic28Three");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeGreaterThan(String value) {
            addCriterion("topic28_three >", value, "topic28Three");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic28_three >=", value, "topic28Three");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeLessThan(String value) {
            addCriterion("topic28_three <", value, "topic28Three");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic28_three <=", value, "topic28Three");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeLike(String value) {
            addCriterion("topic28_three like", value, "topic28Three");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeNotLike(String value) {
            addCriterion("topic28_three not like", value, "topic28Three");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeIn(List<String> values) {
            addCriterion("topic28_three in", values, "topic28Three");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeNotIn(List<String> values) {
            addCriterion("topic28_three not in", values, "topic28Three");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeBetween(String value1, String value2) {
            addCriterion("topic28_three between", value1, value2, "topic28Three");
            return (Criteria) this;
        }

        public Criteria andTopic28ThreeNotBetween(String value1, String value2) {
            addCriterion("topic28_three not between", value1, value2, "topic28Three");
            return (Criteria) this;
        }

        public Criteria andTopic28FourIsNull() {
            addCriterion("topic28_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic28FourIsNotNull() {
            addCriterion("topic28_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic28FourEqualTo(String value) {
            addCriterion("topic28_four =", value, "topic28Four");
            return (Criteria) this;
        }

        public Criteria andTopic28FourNotEqualTo(String value) {
            addCriterion("topic28_four <>", value, "topic28Four");
            return (Criteria) this;
        }

        public Criteria andTopic28FourGreaterThan(String value) {
            addCriterion("topic28_four >", value, "topic28Four");
            return (Criteria) this;
        }

        public Criteria andTopic28FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic28_four >=", value, "topic28Four");
            return (Criteria) this;
        }

        public Criteria andTopic28FourLessThan(String value) {
            addCriterion("topic28_four <", value, "topic28Four");
            return (Criteria) this;
        }

        public Criteria andTopic28FourLessThanOrEqualTo(String value) {
            addCriterion("topic28_four <=", value, "topic28Four");
            return (Criteria) this;
        }

        public Criteria andTopic28FourLike(String value) {
            addCriterion("topic28_four like", value, "topic28Four");
            return (Criteria) this;
        }

        public Criteria andTopic28FourNotLike(String value) {
            addCriterion("topic28_four not like", value, "topic28Four");
            return (Criteria) this;
        }

        public Criteria andTopic28FourIn(List<String> values) {
            addCriterion("topic28_four in", values, "topic28Four");
            return (Criteria) this;
        }

        public Criteria andTopic28FourNotIn(List<String> values) {
            addCriterion("topic28_four not in", values, "topic28Four");
            return (Criteria) this;
        }

        public Criteria andTopic28FourBetween(String value1, String value2) {
            addCriterion("topic28_four between", value1, value2, "topic28Four");
            return (Criteria) this;
        }

        public Criteria andTopic28FourNotBetween(String value1, String value2) {
            addCriterion("topic28_four not between", value1, value2, "topic28Four");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionIsNull() {
            addCriterion("topic28_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionIsNotNull() {
            addCriterion("topic28_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionEqualTo(String value) {
            addCriterion("topic28_fraction =", value, "topic28Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionNotEqualTo(String value) {
            addCriterion("topic28_fraction <>", value, "topic28Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionGreaterThan(String value) {
            addCriterion("topic28_fraction >", value, "topic28Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic28_fraction >=", value, "topic28Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionLessThan(String value) {
            addCriterion("topic28_fraction <", value, "topic28Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionLessThanOrEqualTo(String value) {
            addCriterion("topic28_fraction <=", value, "topic28Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionLike(String value) {
            addCriterion("topic28_fraction like", value, "topic28Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionNotLike(String value) {
            addCriterion("topic28_fraction not like", value, "topic28Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionIn(List<String> values) {
            addCriterion("topic28_fraction in", values, "topic28Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionNotIn(List<String> values) {
            addCriterion("topic28_fraction not in", values, "topic28Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionBetween(String value1, String value2) {
            addCriterion("topic28_fraction between", value1, value2, "topic28Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic28FractionNotBetween(String value1, String value2) {
            addCriterion("topic28_fraction not between", value1, value2, "topic28Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic28SixIsNull() {
            addCriterion("topic28_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic28SixIsNotNull() {
            addCriterion("topic28_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic28SixEqualTo(String value) {
            addCriterion("topic28_six =", value, "topic28Six");
            return (Criteria) this;
        }

        public Criteria andTopic28SixNotEqualTo(String value) {
            addCriterion("topic28_six <>", value, "topic28Six");
            return (Criteria) this;
        }

        public Criteria andTopic28SixGreaterThan(String value) {
            addCriterion("topic28_six >", value, "topic28Six");
            return (Criteria) this;
        }

        public Criteria andTopic28SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic28_six >=", value, "topic28Six");
            return (Criteria) this;
        }

        public Criteria andTopic28SixLessThan(String value) {
            addCriterion("topic28_six <", value, "topic28Six");
            return (Criteria) this;
        }

        public Criteria andTopic28SixLessThanOrEqualTo(String value) {
            addCriterion("topic28_six <=", value, "topic28Six");
            return (Criteria) this;
        }

        public Criteria andTopic28SixLike(String value) {
            addCriterion("topic28_six like", value, "topic28Six");
            return (Criteria) this;
        }

        public Criteria andTopic28SixNotLike(String value) {
            addCriterion("topic28_six not like", value, "topic28Six");
            return (Criteria) this;
        }

        public Criteria andTopic28SixIn(List<String> values) {
            addCriterion("topic28_six in", values, "topic28Six");
            return (Criteria) this;
        }

        public Criteria andTopic28SixNotIn(List<String> values) {
            addCriterion("topic28_six not in", values, "topic28Six");
            return (Criteria) this;
        }

        public Criteria andTopic28SixBetween(String value1, String value2) {
            addCriterion("topic28_six between", value1, value2, "topic28Six");
            return (Criteria) this;
        }

        public Criteria andTopic28SixNotBetween(String value1, String value2) {
            addCriterion("topic28_six not between", value1, value2, "topic28Six");
            return (Criteria) this;
        }

        public Criteria andTopic29OneIsNull() {
            addCriterion("topic29_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic29OneIsNotNull() {
            addCriterion("topic29_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic29OneEqualTo(String value) {
            addCriterion("topic29_one =", value, "topic29One");
            return (Criteria) this;
        }

        public Criteria andTopic29OneNotEqualTo(String value) {
            addCriterion("topic29_one <>", value, "topic29One");
            return (Criteria) this;
        }

        public Criteria andTopic29OneGreaterThan(String value) {
            addCriterion("topic29_one >", value, "topic29One");
            return (Criteria) this;
        }

        public Criteria andTopic29OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic29_one >=", value, "topic29One");
            return (Criteria) this;
        }

        public Criteria andTopic29OneLessThan(String value) {
            addCriterion("topic29_one <", value, "topic29One");
            return (Criteria) this;
        }

        public Criteria andTopic29OneLessThanOrEqualTo(String value) {
            addCriterion("topic29_one <=", value, "topic29One");
            return (Criteria) this;
        }

        public Criteria andTopic29OneLike(String value) {
            addCriterion("topic29_one like", value, "topic29One");
            return (Criteria) this;
        }

        public Criteria andTopic29OneNotLike(String value) {
            addCriterion("topic29_one not like", value, "topic29One");
            return (Criteria) this;
        }

        public Criteria andTopic29OneIn(List<String> values) {
            addCriterion("topic29_one in", values, "topic29One");
            return (Criteria) this;
        }

        public Criteria andTopic29OneNotIn(List<String> values) {
            addCriterion("topic29_one not in", values, "topic29One");
            return (Criteria) this;
        }

        public Criteria andTopic29OneBetween(String value1, String value2) {
            addCriterion("topic29_one between", value1, value2, "topic29One");
            return (Criteria) this;
        }

        public Criteria andTopic29OneNotBetween(String value1, String value2) {
            addCriterion("topic29_one not between", value1, value2, "topic29One");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoIsNull() {
            addCriterion("topic29_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoIsNotNull() {
            addCriterion("topic29_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoEqualTo(String value) {
            addCriterion("topic29_two =", value, "topic29Two");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoNotEqualTo(String value) {
            addCriterion("topic29_two <>", value, "topic29Two");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoGreaterThan(String value) {
            addCriterion("topic29_two >", value, "topic29Two");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic29_two >=", value, "topic29Two");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoLessThan(String value) {
            addCriterion("topic29_two <", value, "topic29Two");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoLessThanOrEqualTo(String value) {
            addCriterion("topic29_two <=", value, "topic29Two");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoLike(String value) {
            addCriterion("topic29_two like", value, "topic29Two");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoNotLike(String value) {
            addCriterion("topic29_two not like", value, "topic29Two");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoIn(List<String> values) {
            addCriterion("topic29_two in", values, "topic29Two");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoNotIn(List<String> values) {
            addCriterion("topic29_two not in", values, "topic29Two");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoBetween(String value1, String value2) {
            addCriterion("topic29_two between", value1, value2, "topic29Two");
            return (Criteria) this;
        }

        public Criteria andTopic29TwoNotBetween(String value1, String value2) {
            addCriterion("topic29_two not between", value1, value2, "topic29Two");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeIsNull() {
            addCriterion("topic29_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeIsNotNull() {
            addCriterion("topic29_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeEqualTo(String value) {
            addCriterion("topic29_three =", value, "topic29Three");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeNotEqualTo(String value) {
            addCriterion("topic29_three <>", value, "topic29Three");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeGreaterThan(String value) {
            addCriterion("topic29_three >", value, "topic29Three");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic29_three >=", value, "topic29Three");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeLessThan(String value) {
            addCriterion("topic29_three <", value, "topic29Three");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic29_three <=", value, "topic29Three");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeLike(String value) {
            addCriterion("topic29_three like", value, "topic29Three");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeNotLike(String value) {
            addCriterion("topic29_three not like", value, "topic29Three");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeIn(List<String> values) {
            addCriterion("topic29_three in", values, "topic29Three");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeNotIn(List<String> values) {
            addCriterion("topic29_three not in", values, "topic29Three");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeBetween(String value1, String value2) {
            addCriterion("topic29_three between", value1, value2, "topic29Three");
            return (Criteria) this;
        }

        public Criteria andTopic29ThreeNotBetween(String value1, String value2) {
            addCriterion("topic29_three not between", value1, value2, "topic29Three");
            return (Criteria) this;
        }

        public Criteria andTopic29FourIsNull() {
            addCriterion("topic29_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic29FourIsNotNull() {
            addCriterion("topic29_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic29FourEqualTo(String value) {
            addCriterion("topic29_four =", value, "topic29Four");
            return (Criteria) this;
        }

        public Criteria andTopic29FourNotEqualTo(String value) {
            addCriterion("topic29_four <>", value, "topic29Four");
            return (Criteria) this;
        }

        public Criteria andTopic29FourGreaterThan(String value) {
            addCriterion("topic29_four >", value, "topic29Four");
            return (Criteria) this;
        }

        public Criteria andTopic29FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic29_four >=", value, "topic29Four");
            return (Criteria) this;
        }

        public Criteria andTopic29FourLessThan(String value) {
            addCriterion("topic29_four <", value, "topic29Four");
            return (Criteria) this;
        }

        public Criteria andTopic29FourLessThanOrEqualTo(String value) {
            addCriterion("topic29_four <=", value, "topic29Four");
            return (Criteria) this;
        }

        public Criteria andTopic29FourLike(String value) {
            addCriterion("topic29_four like", value, "topic29Four");
            return (Criteria) this;
        }

        public Criteria andTopic29FourNotLike(String value) {
            addCriterion("topic29_four not like", value, "topic29Four");
            return (Criteria) this;
        }

        public Criteria andTopic29FourIn(List<String> values) {
            addCriterion("topic29_four in", values, "topic29Four");
            return (Criteria) this;
        }

        public Criteria andTopic29FourNotIn(List<String> values) {
            addCriterion("topic29_four not in", values, "topic29Four");
            return (Criteria) this;
        }

        public Criteria andTopic29FourBetween(String value1, String value2) {
            addCriterion("topic29_four between", value1, value2, "topic29Four");
            return (Criteria) this;
        }

        public Criteria andTopic29FourNotBetween(String value1, String value2) {
            addCriterion("topic29_four not between", value1, value2, "topic29Four");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionIsNull() {
            addCriterion("topic29_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionIsNotNull() {
            addCriterion("topic29_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionEqualTo(String value) {
            addCriterion("topic29_fraction =", value, "topic29Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionNotEqualTo(String value) {
            addCriterion("topic29_fraction <>", value, "topic29Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionGreaterThan(String value) {
            addCriterion("topic29_fraction >", value, "topic29Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic29_fraction >=", value, "topic29Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionLessThan(String value) {
            addCriterion("topic29_fraction <", value, "topic29Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionLessThanOrEqualTo(String value) {
            addCriterion("topic29_fraction <=", value, "topic29Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionLike(String value) {
            addCriterion("topic29_fraction like", value, "topic29Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionNotLike(String value) {
            addCriterion("topic29_fraction not like", value, "topic29Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionIn(List<String> values) {
            addCriterion("topic29_fraction in", values, "topic29Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionNotIn(List<String> values) {
            addCriterion("topic29_fraction not in", values, "topic29Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionBetween(String value1, String value2) {
            addCriterion("topic29_fraction between", value1, value2, "topic29Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic29FractionNotBetween(String value1, String value2) {
            addCriterion("topic29_fraction not between", value1, value2, "topic29Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic29SixIsNull() {
            addCriterion("topic29_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic29SixIsNotNull() {
            addCriterion("topic29_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic29SixEqualTo(String value) {
            addCriterion("topic29_six =", value, "topic29Six");
            return (Criteria) this;
        }

        public Criteria andTopic29SixNotEqualTo(String value) {
            addCriterion("topic29_six <>", value, "topic29Six");
            return (Criteria) this;
        }

        public Criteria andTopic29SixGreaterThan(String value) {
            addCriterion("topic29_six >", value, "topic29Six");
            return (Criteria) this;
        }

        public Criteria andTopic29SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic29_six >=", value, "topic29Six");
            return (Criteria) this;
        }

        public Criteria andTopic29SixLessThan(String value) {
            addCriterion("topic29_six <", value, "topic29Six");
            return (Criteria) this;
        }

        public Criteria andTopic29SixLessThanOrEqualTo(String value) {
            addCriterion("topic29_six <=", value, "topic29Six");
            return (Criteria) this;
        }

        public Criteria andTopic29SixLike(String value) {
            addCriterion("topic29_six like", value, "topic29Six");
            return (Criteria) this;
        }

        public Criteria andTopic29SixNotLike(String value) {
            addCriterion("topic29_six not like", value, "topic29Six");
            return (Criteria) this;
        }

        public Criteria andTopic29SixIn(List<String> values) {
            addCriterion("topic29_six in", values, "topic29Six");
            return (Criteria) this;
        }

        public Criteria andTopic29SixNotIn(List<String> values) {
            addCriterion("topic29_six not in", values, "topic29Six");
            return (Criteria) this;
        }

        public Criteria andTopic29SixBetween(String value1, String value2) {
            addCriterion("topic29_six between", value1, value2, "topic29Six");
            return (Criteria) this;
        }

        public Criteria andTopic29SixNotBetween(String value1, String value2) {
            addCriterion("topic29_six not between", value1, value2, "topic29Six");
            return (Criteria) this;
        }

        public Criteria andTopic30OneIsNull() {
            addCriterion("topic30_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic30OneIsNotNull() {
            addCriterion("topic30_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic30OneEqualTo(String value) {
            addCriterion("topic30_one =", value, "topic30One");
            return (Criteria) this;
        }

        public Criteria andTopic30OneNotEqualTo(String value) {
            addCriterion("topic30_one <>", value, "topic30One");
            return (Criteria) this;
        }

        public Criteria andTopic30OneGreaterThan(String value) {
            addCriterion("topic30_one >", value, "topic30One");
            return (Criteria) this;
        }

        public Criteria andTopic30OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic30_one >=", value, "topic30One");
            return (Criteria) this;
        }

        public Criteria andTopic30OneLessThan(String value) {
            addCriterion("topic30_one <", value, "topic30One");
            return (Criteria) this;
        }

        public Criteria andTopic30OneLessThanOrEqualTo(String value) {
            addCriterion("topic30_one <=", value, "topic30One");
            return (Criteria) this;
        }

        public Criteria andTopic30OneLike(String value) {
            addCriterion("topic30_one like", value, "topic30One");
            return (Criteria) this;
        }

        public Criteria andTopic30OneNotLike(String value) {
            addCriterion("topic30_one not like", value, "topic30One");
            return (Criteria) this;
        }

        public Criteria andTopic30OneIn(List<String> values) {
            addCriterion("topic30_one in", values, "topic30One");
            return (Criteria) this;
        }

        public Criteria andTopic30OneNotIn(List<String> values) {
            addCriterion("topic30_one not in", values, "topic30One");
            return (Criteria) this;
        }

        public Criteria andTopic30OneBetween(String value1, String value2) {
            addCriterion("topic30_one between", value1, value2, "topic30One");
            return (Criteria) this;
        }

        public Criteria andTopic30OneNotBetween(String value1, String value2) {
            addCriterion("topic30_one not between", value1, value2, "topic30One");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoIsNull() {
            addCriterion("topic30_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoIsNotNull() {
            addCriterion("topic30_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoEqualTo(String value) {
            addCriterion("topic30_two =", value, "topic30Two");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoNotEqualTo(String value) {
            addCriterion("topic30_two <>", value, "topic30Two");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoGreaterThan(String value) {
            addCriterion("topic30_two >", value, "topic30Two");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic30_two >=", value, "topic30Two");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoLessThan(String value) {
            addCriterion("topic30_two <", value, "topic30Two");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoLessThanOrEqualTo(String value) {
            addCriterion("topic30_two <=", value, "topic30Two");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoLike(String value) {
            addCriterion("topic30_two like", value, "topic30Two");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoNotLike(String value) {
            addCriterion("topic30_two not like", value, "topic30Two");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoIn(List<String> values) {
            addCriterion("topic30_two in", values, "topic30Two");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoNotIn(List<String> values) {
            addCriterion("topic30_two not in", values, "topic30Two");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoBetween(String value1, String value2) {
            addCriterion("topic30_two between", value1, value2, "topic30Two");
            return (Criteria) this;
        }

        public Criteria andTopic30TwoNotBetween(String value1, String value2) {
            addCriterion("topic30_two not between", value1, value2, "topic30Two");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeIsNull() {
            addCriterion("topic30_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeIsNotNull() {
            addCriterion("topic30_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeEqualTo(String value) {
            addCriterion("topic30_three =", value, "topic30Three");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeNotEqualTo(String value) {
            addCriterion("topic30_three <>", value, "topic30Three");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeGreaterThan(String value) {
            addCriterion("topic30_three >", value, "topic30Three");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic30_three >=", value, "topic30Three");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeLessThan(String value) {
            addCriterion("topic30_three <", value, "topic30Three");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic30_three <=", value, "topic30Three");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeLike(String value) {
            addCriterion("topic30_three like", value, "topic30Three");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeNotLike(String value) {
            addCriterion("topic30_three not like", value, "topic30Three");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeIn(List<String> values) {
            addCriterion("topic30_three in", values, "topic30Three");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeNotIn(List<String> values) {
            addCriterion("topic30_three not in", values, "topic30Three");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeBetween(String value1, String value2) {
            addCriterion("topic30_three between", value1, value2, "topic30Three");
            return (Criteria) this;
        }

        public Criteria andTopic30ThreeNotBetween(String value1, String value2) {
            addCriterion("topic30_three not between", value1, value2, "topic30Three");
            return (Criteria) this;
        }

        public Criteria andTopic30FourIsNull() {
            addCriterion("topic30_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic30FourIsNotNull() {
            addCriterion("topic30_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic30FourEqualTo(String value) {
            addCriterion("topic30_four =", value, "topic30Four");
            return (Criteria) this;
        }

        public Criteria andTopic30FourNotEqualTo(String value) {
            addCriterion("topic30_four <>", value, "topic30Four");
            return (Criteria) this;
        }

        public Criteria andTopic30FourGreaterThan(String value) {
            addCriterion("topic30_four >", value, "topic30Four");
            return (Criteria) this;
        }

        public Criteria andTopic30FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic30_four >=", value, "topic30Four");
            return (Criteria) this;
        }

        public Criteria andTopic30FourLessThan(String value) {
            addCriterion("topic30_four <", value, "topic30Four");
            return (Criteria) this;
        }

        public Criteria andTopic30FourLessThanOrEqualTo(String value) {
            addCriterion("topic30_four <=", value, "topic30Four");
            return (Criteria) this;
        }

        public Criteria andTopic30FourLike(String value) {
            addCriterion("topic30_four like", value, "topic30Four");
            return (Criteria) this;
        }

        public Criteria andTopic30FourNotLike(String value) {
            addCriterion("topic30_four not like", value, "topic30Four");
            return (Criteria) this;
        }

        public Criteria andTopic30FourIn(List<String> values) {
            addCriterion("topic30_four in", values, "topic30Four");
            return (Criteria) this;
        }

        public Criteria andTopic30FourNotIn(List<String> values) {
            addCriterion("topic30_four not in", values, "topic30Four");
            return (Criteria) this;
        }

        public Criteria andTopic30FourBetween(String value1, String value2) {
            addCriterion("topic30_four between", value1, value2, "topic30Four");
            return (Criteria) this;
        }

        public Criteria andTopic30FourNotBetween(String value1, String value2) {
            addCriterion("topic30_four not between", value1, value2, "topic30Four");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionIsNull() {
            addCriterion("topic30_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionIsNotNull() {
            addCriterion("topic30_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionEqualTo(String value) {
            addCriterion("topic30_fraction =", value, "topic30Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionNotEqualTo(String value) {
            addCriterion("topic30_fraction <>", value, "topic30Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionGreaterThan(String value) {
            addCriterion("topic30_fraction >", value, "topic30Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic30_fraction >=", value, "topic30Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionLessThan(String value) {
            addCriterion("topic30_fraction <", value, "topic30Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionLessThanOrEqualTo(String value) {
            addCriterion("topic30_fraction <=", value, "topic30Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionLike(String value) {
            addCriterion("topic30_fraction like", value, "topic30Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionNotLike(String value) {
            addCriterion("topic30_fraction not like", value, "topic30Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionIn(List<String> values) {
            addCriterion("topic30_fraction in", values, "topic30Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionNotIn(List<String> values) {
            addCriterion("topic30_fraction not in", values, "topic30Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionBetween(String value1, String value2) {
            addCriterion("topic30_fraction between", value1, value2, "topic30Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic30FractionNotBetween(String value1, String value2) {
            addCriterion("topic30_fraction not between", value1, value2, "topic30Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic30SixIsNull() {
            addCriterion("topic30_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic30SixIsNotNull() {
            addCriterion("topic30_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic30SixEqualTo(String value) {
            addCriterion("topic30_six =", value, "topic30Six");
            return (Criteria) this;
        }

        public Criteria andTopic30SixNotEqualTo(String value) {
            addCriterion("topic30_six <>", value, "topic30Six");
            return (Criteria) this;
        }

        public Criteria andTopic30SixGreaterThan(String value) {
            addCriterion("topic30_six >", value, "topic30Six");
            return (Criteria) this;
        }

        public Criteria andTopic30SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic30_six >=", value, "topic30Six");
            return (Criteria) this;
        }

        public Criteria andTopic30SixLessThan(String value) {
            addCriterion("topic30_six <", value, "topic30Six");
            return (Criteria) this;
        }

        public Criteria andTopic30SixLessThanOrEqualTo(String value) {
            addCriterion("topic30_six <=", value, "topic30Six");
            return (Criteria) this;
        }

        public Criteria andTopic30SixLike(String value) {
            addCriterion("topic30_six like", value, "topic30Six");
            return (Criteria) this;
        }

        public Criteria andTopic30SixNotLike(String value) {
            addCriterion("topic30_six not like", value, "topic30Six");
            return (Criteria) this;
        }

        public Criteria andTopic30SixIn(List<String> values) {
            addCriterion("topic30_six in", values, "topic30Six");
            return (Criteria) this;
        }

        public Criteria andTopic30SixNotIn(List<String> values) {
            addCriterion("topic30_six not in", values, "topic30Six");
            return (Criteria) this;
        }

        public Criteria andTopic30SixBetween(String value1, String value2) {
            addCriterion("topic30_six between", value1, value2, "topic30Six");
            return (Criteria) this;
        }

        public Criteria andTopic30SixNotBetween(String value1, String value2) {
            addCriterion("topic30_six not between", value1, value2, "topic30Six");
            return (Criteria) this;
        }

        public Criteria andTopic31OneIsNull() {
            addCriterion("topic31_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic31OneIsNotNull() {
            addCriterion("topic31_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic31OneEqualTo(String value) {
            addCriterion("topic31_one =", value, "topic31One");
            return (Criteria) this;
        }

        public Criteria andTopic31OneNotEqualTo(String value) {
            addCriterion("topic31_one <>", value, "topic31One");
            return (Criteria) this;
        }

        public Criteria andTopic31OneGreaterThan(String value) {
            addCriterion("topic31_one >", value, "topic31One");
            return (Criteria) this;
        }

        public Criteria andTopic31OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic31_one >=", value, "topic31One");
            return (Criteria) this;
        }

        public Criteria andTopic31OneLessThan(String value) {
            addCriterion("topic31_one <", value, "topic31One");
            return (Criteria) this;
        }

        public Criteria andTopic31OneLessThanOrEqualTo(String value) {
            addCriterion("topic31_one <=", value, "topic31One");
            return (Criteria) this;
        }

        public Criteria andTopic31OneLike(String value) {
            addCriterion("topic31_one like", value, "topic31One");
            return (Criteria) this;
        }

        public Criteria andTopic31OneNotLike(String value) {
            addCriterion("topic31_one not like", value, "topic31One");
            return (Criteria) this;
        }

        public Criteria andTopic31OneIn(List<String> values) {
            addCriterion("topic31_one in", values, "topic31One");
            return (Criteria) this;
        }

        public Criteria andTopic31OneNotIn(List<String> values) {
            addCriterion("topic31_one not in", values, "topic31One");
            return (Criteria) this;
        }

        public Criteria andTopic31OneBetween(String value1, String value2) {
            addCriterion("topic31_one between", value1, value2, "topic31One");
            return (Criteria) this;
        }

        public Criteria andTopic31OneNotBetween(String value1, String value2) {
            addCriterion("topic31_one not between", value1, value2, "topic31One");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoIsNull() {
            addCriterion("topic31_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoIsNotNull() {
            addCriterion("topic31_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoEqualTo(String value) {
            addCriterion("topic31_two =", value, "topic31Two");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoNotEqualTo(String value) {
            addCriterion("topic31_two <>", value, "topic31Two");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoGreaterThan(String value) {
            addCriterion("topic31_two >", value, "topic31Two");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic31_two >=", value, "topic31Two");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoLessThan(String value) {
            addCriterion("topic31_two <", value, "topic31Two");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoLessThanOrEqualTo(String value) {
            addCriterion("topic31_two <=", value, "topic31Two");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoLike(String value) {
            addCriterion("topic31_two like", value, "topic31Two");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoNotLike(String value) {
            addCriterion("topic31_two not like", value, "topic31Two");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoIn(List<String> values) {
            addCriterion("topic31_two in", values, "topic31Two");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoNotIn(List<String> values) {
            addCriterion("topic31_two not in", values, "topic31Two");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoBetween(String value1, String value2) {
            addCriterion("topic31_two between", value1, value2, "topic31Two");
            return (Criteria) this;
        }

        public Criteria andTopic31TwoNotBetween(String value1, String value2) {
            addCriterion("topic31_two not between", value1, value2, "topic31Two");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeIsNull() {
            addCriterion("topic31_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeIsNotNull() {
            addCriterion("topic31_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeEqualTo(String value) {
            addCriterion("topic31_three =", value, "topic31Three");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeNotEqualTo(String value) {
            addCriterion("topic31_three <>", value, "topic31Three");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeGreaterThan(String value) {
            addCriterion("topic31_three >", value, "topic31Three");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic31_three >=", value, "topic31Three");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeLessThan(String value) {
            addCriterion("topic31_three <", value, "topic31Three");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic31_three <=", value, "topic31Three");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeLike(String value) {
            addCriterion("topic31_three like", value, "topic31Three");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeNotLike(String value) {
            addCriterion("topic31_three not like", value, "topic31Three");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeIn(List<String> values) {
            addCriterion("topic31_three in", values, "topic31Three");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeNotIn(List<String> values) {
            addCriterion("topic31_three not in", values, "topic31Three");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeBetween(String value1, String value2) {
            addCriterion("topic31_three between", value1, value2, "topic31Three");
            return (Criteria) this;
        }

        public Criteria andTopic31ThreeNotBetween(String value1, String value2) {
            addCriterion("topic31_three not between", value1, value2, "topic31Three");
            return (Criteria) this;
        }

        public Criteria andTopic31FourIsNull() {
            addCriterion("topic31_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic31FourIsNotNull() {
            addCriterion("topic31_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic31FourEqualTo(String value) {
            addCriterion("topic31_four =", value, "topic31Four");
            return (Criteria) this;
        }

        public Criteria andTopic31FourNotEqualTo(String value) {
            addCriterion("topic31_four <>", value, "topic31Four");
            return (Criteria) this;
        }

        public Criteria andTopic31FourGreaterThan(String value) {
            addCriterion("topic31_four >", value, "topic31Four");
            return (Criteria) this;
        }

        public Criteria andTopic31FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic31_four >=", value, "topic31Four");
            return (Criteria) this;
        }

        public Criteria andTopic31FourLessThan(String value) {
            addCriterion("topic31_four <", value, "topic31Four");
            return (Criteria) this;
        }

        public Criteria andTopic31FourLessThanOrEqualTo(String value) {
            addCriterion("topic31_four <=", value, "topic31Four");
            return (Criteria) this;
        }

        public Criteria andTopic31FourLike(String value) {
            addCriterion("topic31_four like", value, "topic31Four");
            return (Criteria) this;
        }

        public Criteria andTopic31FourNotLike(String value) {
            addCriterion("topic31_four not like", value, "topic31Four");
            return (Criteria) this;
        }

        public Criteria andTopic31FourIn(List<String> values) {
            addCriterion("topic31_four in", values, "topic31Four");
            return (Criteria) this;
        }

        public Criteria andTopic31FourNotIn(List<String> values) {
            addCriterion("topic31_four not in", values, "topic31Four");
            return (Criteria) this;
        }

        public Criteria andTopic31FourBetween(String value1, String value2) {
            addCriterion("topic31_four between", value1, value2, "topic31Four");
            return (Criteria) this;
        }

        public Criteria andTopic31FourNotBetween(String value1, String value2) {
            addCriterion("topic31_four not between", value1, value2, "topic31Four");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionIsNull() {
            addCriterion("topic31_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionIsNotNull() {
            addCriterion("topic31_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionEqualTo(String value) {
            addCriterion("topic31_fraction =", value, "topic31Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionNotEqualTo(String value) {
            addCriterion("topic31_fraction <>", value, "topic31Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionGreaterThan(String value) {
            addCriterion("topic31_fraction >", value, "topic31Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic31_fraction >=", value, "topic31Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionLessThan(String value) {
            addCriterion("topic31_fraction <", value, "topic31Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionLessThanOrEqualTo(String value) {
            addCriterion("topic31_fraction <=", value, "topic31Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionLike(String value) {
            addCriterion("topic31_fraction like", value, "topic31Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionNotLike(String value) {
            addCriterion("topic31_fraction not like", value, "topic31Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionIn(List<String> values) {
            addCriterion("topic31_fraction in", values, "topic31Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionNotIn(List<String> values) {
            addCriterion("topic31_fraction not in", values, "topic31Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionBetween(String value1, String value2) {
            addCriterion("topic31_fraction between", value1, value2, "topic31Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic31FractionNotBetween(String value1, String value2) {
            addCriterion("topic31_fraction not between", value1, value2, "topic31Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic31SixIsNull() {
            addCriterion("topic31_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic31SixIsNotNull() {
            addCriterion("topic31_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic31SixEqualTo(String value) {
            addCriterion("topic31_six =", value, "topic31Six");
            return (Criteria) this;
        }

        public Criteria andTopic31SixNotEqualTo(String value) {
            addCriterion("topic31_six <>", value, "topic31Six");
            return (Criteria) this;
        }

        public Criteria andTopic31SixGreaterThan(String value) {
            addCriterion("topic31_six >", value, "topic31Six");
            return (Criteria) this;
        }

        public Criteria andTopic31SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic31_six >=", value, "topic31Six");
            return (Criteria) this;
        }

        public Criteria andTopic31SixLessThan(String value) {
            addCriterion("topic31_six <", value, "topic31Six");
            return (Criteria) this;
        }

        public Criteria andTopic31SixLessThanOrEqualTo(String value) {
            addCriterion("topic31_six <=", value, "topic31Six");
            return (Criteria) this;
        }

        public Criteria andTopic31SixLike(String value) {
            addCriterion("topic31_six like", value, "topic31Six");
            return (Criteria) this;
        }

        public Criteria andTopic31SixNotLike(String value) {
            addCriterion("topic31_six not like", value, "topic31Six");
            return (Criteria) this;
        }

        public Criteria andTopic31SixIn(List<String> values) {
            addCriterion("topic31_six in", values, "topic31Six");
            return (Criteria) this;
        }

        public Criteria andTopic31SixNotIn(List<String> values) {
            addCriterion("topic31_six not in", values, "topic31Six");
            return (Criteria) this;
        }

        public Criteria andTopic31SixBetween(String value1, String value2) {
            addCriterion("topic31_six between", value1, value2, "topic31Six");
            return (Criteria) this;
        }

        public Criteria andTopic31SixNotBetween(String value1, String value2) {
            addCriterion("topic31_six not between", value1, value2, "topic31Six");
            return (Criteria) this;
        }

        public Criteria andTopic32OneIsNull() {
            addCriterion("topic32_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic32OneIsNotNull() {
            addCriterion("topic32_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic32OneEqualTo(String value) {
            addCriterion("topic32_one =", value, "topic32One");
            return (Criteria) this;
        }

        public Criteria andTopic32OneNotEqualTo(String value) {
            addCriterion("topic32_one <>", value, "topic32One");
            return (Criteria) this;
        }

        public Criteria andTopic32OneGreaterThan(String value) {
            addCriterion("topic32_one >", value, "topic32One");
            return (Criteria) this;
        }

        public Criteria andTopic32OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic32_one >=", value, "topic32One");
            return (Criteria) this;
        }

        public Criteria andTopic32OneLessThan(String value) {
            addCriterion("topic32_one <", value, "topic32One");
            return (Criteria) this;
        }

        public Criteria andTopic32OneLessThanOrEqualTo(String value) {
            addCriterion("topic32_one <=", value, "topic32One");
            return (Criteria) this;
        }

        public Criteria andTopic32OneLike(String value) {
            addCriterion("topic32_one like", value, "topic32One");
            return (Criteria) this;
        }

        public Criteria andTopic32OneNotLike(String value) {
            addCriterion("topic32_one not like", value, "topic32One");
            return (Criteria) this;
        }

        public Criteria andTopic32OneIn(List<String> values) {
            addCriterion("topic32_one in", values, "topic32One");
            return (Criteria) this;
        }

        public Criteria andTopic32OneNotIn(List<String> values) {
            addCriterion("topic32_one not in", values, "topic32One");
            return (Criteria) this;
        }

        public Criteria andTopic32OneBetween(String value1, String value2) {
            addCriterion("topic32_one between", value1, value2, "topic32One");
            return (Criteria) this;
        }

        public Criteria andTopic32OneNotBetween(String value1, String value2) {
            addCriterion("topic32_one not between", value1, value2, "topic32One");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoIsNull() {
            addCriterion("topic32_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoIsNotNull() {
            addCriterion("topic32_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoEqualTo(String value) {
            addCriterion("topic32_two =", value, "topic32Two");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoNotEqualTo(String value) {
            addCriterion("topic32_two <>", value, "topic32Two");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoGreaterThan(String value) {
            addCriterion("topic32_two >", value, "topic32Two");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic32_two >=", value, "topic32Two");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoLessThan(String value) {
            addCriterion("topic32_two <", value, "topic32Two");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoLessThanOrEqualTo(String value) {
            addCriterion("topic32_two <=", value, "topic32Two");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoLike(String value) {
            addCriterion("topic32_two like", value, "topic32Two");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoNotLike(String value) {
            addCriterion("topic32_two not like", value, "topic32Two");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoIn(List<String> values) {
            addCriterion("topic32_two in", values, "topic32Two");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoNotIn(List<String> values) {
            addCriterion("topic32_two not in", values, "topic32Two");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoBetween(String value1, String value2) {
            addCriterion("topic32_two between", value1, value2, "topic32Two");
            return (Criteria) this;
        }

        public Criteria andTopic32TwoNotBetween(String value1, String value2) {
            addCriterion("topic32_two not between", value1, value2, "topic32Two");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeIsNull() {
            addCriterion("topic32_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeIsNotNull() {
            addCriterion("topic32_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeEqualTo(String value) {
            addCriterion("topic32_three =", value, "topic32Three");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeNotEqualTo(String value) {
            addCriterion("topic32_three <>", value, "topic32Three");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeGreaterThan(String value) {
            addCriterion("topic32_three >", value, "topic32Three");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic32_three >=", value, "topic32Three");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeLessThan(String value) {
            addCriterion("topic32_three <", value, "topic32Three");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic32_three <=", value, "topic32Three");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeLike(String value) {
            addCriterion("topic32_three like", value, "topic32Three");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeNotLike(String value) {
            addCriterion("topic32_three not like", value, "topic32Three");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeIn(List<String> values) {
            addCriterion("topic32_three in", values, "topic32Three");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeNotIn(List<String> values) {
            addCriterion("topic32_three not in", values, "topic32Three");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeBetween(String value1, String value2) {
            addCriterion("topic32_three between", value1, value2, "topic32Three");
            return (Criteria) this;
        }

        public Criteria andTopic32ThreeNotBetween(String value1, String value2) {
            addCriterion("topic32_three not between", value1, value2, "topic32Three");
            return (Criteria) this;
        }

        public Criteria andTopic32FourIsNull() {
            addCriterion("topic32_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic32FourIsNotNull() {
            addCriterion("topic32_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic32FourEqualTo(String value) {
            addCriterion("topic32_four =", value, "topic32Four");
            return (Criteria) this;
        }

        public Criteria andTopic32FourNotEqualTo(String value) {
            addCriterion("topic32_four <>", value, "topic32Four");
            return (Criteria) this;
        }

        public Criteria andTopic32FourGreaterThan(String value) {
            addCriterion("topic32_four >", value, "topic32Four");
            return (Criteria) this;
        }

        public Criteria andTopic32FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic32_four >=", value, "topic32Four");
            return (Criteria) this;
        }

        public Criteria andTopic32FourLessThan(String value) {
            addCriterion("topic32_four <", value, "topic32Four");
            return (Criteria) this;
        }

        public Criteria andTopic32FourLessThanOrEqualTo(String value) {
            addCriterion("topic32_four <=", value, "topic32Four");
            return (Criteria) this;
        }

        public Criteria andTopic32FourLike(String value) {
            addCriterion("topic32_four like", value, "topic32Four");
            return (Criteria) this;
        }

        public Criteria andTopic32FourNotLike(String value) {
            addCriterion("topic32_four not like", value, "topic32Four");
            return (Criteria) this;
        }

        public Criteria andTopic32FourIn(List<String> values) {
            addCriterion("topic32_four in", values, "topic32Four");
            return (Criteria) this;
        }

        public Criteria andTopic32FourNotIn(List<String> values) {
            addCriterion("topic32_four not in", values, "topic32Four");
            return (Criteria) this;
        }

        public Criteria andTopic32FourBetween(String value1, String value2) {
            addCriterion("topic32_four between", value1, value2, "topic32Four");
            return (Criteria) this;
        }

        public Criteria andTopic32FourNotBetween(String value1, String value2) {
            addCriterion("topic32_four not between", value1, value2, "topic32Four");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionIsNull() {
            addCriterion("topic32_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionIsNotNull() {
            addCriterion("topic32_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionEqualTo(String value) {
            addCriterion("topic32_fraction =", value, "topic32Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionNotEqualTo(String value) {
            addCriterion("topic32_fraction <>", value, "topic32Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionGreaterThan(String value) {
            addCriterion("topic32_fraction >", value, "topic32Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic32_fraction >=", value, "topic32Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionLessThan(String value) {
            addCriterion("topic32_fraction <", value, "topic32Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionLessThanOrEqualTo(String value) {
            addCriterion("topic32_fraction <=", value, "topic32Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionLike(String value) {
            addCriterion("topic32_fraction like", value, "topic32Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionNotLike(String value) {
            addCriterion("topic32_fraction not like", value, "topic32Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionIn(List<String> values) {
            addCriterion("topic32_fraction in", values, "topic32Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionNotIn(List<String> values) {
            addCriterion("topic32_fraction not in", values, "topic32Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionBetween(String value1, String value2) {
            addCriterion("topic32_fraction between", value1, value2, "topic32Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic32FractionNotBetween(String value1, String value2) {
            addCriterion("topic32_fraction not between", value1, value2, "topic32Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic32SixIsNull() {
            addCriterion("topic32_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic32SixIsNotNull() {
            addCriterion("topic32_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic32SixEqualTo(String value) {
            addCriterion("topic32_six =", value, "topic32Six");
            return (Criteria) this;
        }

        public Criteria andTopic32SixNotEqualTo(String value) {
            addCriterion("topic32_six <>", value, "topic32Six");
            return (Criteria) this;
        }

        public Criteria andTopic32SixGreaterThan(String value) {
            addCriterion("topic32_six >", value, "topic32Six");
            return (Criteria) this;
        }

        public Criteria andTopic32SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic32_six >=", value, "topic32Six");
            return (Criteria) this;
        }

        public Criteria andTopic32SixLessThan(String value) {
            addCriterion("topic32_six <", value, "topic32Six");
            return (Criteria) this;
        }

        public Criteria andTopic32SixLessThanOrEqualTo(String value) {
            addCriterion("topic32_six <=", value, "topic32Six");
            return (Criteria) this;
        }

        public Criteria andTopic32SixLike(String value) {
            addCriterion("topic32_six like", value, "topic32Six");
            return (Criteria) this;
        }

        public Criteria andTopic32SixNotLike(String value) {
            addCriterion("topic32_six not like", value, "topic32Six");
            return (Criteria) this;
        }

        public Criteria andTopic32SixIn(List<String> values) {
            addCriterion("topic32_six in", values, "topic32Six");
            return (Criteria) this;
        }

        public Criteria andTopic32SixNotIn(List<String> values) {
            addCriterion("topic32_six not in", values, "topic32Six");
            return (Criteria) this;
        }

        public Criteria andTopic32SixBetween(String value1, String value2) {
            addCriterion("topic32_six between", value1, value2, "topic32Six");
            return (Criteria) this;
        }

        public Criteria andTopic32SixNotBetween(String value1, String value2) {
            addCriterion("topic32_six not between", value1, value2, "topic32Six");
            return (Criteria) this;
        }

        public Criteria andTopic33OneIsNull() {
            addCriterion("topic33_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic33OneIsNotNull() {
            addCriterion("topic33_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic33OneEqualTo(String value) {
            addCriterion("topic33_one =", value, "topic33One");
            return (Criteria) this;
        }

        public Criteria andTopic33OneNotEqualTo(String value) {
            addCriterion("topic33_one <>", value, "topic33One");
            return (Criteria) this;
        }

        public Criteria andTopic33OneGreaterThan(String value) {
            addCriterion("topic33_one >", value, "topic33One");
            return (Criteria) this;
        }

        public Criteria andTopic33OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic33_one >=", value, "topic33One");
            return (Criteria) this;
        }

        public Criteria andTopic33OneLessThan(String value) {
            addCriterion("topic33_one <", value, "topic33One");
            return (Criteria) this;
        }

        public Criteria andTopic33OneLessThanOrEqualTo(String value) {
            addCriterion("topic33_one <=", value, "topic33One");
            return (Criteria) this;
        }

        public Criteria andTopic33OneLike(String value) {
            addCriterion("topic33_one like", value, "topic33One");
            return (Criteria) this;
        }

        public Criteria andTopic33OneNotLike(String value) {
            addCriterion("topic33_one not like", value, "topic33One");
            return (Criteria) this;
        }

        public Criteria andTopic33OneIn(List<String> values) {
            addCriterion("topic33_one in", values, "topic33One");
            return (Criteria) this;
        }

        public Criteria andTopic33OneNotIn(List<String> values) {
            addCriterion("topic33_one not in", values, "topic33One");
            return (Criteria) this;
        }

        public Criteria andTopic33OneBetween(String value1, String value2) {
            addCriterion("topic33_one between", value1, value2, "topic33One");
            return (Criteria) this;
        }

        public Criteria andTopic33OneNotBetween(String value1, String value2) {
            addCriterion("topic33_one not between", value1, value2, "topic33One");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoIsNull() {
            addCriterion("topic33_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoIsNotNull() {
            addCriterion("topic33_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoEqualTo(String value) {
            addCriterion("topic33_two =", value, "topic33Two");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoNotEqualTo(String value) {
            addCriterion("topic33_two <>", value, "topic33Two");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoGreaterThan(String value) {
            addCriterion("topic33_two >", value, "topic33Two");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic33_two >=", value, "topic33Two");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoLessThan(String value) {
            addCriterion("topic33_two <", value, "topic33Two");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoLessThanOrEqualTo(String value) {
            addCriterion("topic33_two <=", value, "topic33Two");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoLike(String value) {
            addCriterion("topic33_two like", value, "topic33Two");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoNotLike(String value) {
            addCriterion("topic33_two not like", value, "topic33Two");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoIn(List<String> values) {
            addCriterion("topic33_two in", values, "topic33Two");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoNotIn(List<String> values) {
            addCriterion("topic33_two not in", values, "topic33Two");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoBetween(String value1, String value2) {
            addCriterion("topic33_two between", value1, value2, "topic33Two");
            return (Criteria) this;
        }

        public Criteria andTopic33TwoNotBetween(String value1, String value2) {
            addCriterion("topic33_two not between", value1, value2, "topic33Two");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeIsNull() {
            addCriterion("topic33_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeIsNotNull() {
            addCriterion("topic33_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeEqualTo(String value) {
            addCriterion("topic33_three =", value, "topic33Three");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeNotEqualTo(String value) {
            addCriterion("topic33_three <>", value, "topic33Three");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeGreaterThan(String value) {
            addCriterion("topic33_three >", value, "topic33Three");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic33_three >=", value, "topic33Three");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeLessThan(String value) {
            addCriterion("topic33_three <", value, "topic33Three");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic33_three <=", value, "topic33Three");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeLike(String value) {
            addCriterion("topic33_three like", value, "topic33Three");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeNotLike(String value) {
            addCriterion("topic33_three not like", value, "topic33Three");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeIn(List<String> values) {
            addCriterion("topic33_three in", values, "topic33Three");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeNotIn(List<String> values) {
            addCriterion("topic33_three not in", values, "topic33Three");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeBetween(String value1, String value2) {
            addCriterion("topic33_three between", value1, value2, "topic33Three");
            return (Criteria) this;
        }

        public Criteria andTopic33ThreeNotBetween(String value1, String value2) {
            addCriterion("topic33_three not between", value1, value2, "topic33Three");
            return (Criteria) this;
        }

        public Criteria andTopic33FourIsNull() {
            addCriterion("topic33_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic33FourIsNotNull() {
            addCriterion("topic33_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic33FourEqualTo(String value) {
            addCriterion("topic33_four =", value, "topic33Four");
            return (Criteria) this;
        }

        public Criteria andTopic33FourNotEqualTo(String value) {
            addCriterion("topic33_four <>", value, "topic33Four");
            return (Criteria) this;
        }

        public Criteria andTopic33FourGreaterThan(String value) {
            addCriterion("topic33_four >", value, "topic33Four");
            return (Criteria) this;
        }

        public Criteria andTopic33FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic33_four >=", value, "topic33Four");
            return (Criteria) this;
        }

        public Criteria andTopic33FourLessThan(String value) {
            addCriterion("topic33_four <", value, "topic33Four");
            return (Criteria) this;
        }

        public Criteria andTopic33FourLessThanOrEqualTo(String value) {
            addCriterion("topic33_four <=", value, "topic33Four");
            return (Criteria) this;
        }

        public Criteria andTopic33FourLike(String value) {
            addCriterion("topic33_four like", value, "topic33Four");
            return (Criteria) this;
        }

        public Criteria andTopic33FourNotLike(String value) {
            addCriterion("topic33_four not like", value, "topic33Four");
            return (Criteria) this;
        }

        public Criteria andTopic33FourIn(List<String> values) {
            addCriterion("topic33_four in", values, "topic33Four");
            return (Criteria) this;
        }

        public Criteria andTopic33FourNotIn(List<String> values) {
            addCriterion("topic33_four not in", values, "topic33Four");
            return (Criteria) this;
        }

        public Criteria andTopic33FourBetween(String value1, String value2) {
            addCriterion("topic33_four between", value1, value2, "topic33Four");
            return (Criteria) this;
        }

        public Criteria andTopic33FourNotBetween(String value1, String value2) {
            addCriterion("topic33_four not between", value1, value2, "topic33Four");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionIsNull() {
            addCriterion("topic33_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionIsNotNull() {
            addCriterion("topic33_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionEqualTo(String value) {
            addCriterion("topic33_fraction =", value, "topic33Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionNotEqualTo(String value) {
            addCriterion("topic33_fraction <>", value, "topic33Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionGreaterThan(String value) {
            addCriterion("topic33_fraction >", value, "topic33Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic33_fraction >=", value, "topic33Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionLessThan(String value) {
            addCriterion("topic33_fraction <", value, "topic33Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionLessThanOrEqualTo(String value) {
            addCriterion("topic33_fraction <=", value, "topic33Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionLike(String value) {
            addCriterion("topic33_fraction like", value, "topic33Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionNotLike(String value) {
            addCriterion("topic33_fraction not like", value, "topic33Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionIn(List<String> values) {
            addCriterion("topic33_fraction in", values, "topic33Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionNotIn(List<String> values) {
            addCriterion("topic33_fraction not in", values, "topic33Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionBetween(String value1, String value2) {
            addCriterion("topic33_fraction between", value1, value2, "topic33Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic33FractionNotBetween(String value1, String value2) {
            addCriterion("topic33_fraction not between", value1, value2, "topic33Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic33SixIsNull() {
            addCriterion("topic33_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic33SixIsNotNull() {
            addCriterion("topic33_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic33SixEqualTo(String value) {
            addCriterion("topic33_six =", value, "topic33Six");
            return (Criteria) this;
        }

        public Criteria andTopic33SixNotEqualTo(String value) {
            addCriterion("topic33_six <>", value, "topic33Six");
            return (Criteria) this;
        }

        public Criteria andTopic33SixGreaterThan(String value) {
            addCriterion("topic33_six >", value, "topic33Six");
            return (Criteria) this;
        }

        public Criteria andTopic33SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic33_six >=", value, "topic33Six");
            return (Criteria) this;
        }

        public Criteria andTopic33SixLessThan(String value) {
            addCriterion("topic33_six <", value, "topic33Six");
            return (Criteria) this;
        }

        public Criteria andTopic33SixLessThanOrEqualTo(String value) {
            addCriterion("topic33_six <=", value, "topic33Six");
            return (Criteria) this;
        }

        public Criteria andTopic33SixLike(String value) {
            addCriterion("topic33_six like", value, "topic33Six");
            return (Criteria) this;
        }

        public Criteria andTopic33SixNotLike(String value) {
            addCriterion("topic33_six not like", value, "topic33Six");
            return (Criteria) this;
        }

        public Criteria andTopic33SixIn(List<String> values) {
            addCriterion("topic33_six in", values, "topic33Six");
            return (Criteria) this;
        }

        public Criteria andTopic33SixNotIn(List<String> values) {
            addCriterion("topic33_six not in", values, "topic33Six");
            return (Criteria) this;
        }

        public Criteria andTopic33SixBetween(String value1, String value2) {
            addCriterion("topic33_six between", value1, value2, "topic33Six");
            return (Criteria) this;
        }

        public Criteria andTopic33SixNotBetween(String value1, String value2) {
            addCriterion("topic33_six not between", value1, value2, "topic33Six");
            return (Criteria) this;
        }

        public Criteria andTopic34OneIsNull() {
            addCriterion("topic34_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic34OneIsNotNull() {
            addCriterion("topic34_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic34OneEqualTo(String value) {
            addCriterion("topic34_one =", value, "topic34One");
            return (Criteria) this;
        }

        public Criteria andTopic34OneNotEqualTo(String value) {
            addCriterion("topic34_one <>", value, "topic34One");
            return (Criteria) this;
        }

        public Criteria andTopic34OneGreaterThan(String value) {
            addCriterion("topic34_one >", value, "topic34One");
            return (Criteria) this;
        }

        public Criteria andTopic34OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic34_one >=", value, "topic34One");
            return (Criteria) this;
        }

        public Criteria andTopic34OneLessThan(String value) {
            addCriterion("topic34_one <", value, "topic34One");
            return (Criteria) this;
        }

        public Criteria andTopic34OneLessThanOrEqualTo(String value) {
            addCriterion("topic34_one <=", value, "topic34One");
            return (Criteria) this;
        }

        public Criteria andTopic34OneLike(String value) {
            addCriterion("topic34_one like", value, "topic34One");
            return (Criteria) this;
        }

        public Criteria andTopic34OneNotLike(String value) {
            addCriterion("topic34_one not like", value, "topic34One");
            return (Criteria) this;
        }

        public Criteria andTopic34OneIn(List<String> values) {
            addCriterion("topic34_one in", values, "topic34One");
            return (Criteria) this;
        }

        public Criteria andTopic34OneNotIn(List<String> values) {
            addCriterion("topic34_one not in", values, "topic34One");
            return (Criteria) this;
        }

        public Criteria andTopic34OneBetween(String value1, String value2) {
            addCriterion("topic34_one between", value1, value2, "topic34One");
            return (Criteria) this;
        }

        public Criteria andTopic34OneNotBetween(String value1, String value2) {
            addCriterion("topic34_one not between", value1, value2, "topic34One");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoIsNull() {
            addCriterion("topic34_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoIsNotNull() {
            addCriterion("topic34_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoEqualTo(String value) {
            addCriterion("topic34_two =", value, "topic34Two");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoNotEqualTo(String value) {
            addCriterion("topic34_two <>", value, "topic34Two");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoGreaterThan(String value) {
            addCriterion("topic34_two >", value, "topic34Two");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic34_two >=", value, "topic34Two");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoLessThan(String value) {
            addCriterion("topic34_two <", value, "topic34Two");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoLessThanOrEqualTo(String value) {
            addCriterion("topic34_two <=", value, "topic34Two");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoLike(String value) {
            addCriterion("topic34_two like", value, "topic34Two");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoNotLike(String value) {
            addCriterion("topic34_two not like", value, "topic34Two");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoIn(List<String> values) {
            addCriterion("topic34_two in", values, "topic34Two");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoNotIn(List<String> values) {
            addCriterion("topic34_two not in", values, "topic34Two");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoBetween(String value1, String value2) {
            addCriterion("topic34_two between", value1, value2, "topic34Two");
            return (Criteria) this;
        }

        public Criteria andTopic34TwoNotBetween(String value1, String value2) {
            addCriterion("topic34_two not between", value1, value2, "topic34Two");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeIsNull() {
            addCriterion("topic34_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeIsNotNull() {
            addCriterion("topic34_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeEqualTo(String value) {
            addCriterion("topic34_three =", value, "topic34Three");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeNotEqualTo(String value) {
            addCriterion("topic34_three <>", value, "topic34Three");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeGreaterThan(String value) {
            addCriterion("topic34_three >", value, "topic34Three");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic34_three >=", value, "topic34Three");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeLessThan(String value) {
            addCriterion("topic34_three <", value, "topic34Three");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic34_three <=", value, "topic34Three");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeLike(String value) {
            addCriterion("topic34_three like", value, "topic34Three");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeNotLike(String value) {
            addCriterion("topic34_three not like", value, "topic34Three");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeIn(List<String> values) {
            addCriterion("topic34_three in", values, "topic34Three");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeNotIn(List<String> values) {
            addCriterion("topic34_three not in", values, "topic34Three");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeBetween(String value1, String value2) {
            addCriterion("topic34_three between", value1, value2, "topic34Three");
            return (Criteria) this;
        }

        public Criteria andTopic34ThreeNotBetween(String value1, String value2) {
            addCriterion("topic34_three not between", value1, value2, "topic34Three");
            return (Criteria) this;
        }

        public Criteria andTopic34FourIsNull() {
            addCriterion("topic34_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic34FourIsNotNull() {
            addCriterion("topic34_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic34FourEqualTo(String value) {
            addCriterion("topic34_four =", value, "topic34Four");
            return (Criteria) this;
        }

        public Criteria andTopic34FourNotEqualTo(String value) {
            addCriterion("topic34_four <>", value, "topic34Four");
            return (Criteria) this;
        }

        public Criteria andTopic34FourGreaterThan(String value) {
            addCriterion("topic34_four >", value, "topic34Four");
            return (Criteria) this;
        }

        public Criteria andTopic34FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic34_four >=", value, "topic34Four");
            return (Criteria) this;
        }

        public Criteria andTopic34FourLessThan(String value) {
            addCriterion("topic34_four <", value, "topic34Four");
            return (Criteria) this;
        }

        public Criteria andTopic34FourLessThanOrEqualTo(String value) {
            addCriterion("topic34_four <=", value, "topic34Four");
            return (Criteria) this;
        }

        public Criteria andTopic34FourLike(String value) {
            addCriterion("topic34_four like", value, "topic34Four");
            return (Criteria) this;
        }

        public Criteria andTopic34FourNotLike(String value) {
            addCriterion("topic34_four not like", value, "topic34Four");
            return (Criteria) this;
        }

        public Criteria andTopic34FourIn(List<String> values) {
            addCriterion("topic34_four in", values, "topic34Four");
            return (Criteria) this;
        }

        public Criteria andTopic34FourNotIn(List<String> values) {
            addCriterion("topic34_four not in", values, "topic34Four");
            return (Criteria) this;
        }

        public Criteria andTopic34FourBetween(String value1, String value2) {
            addCriterion("topic34_four between", value1, value2, "topic34Four");
            return (Criteria) this;
        }

        public Criteria andTopic34FourNotBetween(String value1, String value2) {
            addCriterion("topic34_four not between", value1, value2, "topic34Four");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionIsNull() {
            addCriterion("topic34_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionIsNotNull() {
            addCriterion("topic34_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionEqualTo(String value) {
            addCriterion("topic34_fraction =", value, "topic34Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionNotEqualTo(String value) {
            addCriterion("topic34_fraction <>", value, "topic34Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionGreaterThan(String value) {
            addCriterion("topic34_fraction >", value, "topic34Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic34_fraction >=", value, "topic34Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionLessThan(String value) {
            addCriterion("topic34_fraction <", value, "topic34Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionLessThanOrEqualTo(String value) {
            addCriterion("topic34_fraction <=", value, "topic34Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionLike(String value) {
            addCriterion("topic34_fraction like", value, "topic34Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionNotLike(String value) {
            addCriterion("topic34_fraction not like", value, "topic34Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionIn(List<String> values) {
            addCriterion("topic34_fraction in", values, "topic34Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionNotIn(List<String> values) {
            addCriterion("topic34_fraction not in", values, "topic34Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionBetween(String value1, String value2) {
            addCriterion("topic34_fraction between", value1, value2, "topic34Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic34FractionNotBetween(String value1, String value2) {
            addCriterion("topic34_fraction not between", value1, value2, "topic34Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic34SixIsNull() {
            addCriterion("topic34_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic34SixIsNotNull() {
            addCriterion("topic34_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic34SixEqualTo(String value) {
            addCriterion("topic34_six =", value, "topic34Six");
            return (Criteria) this;
        }

        public Criteria andTopic34SixNotEqualTo(String value) {
            addCriterion("topic34_six <>", value, "topic34Six");
            return (Criteria) this;
        }

        public Criteria andTopic34SixGreaterThan(String value) {
            addCriterion("topic34_six >", value, "topic34Six");
            return (Criteria) this;
        }

        public Criteria andTopic34SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic34_six >=", value, "topic34Six");
            return (Criteria) this;
        }

        public Criteria andTopic34SixLessThan(String value) {
            addCriterion("topic34_six <", value, "topic34Six");
            return (Criteria) this;
        }

        public Criteria andTopic34SixLessThanOrEqualTo(String value) {
            addCriterion("topic34_six <=", value, "topic34Six");
            return (Criteria) this;
        }

        public Criteria andTopic34SixLike(String value) {
            addCriterion("topic34_six like", value, "topic34Six");
            return (Criteria) this;
        }

        public Criteria andTopic34SixNotLike(String value) {
            addCriterion("topic34_six not like", value, "topic34Six");
            return (Criteria) this;
        }

        public Criteria andTopic34SixIn(List<String> values) {
            addCriterion("topic34_six in", values, "topic34Six");
            return (Criteria) this;
        }

        public Criteria andTopic34SixNotIn(List<String> values) {
            addCriterion("topic34_six not in", values, "topic34Six");
            return (Criteria) this;
        }

        public Criteria andTopic34SixBetween(String value1, String value2) {
            addCriterion("topic34_six between", value1, value2, "topic34Six");
            return (Criteria) this;
        }

        public Criteria andTopic34SixNotBetween(String value1, String value2) {
            addCriterion("topic34_six not between", value1, value2, "topic34Six");
            return (Criteria) this;
        }

        public Criteria andTopic35OneIsNull() {
            addCriterion("topic35_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic35OneIsNotNull() {
            addCriterion("topic35_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic35OneEqualTo(String value) {
            addCriterion("topic35_one =", value, "topic35One");
            return (Criteria) this;
        }

        public Criteria andTopic35OneNotEqualTo(String value) {
            addCriterion("topic35_one <>", value, "topic35One");
            return (Criteria) this;
        }

        public Criteria andTopic35OneGreaterThan(String value) {
            addCriterion("topic35_one >", value, "topic35One");
            return (Criteria) this;
        }

        public Criteria andTopic35OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic35_one >=", value, "topic35One");
            return (Criteria) this;
        }

        public Criteria andTopic35OneLessThan(String value) {
            addCriterion("topic35_one <", value, "topic35One");
            return (Criteria) this;
        }

        public Criteria andTopic35OneLessThanOrEqualTo(String value) {
            addCriterion("topic35_one <=", value, "topic35One");
            return (Criteria) this;
        }

        public Criteria andTopic35OneLike(String value) {
            addCriterion("topic35_one like", value, "topic35One");
            return (Criteria) this;
        }

        public Criteria andTopic35OneNotLike(String value) {
            addCriterion("topic35_one not like", value, "topic35One");
            return (Criteria) this;
        }

        public Criteria andTopic35OneIn(List<String> values) {
            addCriterion("topic35_one in", values, "topic35One");
            return (Criteria) this;
        }

        public Criteria andTopic35OneNotIn(List<String> values) {
            addCriterion("topic35_one not in", values, "topic35One");
            return (Criteria) this;
        }

        public Criteria andTopic35OneBetween(String value1, String value2) {
            addCriterion("topic35_one between", value1, value2, "topic35One");
            return (Criteria) this;
        }

        public Criteria andTopic35OneNotBetween(String value1, String value2) {
            addCriterion("topic35_one not between", value1, value2, "topic35One");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoIsNull() {
            addCriterion("topic35_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoIsNotNull() {
            addCriterion("topic35_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoEqualTo(String value) {
            addCriterion("topic35_two =", value, "topic35Two");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoNotEqualTo(String value) {
            addCriterion("topic35_two <>", value, "topic35Two");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoGreaterThan(String value) {
            addCriterion("topic35_two >", value, "topic35Two");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic35_two >=", value, "topic35Two");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoLessThan(String value) {
            addCriterion("topic35_two <", value, "topic35Two");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoLessThanOrEqualTo(String value) {
            addCriterion("topic35_two <=", value, "topic35Two");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoLike(String value) {
            addCriterion("topic35_two like", value, "topic35Two");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoNotLike(String value) {
            addCriterion("topic35_two not like", value, "topic35Two");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoIn(List<String> values) {
            addCriterion("topic35_two in", values, "topic35Two");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoNotIn(List<String> values) {
            addCriterion("topic35_two not in", values, "topic35Two");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoBetween(String value1, String value2) {
            addCriterion("topic35_two between", value1, value2, "topic35Two");
            return (Criteria) this;
        }

        public Criteria andTopic35TwoNotBetween(String value1, String value2) {
            addCriterion("topic35_two not between", value1, value2, "topic35Two");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeIsNull() {
            addCriterion("topic35_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeIsNotNull() {
            addCriterion("topic35_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeEqualTo(String value) {
            addCriterion("topic35_three =", value, "topic35Three");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeNotEqualTo(String value) {
            addCriterion("topic35_three <>", value, "topic35Three");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeGreaterThan(String value) {
            addCriterion("topic35_three >", value, "topic35Three");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic35_three >=", value, "topic35Three");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeLessThan(String value) {
            addCriterion("topic35_three <", value, "topic35Three");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic35_three <=", value, "topic35Three");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeLike(String value) {
            addCriterion("topic35_three like", value, "topic35Three");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeNotLike(String value) {
            addCriterion("topic35_three not like", value, "topic35Three");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeIn(List<String> values) {
            addCriterion("topic35_three in", values, "topic35Three");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeNotIn(List<String> values) {
            addCriterion("topic35_three not in", values, "topic35Three");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeBetween(String value1, String value2) {
            addCriterion("topic35_three between", value1, value2, "topic35Three");
            return (Criteria) this;
        }

        public Criteria andTopic35ThreeNotBetween(String value1, String value2) {
            addCriterion("topic35_three not between", value1, value2, "topic35Three");
            return (Criteria) this;
        }

        public Criteria andTopic35FourIsNull() {
            addCriterion("topic35_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic35FourIsNotNull() {
            addCriterion("topic35_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic35FourEqualTo(String value) {
            addCriterion("topic35_four =", value, "topic35Four");
            return (Criteria) this;
        }

        public Criteria andTopic35FourNotEqualTo(String value) {
            addCriterion("topic35_four <>", value, "topic35Four");
            return (Criteria) this;
        }

        public Criteria andTopic35FourGreaterThan(String value) {
            addCriterion("topic35_four >", value, "topic35Four");
            return (Criteria) this;
        }

        public Criteria andTopic35FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic35_four >=", value, "topic35Four");
            return (Criteria) this;
        }

        public Criteria andTopic35FourLessThan(String value) {
            addCriterion("topic35_four <", value, "topic35Four");
            return (Criteria) this;
        }

        public Criteria andTopic35FourLessThanOrEqualTo(String value) {
            addCriterion("topic35_four <=", value, "topic35Four");
            return (Criteria) this;
        }

        public Criteria andTopic35FourLike(String value) {
            addCriterion("topic35_four like", value, "topic35Four");
            return (Criteria) this;
        }

        public Criteria andTopic35FourNotLike(String value) {
            addCriterion("topic35_four not like", value, "topic35Four");
            return (Criteria) this;
        }

        public Criteria andTopic35FourIn(List<String> values) {
            addCriterion("topic35_four in", values, "topic35Four");
            return (Criteria) this;
        }

        public Criteria andTopic35FourNotIn(List<String> values) {
            addCriterion("topic35_four not in", values, "topic35Four");
            return (Criteria) this;
        }

        public Criteria andTopic35FourBetween(String value1, String value2) {
            addCriterion("topic35_four between", value1, value2, "topic35Four");
            return (Criteria) this;
        }

        public Criteria andTopic35FourNotBetween(String value1, String value2) {
            addCriterion("topic35_four not between", value1, value2, "topic35Four");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionIsNull() {
            addCriterion("topic35_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionIsNotNull() {
            addCriterion("topic35_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionEqualTo(String value) {
            addCriterion("topic35_fraction =", value, "topic35Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionNotEqualTo(String value) {
            addCriterion("topic35_fraction <>", value, "topic35Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionGreaterThan(String value) {
            addCriterion("topic35_fraction >", value, "topic35Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic35_fraction >=", value, "topic35Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionLessThan(String value) {
            addCriterion("topic35_fraction <", value, "topic35Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionLessThanOrEqualTo(String value) {
            addCriterion("topic35_fraction <=", value, "topic35Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionLike(String value) {
            addCriterion("topic35_fraction like", value, "topic35Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionNotLike(String value) {
            addCriterion("topic35_fraction not like", value, "topic35Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionIn(List<String> values) {
            addCriterion("topic35_fraction in", values, "topic35Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionNotIn(List<String> values) {
            addCriterion("topic35_fraction not in", values, "topic35Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionBetween(String value1, String value2) {
            addCriterion("topic35_fraction between", value1, value2, "topic35Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic35FractionNotBetween(String value1, String value2) {
            addCriterion("topic35_fraction not between", value1, value2, "topic35Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic35SixIsNull() {
            addCriterion("topic35_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic35SixIsNotNull() {
            addCriterion("topic35_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic35SixEqualTo(String value) {
            addCriterion("topic35_six =", value, "topic35Six");
            return (Criteria) this;
        }

        public Criteria andTopic35SixNotEqualTo(String value) {
            addCriterion("topic35_six <>", value, "topic35Six");
            return (Criteria) this;
        }

        public Criteria andTopic35SixGreaterThan(String value) {
            addCriterion("topic35_six >", value, "topic35Six");
            return (Criteria) this;
        }

        public Criteria andTopic35SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic35_six >=", value, "topic35Six");
            return (Criteria) this;
        }

        public Criteria andTopic35SixLessThan(String value) {
            addCriterion("topic35_six <", value, "topic35Six");
            return (Criteria) this;
        }

        public Criteria andTopic35SixLessThanOrEqualTo(String value) {
            addCriterion("topic35_six <=", value, "topic35Six");
            return (Criteria) this;
        }

        public Criteria andTopic35SixLike(String value) {
            addCriterion("topic35_six like", value, "topic35Six");
            return (Criteria) this;
        }

        public Criteria andTopic35SixNotLike(String value) {
            addCriterion("topic35_six not like", value, "topic35Six");
            return (Criteria) this;
        }

        public Criteria andTopic35SixIn(List<String> values) {
            addCriterion("topic35_six in", values, "topic35Six");
            return (Criteria) this;
        }

        public Criteria andTopic35SixNotIn(List<String> values) {
            addCriterion("topic35_six not in", values, "topic35Six");
            return (Criteria) this;
        }

        public Criteria andTopic35SixBetween(String value1, String value2) {
            addCriterion("topic35_six between", value1, value2, "topic35Six");
            return (Criteria) this;
        }

        public Criteria andTopic35SixNotBetween(String value1, String value2) {
            addCriterion("topic35_six not between", value1, value2, "topic35Six");
            return (Criteria) this;
        }

        public Criteria andTopic36OneIsNull() {
            addCriterion("topic36_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic36OneIsNotNull() {
            addCriterion("topic36_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic36OneEqualTo(String value) {
            addCriterion("topic36_one =", value, "topic36One");
            return (Criteria) this;
        }

        public Criteria andTopic36OneNotEqualTo(String value) {
            addCriterion("topic36_one <>", value, "topic36One");
            return (Criteria) this;
        }

        public Criteria andTopic36OneGreaterThan(String value) {
            addCriterion("topic36_one >", value, "topic36One");
            return (Criteria) this;
        }

        public Criteria andTopic36OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic36_one >=", value, "topic36One");
            return (Criteria) this;
        }

        public Criteria andTopic36OneLessThan(String value) {
            addCriterion("topic36_one <", value, "topic36One");
            return (Criteria) this;
        }

        public Criteria andTopic36OneLessThanOrEqualTo(String value) {
            addCriterion("topic36_one <=", value, "topic36One");
            return (Criteria) this;
        }

        public Criteria andTopic36OneLike(String value) {
            addCriterion("topic36_one like", value, "topic36One");
            return (Criteria) this;
        }

        public Criteria andTopic36OneNotLike(String value) {
            addCriterion("topic36_one not like", value, "topic36One");
            return (Criteria) this;
        }

        public Criteria andTopic36OneIn(List<String> values) {
            addCriterion("topic36_one in", values, "topic36One");
            return (Criteria) this;
        }

        public Criteria andTopic36OneNotIn(List<String> values) {
            addCriterion("topic36_one not in", values, "topic36One");
            return (Criteria) this;
        }

        public Criteria andTopic36OneBetween(String value1, String value2) {
            addCriterion("topic36_one between", value1, value2, "topic36One");
            return (Criteria) this;
        }

        public Criteria andTopic36OneNotBetween(String value1, String value2) {
            addCriterion("topic36_one not between", value1, value2, "topic36One");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoIsNull() {
            addCriterion("topic36_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoIsNotNull() {
            addCriterion("topic36_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoEqualTo(String value) {
            addCriterion("topic36_two =", value, "topic36Two");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoNotEqualTo(String value) {
            addCriterion("topic36_two <>", value, "topic36Two");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoGreaterThan(String value) {
            addCriterion("topic36_two >", value, "topic36Two");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic36_two >=", value, "topic36Two");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoLessThan(String value) {
            addCriterion("topic36_two <", value, "topic36Two");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoLessThanOrEqualTo(String value) {
            addCriterion("topic36_two <=", value, "topic36Two");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoLike(String value) {
            addCriterion("topic36_two like", value, "topic36Two");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoNotLike(String value) {
            addCriterion("topic36_two not like", value, "topic36Two");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoIn(List<String> values) {
            addCriterion("topic36_two in", values, "topic36Two");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoNotIn(List<String> values) {
            addCriterion("topic36_two not in", values, "topic36Two");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoBetween(String value1, String value2) {
            addCriterion("topic36_two between", value1, value2, "topic36Two");
            return (Criteria) this;
        }

        public Criteria andTopic36TwoNotBetween(String value1, String value2) {
            addCriterion("topic36_two not between", value1, value2, "topic36Two");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeIsNull() {
            addCriterion("topic36_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeIsNotNull() {
            addCriterion("topic36_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeEqualTo(String value) {
            addCriterion("topic36_three =", value, "topic36Three");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeNotEqualTo(String value) {
            addCriterion("topic36_three <>", value, "topic36Three");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeGreaterThan(String value) {
            addCriterion("topic36_three >", value, "topic36Three");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic36_three >=", value, "topic36Three");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeLessThan(String value) {
            addCriterion("topic36_three <", value, "topic36Three");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic36_three <=", value, "topic36Three");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeLike(String value) {
            addCriterion("topic36_three like", value, "topic36Three");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeNotLike(String value) {
            addCriterion("topic36_three not like", value, "topic36Three");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeIn(List<String> values) {
            addCriterion("topic36_three in", values, "topic36Three");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeNotIn(List<String> values) {
            addCriterion("topic36_three not in", values, "topic36Three");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeBetween(String value1, String value2) {
            addCriterion("topic36_three between", value1, value2, "topic36Three");
            return (Criteria) this;
        }

        public Criteria andTopic36ThreeNotBetween(String value1, String value2) {
            addCriterion("topic36_three not between", value1, value2, "topic36Three");
            return (Criteria) this;
        }

        public Criteria andTopic36FourIsNull() {
            addCriterion("topic36_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic36FourIsNotNull() {
            addCriterion("topic36_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic36FourEqualTo(String value) {
            addCriterion("topic36_four =", value, "topic36Four");
            return (Criteria) this;
        }

        public Criteria andTopic36FourNotEqualTo(String value) {
            addCriterion("topic36_four <>", value, "topic36Four");
            return (Criteria) this;
        }

        public Criteria andTopic36FourGreaterThan(String value) {
            addCriterion("topic36_four >", value, "topic36Four");
            return (Criteria) this;
        }

        public Criteria andTopic36FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic36_four >=", value, "topic36Four");
            return (Criteria) this;
        }

        public Criteria andTopic36FourLessThan(String value) {
            addCriterion("topic36_four <", value, "topic36Four");
            return (Criteria) this;
        }

        public Criteria andTopic36FourLessThanOrEqualTo(String value) {
            addCriterion("topic36_four <=", value, "topic36Four");
            return (Criteria) this;
        }

        public Criteria andTopic36FourLike(String value) {
            addCriterion("topic36_four like", value, "topic36Four");
            return (Criteria) this;
        }

        public Criteria andTopic36FourNotLike(String value) {
            addCriterion("topic36_four not like", value, "topic36Four");
            return (Criteria) this;
        }

        public Criteria andTopic36FourIn(List<String> values) {
            addCriterion("topic36_four in", values, "topic36Four");
            return (Criteria) this;
        }

        public Criteria andTopic36FourNotIn(List<String> values) {
            addCriterion("topic36_four not in", values, "topic36Four");
            return (Criteria) this;
        }

        public Criteria andTopic36FourBetween(String value1, String value2) {
            addCriterion("topic36_four between", value1, value2, "topic36Four");
            return (Criteria) this;
        }

        public Criteria andTopic36FourNotBetween(String value1, String value2) {
            addCriterion("topic36_four not between", value1, value2, "topic36Four");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionIsNull() {
            addCriterion("topic36_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionIsNotNull() {
            addCriterion("topic36_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionEqualTo(String value) {
            addCriterion("topic36_fraction =", value, "topic36Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionNotEqualTo(String value) {
            addCriterion("topic36_fraction <>", value, "topic36Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionGreaterThan(String value) {
            addCriterion("topic36_fraction >", value, "topic36Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic36_fraction >=", value, "topic36Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionLessThan(String value) {
            addCriterion("topic36_fraction <", value, "topic36Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionLessThanOrEqualTo(String value) {
            addCriterion("topic36_fraction <=", value, "topic36Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionLike(String value) {
            addCriterion("topic36_fraction like", value, "topic36Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionNotLike(String value) {
            addCriterion("topic36_fraction not like", value, "topic36Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionIn(List<String> values) {
            addCriterion("topic36_fraction in", values, "topic36Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionNotIn(List<String> values) {
            addCriterion("topic36_fraction not in", values, "topic36Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionBetween(String value1, String value2) {
            addCriterion("topic36_fraction between", value1, value2, "topic36Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic36FractionNotBetween(String value1, String value2) {
            addCriterion("topic36_fraction not between", value1, value2, "topic36Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic36SixIsNull() {
            addCriterion("topic36_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic36SixIsNotNull() {
            addCriterion("topic36_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic36SixEqualTo(String value) {
            addCriterion("topic36_six =", value, "topic36Six");
            return (Criteria) this;
        }

        public Criteria andTopic36SixNotEqualTo(String value) {
            addCriterion("topic36_six <>", value, "topic36Six");
            return (Criteria) this;
        }

        public Criteria andTopic36SixGreaterThan(String value) {
            addCriterion("topic36_six >", value, "topic36Six");
            return (Criteria) this;
        }

        public Criteria andTopic36SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic36_six >=", value, "topic36Six");
            return (Criteria) this;
        }

        public Criteria andTopic36SixLessThan(String value) {
            addCriterion("topic36_six <", value, "topic36Six");
            return (Criteria) this;
        }

        public Criteria andTopic36SixLessThanOrEqualTo(String value) {
            addCriterion("topic36_six <=", value, "topic36Six");
            return (Criteria) this;
        }

        public Criteria andTopic36SixLike(String value) {
            addCriterion("topic36_six like", value, "topic36Six");
            return (Criteria) this;
        }

        public Criteria andTopic36SixNotLike(String value) {
            addCriterion("topic36_six not like", value, "topic36Six");
            return (Criteria) this;
        }

        public Criteria andTopic36SixIn(List<String> values) {
            addCriterion("topic36_six in", values, "topic36Six");
            return (Criteria) this;
        }

        public Criteria andTopic36SixNotIn(List<String> values) {
            addCriterion("topic36_six not in", values, "topic36Six");
            return (Criteria) this;
        }

        public Criteria andTopic36SixBetween(String value1, String value2) {
            addCriterion("topic36_six between", value1, value2, "topic36Six");
            return (Criteria) this;
        }

        public Criteria andTopic36SixNotBetween(String value1, String value2) {
            addCriterion("topic36_six not between", value1, value2, "topic36Six");
            return (Criteria) this;
        }

        public Criteria andTopic37OneIsNull() {
            addCriterion("topic37_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic37OneIsNotNull() {
            addCriterion("topic37_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic37OneEqualTo(String value) {
            addCriterion("topic37_one =", value, "topic37One");
            return (Criteria) this;
        }

        public Criteria andTopic37OneNotEqualTo(String value) {
            addCriterion("topic37_one <>", value, "topic37One");
            return (Criteria) this;
        }

        public Criteria andTopic37OneGreaterThan(String value) {
            addCriterion("topic37_one >", value, "topic37One");
            return (Criteria) this;
        }

        public Criteria andTopic37OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic37_one >=", value, "topic37One");
            return (Criteria) this;
        }

        public Criteria andTopic37OneLessThan(String value) {
            addCriterion("topic37_one <", value, "topic37One");
            return (Criteria) this;
        }

        public Criteria andTopic37OneLessThanOrEqualTo(String value) {
            addCriterion("topic37_one <=", value, "topic37One");
            return (Criteria) this;
        }

        public Criteria andTopic37OneLike(String value) {
            addCriterion("topic37_one like", value, "topic37One");
            return (Criteria) this;
        }

        public Criteria andTopic37OneNotLike(String value) {
            addCriterion("topic37_one not like", value, "topic37One");
            return (Criteria) this;
        }

        public Criteria andTopic37OneIn(List<String> values) {
            addCriterion("topic37_one in", values, "topic37One");
            return (Criteria) this;
        }

        public Criteria andTopic37OneNotIn(List<String> values) {
            addCriterion("topic37_one not in", values, "topic37One");
            return (Criteria) this;
        }

        public Criteria andTopic37OneBetween(String value1, String value2) {
            addCriterion("topic37_one between", value1, value2, "topic37One");
            return (Criteria) this;
        }

        public Criteria andTopic37OneNotBetween(String value1, String value2) {
            addCriterion("topic37_one not between", value1, value2, "topic37One");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoIsNull() {
            addCriterion("topic37_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoIsNotNull() {
            addCriterion("topic37_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoEqualTo(String value) {
            addCriterion("topic37_two =", value, "topic37Two");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoNotEqualTo(String value) {
            addCriterion("topic37_two <>", value, "topic37Two");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoGreaterThan(String value) {
            addCriterion("topic37_two >", value, "topic37Two");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic37_two >=", value, "topic37Two");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoLessThan(String value) {
            addCriterion("topic37_two <", value, "topic37Two");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoLessThanOrEqualTo(String value) {
            addCriterion("topic37_two <=", value, "topic37Two");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoLike(String value) {
            addCriterion("topic37_two like", value, "topic37Two");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoNotLike(String value) {
            addCriterion("topic37_two not like", value, "topic37Two");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoIn(List<String> values) {
            addCriterion("topic37_two in", values, "topic37Two");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoNotIn(List<String> values) {
            addCriterion("topic37_two not in", values, "topic37Two");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoBetween(String value1, String value2) {
            addCriterion("topic37_two between", value1, value2, "topic37Two");
            return (Criteria) this;
        }

        public Criteria andTopic37TwoNotBetween(String value1, String value2) {
            addCriterion("topic37_two not between", value1, value2, "topic37Two");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeIsNull() {
            addCriterion("topic37_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeIsNotNull() {
            addCriterion("topic37_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeEqualTo(String value) {
            addCriterion("topic37_three =", value, "topic37Three");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeNotEqualTo(String value) {
            addCriterion("topic37_three <>", value, "topic37Three");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeGreaterThan(String value) {
            addCriterion("topic37_three >", value, "topic37Three");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic37_three >=", value, "topic37Three");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeLessThan(String value) {
            addCriterion("topic37_three <", value, "topic37Three");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic37_three <=", value, "topic37Three");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeLike(String value) {
            addCriterion("topic37_three like", value, "topic37Three");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeNotLike(String value) {
            addCriterion("topic37_three not like", value, "topic37Three");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeIn(List<String> values) {
            addCriterion("topic37_three in", values, "topic37Three");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeNotIn(List<String> values) {
            addCriterion("topic37_three not in", values, "topic37Three");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeBetween(String value1, String value2) {
            addCriterion("topic37_three between", value1, value2, "topic37Three");
            return (Criteria) this;
        }

        public Criteria andTopic37ThreeNotBetween(String value1, String value2) {
            addCriterion("topic37_three not between", value1, value2, "topic37Three");
            return (Criteria) this;
        }

        public Criteria andTopic37FourIsNull() {
            addCriterion("topic37_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic37FourIsNotNull() {
            addCriterion("topic37_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic37FourEqualTo(String value) {
            addCriterion("topic37_four =", value, "topic37Four");
            return (Criteria) this;
        }

        public Criteria andTopic37FourNotEqualTo(String value) {
            addCriterion("topic37_four <>", value, "topic37Four");
            return (Criteria) this;
        }

        public Criteria andTopic37FourGreaterThan(String value) {
            addCriterion("topic37_four >", value, "topic37Four");
            return (Criteria) this;
        }

        public Criteria andTopic37FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic37_four >=", value, "topic37Four");
            return (Criteria) this;
        }

        public Criteria andTopic37FourLessThan(String value) {
            addCriterion("topic37_four <", value, "topic37Four");
            return (Criteria) this;
        }

        public Criteria andTopic37FourLessThanOrEqualTo(String value) {
            addCriterion("topic37_four <=", value, "topic37Four");
            return (Criteria) this;
        }

        public Criteria andTopic37FourLike(String value) {
            addCriterion("topic37_four like", value, "topic37Four");
            return (Criteria) this;
        }

        public Criteria andTopic37FourNotLike(String value) {
            addCriterion("topic37_four not like", value, "topic37Four");
            return (Criteria) this;
        }

        public Criteria andTopic37FourIn(List<String> values) {
            addCriterion("topic37_four in", values, "topic37Four");
            return (Criteria) this;
        }

        public Criteria andTopic37FourNotIn(List<String> values) {
            addCriterion("topic37_four not in", values, "topic37Four");
            return (Criteria) this;
        }

        public Criteria andTopic37FourBetween(String value1, String value2) {
            addCriterion("topic37_four between", value1, value2, "topic37Four");
            return (Criteria) this;
        }

        public Criteria andTopic37FourNotBetween(String value1, String value2) {
            addCriterion("topic37_four not between", value1, value2, "topic37Four");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionIsNull() {
            addCriterion("topic37_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionIsNotNull() {
            addCriterion("topic37_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionEqualTo(String value) {
            addCriterion("topic37_fraction =", value, "topic37Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionNotEqualTo(String value) {
            addCriterion("topic37_fraction <>", value, "topic37Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionGreaterThan(String value) {
            addCriterion("topic37_fraction >", value, "topic37Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic37_fraction >=", value, "topic37Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionLessThan(String value) {
            addCriterion("topic37_fraction <", value, "topic37Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionLessThanOrEqualTo(String value) {
            addCriterion("topic37_fraction <=", value, "topic37Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionLike(String value) {
            addCriterion("topic37_fraction like", value, "topic37Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionNotLike(String value) {
            addCriterion("topic37_fraction not like", value, "topic37Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionIn(List<String> values) {
            addCriterion("topic37_fraction in", values, "topic37Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionNotIn(List<String> values) {
            addCriterion("topic37_fraction not in", values, "topic37Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionBetween(String value1, String value2) {
            addCriterion("topic37_fraction between", value1, value2, "topic37Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic37FractionNotBetween(String value1, String value2) {
            addCriterion("topic37_fraction not between", value1, value2, "topic37Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic37SixIsNull() {
            addCriterion("topic37_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic37SixIsNotNull() {
            addCriterion("topic37_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic37SixEqualTo(String value) {
            addCriterion("topic37_six =", value, "topic37Six");
            return (Criteria) this;
        }

        public Criteria andTopic37SixNotEqualTo(String value) {
            addCriterion("topic37_six <>", value, "topic37Six");
            return (Criteria) this;
        }

        public Criteria andTopic37SixGreaterThan(String value) {
            addCriterion("topic37_six >", value, "topic37Six");
            return (Criteria) this;
        }

        public Criteria andTopic37SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic37_six >=", value, "topic37Six");
            return (Criteria) this;
        }

        public Criteria andTopic37SixLessThan(String value) {
            addCriterion("topic37_six <", value, "topic37Six");
            return (Criteria) this;
        }

        public Criteria andTopic37SixLessThanOrEqualTo(String value) {
            addCriterion("topic37_six <=", value, "topic37Six");
            return (Criteria) this;
        }

        public Criteria andTopic37SixLike(String value) {
            addCriterion("topic37_six like", value, "topic37Six");
            return (Criteria) this;
        }

        public Criteria andTopic37SixNotLike(String value) {
            addCriterion("topic37_six not like", value, "topic37Six");
            return (Criteria) this;
        }

        public Criteria andTopic37SixIn(List<String> values) {
            addCriterion("topic37_six in", values, "topic37Six");
            return (Criteria) this;
        }

        public Criteria andTopic37SixNotIn(List<String> values) {
            addCriterion("topic37_six not in", values, "topic37Six");
            return (Criteria) this;
        }

        public Criteria andTopic37SixBetween(String value1, String value2) {
            addCriterion("topic37_six between", value1, value2, "topic37Six");
            return (Criteria) this;
        }

        public Criteria andTopic37SixNotBetween(String value1, String value2) {
            addCriterion("topic37_six not between", value1, value2, "topic37Six");
            return (Criteria) this;
        }

        public Criteria andTopic38OneIsNull() {
            addCriterion("topic38_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic38OneIsNotNull() {
            addCriterion("topic38_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic38OneEqualTo(String value) {
            addCriterion("topic38_one =", value, "topic38One");
            return (Criteria) this;
        }

        public Criteria andTopic38OneNotEqualTo(String value) {
            addCriterion("topic38_one <>", value, "topic38One");
            return (Criteria) this;
        }

        public Criteria andTopic38OneGreaterThan(String value) {
            addCriterion("topic38_one >", value, "topic38One");
            return (Criteria) this;
        }

        public Criteria andTopic38OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic38_one >=", value, "topic38One");
            return (Criteria) this;
        }

        public Criteria andTopic38OneLessThan(String value) {
            addCriterion("topic38_one <", value, "topic38One");
            return (Criteria) this;
        }

        public Criteria andTopic38OneLessThanOrEqualTo(String value) {
            addCriterion("topic38_one <=", value, "topic38One");
            return (Criteria) this;
        }

        public Criteria andTopic38OneLike(String value) {
            addCriterion("topic38_one like", value, "topic38One");
            return (Criteria) this;
        }

        public Criteria andTopic38OneNotLike(String value) {
            addCriterion("topic38_one not like", value, "topic38One");
            return (Criteria) this;
        }

        public Criteria andTopic38OneIn(List<String> values) {
            addCriterion("topic38_one in", values, "topic38One");
            return (Criteria) this;
        }

        public Criteria andTopic38OneNotIn(List<String> values) {
            addCriterion("topic38_one not in", values, "topic38One");
            return (Criteria) this;
        }

        public Criteria andTopic38OneBetween(String value1, String value2) {
            addCriterion("topic38_one between", value1, value2, "topic38One");
            return (Criteria) this;
        }

        public Criteria andTopic38OneNotBetween(String value1, String value2) {
            addCriterion("topic38_one not between", value1, value2, "topic38One");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoIsNull() {
            addCriterion("topic38_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoIsNotNull() {
            addCriterion("topic38_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoEqualTo(String value) {
            addCriterion("topic38_two =", value, "topic38Two");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoNotEqualTo(String value) {
            addCriterion("topic38_two <>", value, "topic38Two");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoGreaterThan(String value) {
            addCriterion("topic38_two >", value, "topic38Two");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic38_two >=", value, "topic38Two");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoLessThan(String value) {
            addCriterion("topic38_two <", value, "topic38Two");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoLessThanOrEqualTo(String value) {
            addCriterion("topic38_two <=", value, "topic38Two");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoLike(String value) {
            addCriterion("topic38_two like", value, "topic38Two");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoNotLike(String value) {
            addCriterion("topic38_two not like", value, "topic38Two");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoIn(List<String> values) {
            addCriterion("topic38_two in", values, "topic38Two");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoNotIn(List<String> values) {
            addCriterion("topic38_two not in", values, "topic38Two");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoBetween(String value1, String value2) {
            addCriterion("topic38_two between", value1, value2, "topic38Two");
            return (Criteria) this;
        }

        public Criteria andTopic38TwoNotBetween(String value1, String value2) {
            addCriterion("topic38_two not between", value1, value2, "topic38Two");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeIsNull() {
            addCriterion("topic38_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeIsNotNull() {
            addCriterion("topic38_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeEqualTo(String value) {
            addCriterion("topic38_three =", value, "topic38Three");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeNotEqualTo(String value) {
            addCriterion("topic38_three <>", value, "topic38Three");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeGreaterThan(String value) {
            addCriterion("topic38_three >", value, "topic38Three");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic38_three >=", value, "topic38Three");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeLessThan(String value) {
            addCriterion("topic38_three <", value, "topic38Three");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic38_three <=", value, "topic38Three");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeLike(String value) {
            addCriterion("topic38_three like", value, "topic38Three");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeNotLike(String value) {
            addCriterion("topic38_three not like", value, "topic38Three");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeIn(List<String> values) {
            addCriterion("topic38_three in", values, "topic38Three");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeNotIn(List<String> values) {
            addCriterion("topic38_three not in", values, "topic38Three");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeBetween(String value1, String value2) {
            addCriterion("topic38_three between", value1, value2, "topic38Three");
            return (Criteria) this;
        }

        public Criteria andTopic38ThreeNotBetween(String value1, String value2) {
            addCriterion("topic38_three not between", value1, value2, "topic38Three");
            return (Criteria) this;
        }

        public Criteria andTopic38FourIsNull() {
            addCriterion("topic38_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic38FourIsNotNull() {
            addCriterion("topic38_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic38FourEqualTo(String value) {
            addCriterion("topic38_four =", value, "topic38Four");
            return (Criteria) this;
        }

        public Criteria andTopic38FourNotEqualTo(String value) {
            addCriterion("topic38_four <>", value, "topic38Four");
            return (Criteria) this;
        }

        public Criteria andTopic38FourGreaterThan(String value) {
            addCriterion("topic38_four >", value, "topic38Four");
            return (Criteria) this;
        }

        public Criteria andTopic38FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic38_four >=", value, "topic38Four");
            return (Criteria) this;
        }

        public Criteria andTopic38FourLessThan(String value) {
            addCriterion("topic38_four <", value, "topic38Four");
            return (Criteria) this;
        }

        public Criteria andTopic38FourLessThanOrEqualTo(String value) {
            addCriterion("topic38_four <=", value, "topic38Four");
            return (Criteria) this;
        }

        public Criteria andTopic38FourLike(String value) {
            addCriterion("topic38_four like", value, "topic38Four");
            return (Criteria) this;
        }

        public Criteria andTopic38FourNotLike(String value) {
            addCriterion("topic38_four not like", value, "topic38Four");
            return (Criteria) this;
        }

        public Criteria andTopic38FourIn(List<String> values) {
            addCriterion("topic38_four in", values, "topic38Four");
            return (Criteria) this;
        }

        public Criteria andTopic38FourNotIn(List<String> values) {
            addCriterion("topic38_four not in", values, "topic38Four");
            return (Criteria) this;
        }

        public Criteria andTopic38FourBetween(String value1, String value2) {
            addCriterion("topic38_four between", value1, value2, "topic38Four");
            return (Criteria) this;
        }

        public Criteria andTopic38FourNotBetween(String value1, String value2) {
            addCriterion("topic38_four not between", value1, value2, "topic38Four");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionIsNull() {
            addCriterion("topic38_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionIsNotNull() {
            addCriterion("topic38_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionEqualTo(String value) {
            addCriterion("topic38_fraction =", value, "topic38Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionNotEqualTo(String value) {
            addCriterion("topic38_fraction <>", value, "topic38Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionGreaterThan(String value) {
            addCriterion("topic38_fraction >", value, "topic38Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic38_fraction >=", value, "topic38Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionLessThan(String value) {
            addCriterion("topic38_fraction <", value, "topic38Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionLessThanOrEqualTo(String value) {
            addCriterion("topic38_fraction <=", value, "topic38Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionLike(String value) {
            addCriterion("topic38_fraction like", value, "topic38Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionNotLike(String value) {
            addCriterion("topic38_fraction not like", value, "topic38Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionIn(List<String> values) {
            addCriterion("topic38_fraction in", values, "topic38Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionNotIn(List<String> values) {
            addCriterion("topic38_fraction not in", values, "topic38Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionBetween(String value1, String value2) {
            addCriterion("topic38_fraction between", value1, value2, "topic38Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic38FractionNotBetween(String value1, String value2) {
            addCriterion("topic38_fraction not between", value1, value2, "topic38Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic38SixIsNull() {
            addCriterion("topic38_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic38SixIsNotNull() {
            addCriterion("topic38_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic38SixEqualTo(String value) {
            addCriterion("topic38_six =", value, "topic38Six");
            return (Criteria) this;
        }

        public Criteria andTopic38SixNotEqualTo(String value) {
            addCriterion("topic38_six <>", value, "topic38Six");
            return (Criteria) this;
        }

        public Criteria andTopic38SixGreaterThan(String value) {
            addCriterion("topic38_six >", value, "topic38Six");
            return (Criteria) this;
        }

        public Criteria andTopic38SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic38_six >=", value, "topic38Six");
            return (Criteria) this;
        }

        public Criteria andTopic38SixLessThan(String value) {
            addCriterion("topic38_six <", value, "topic38Six");
            return (Criteria) this;
        }

        public Criteria andTopic38SixLessThanOrEqualTo(String value) {
            addCriterion("topic38_six <=", value, "topic38Six");
            return (Criteria) this;
        }

        public Criteria andTopic38SixLike(String value) {
            addCriterion("topic38_six like", value, "topic38Six");
            return (Criteria) this;
        }

        public Criteria andTopic38SixNotLike(String value) {
            addCriterion("topic38_six not like", value, "topic38Six");
            return (Criteria) this;
        }

        public Criteria andTopic38SixIn(List<String> values) {
            addCriterion("topic38_six in", values, "topic38Six");
            return (Criteria) this;
        }

        public Criteria andTopic38SixNotIn(List<String> values) {
            addCriterion("topic38_six not in", values, "topic38Six");
            return (Criteria) this;
        }

        public Criteria andTopic38SixBetween(String value1, String value2) {
            addCriterion("topic38_six between", value1, value2, "topic38Six");
            return (Criteria) this;
        }

        public Criteria andTopic38SixNotBetween(String value1, String value2) {
            addCriterion("topic38_six not between", value1, value2, "topic38Six");
            return (Criteria) this;
        }

        public Criteria andTopic39OneIsNull() {
            addCriterion("topic39_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic39OneIsNotNull() {
            addCriterion("topic39_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic39OneEqualTo(String value) {
            addCriterion("topic39_one =", value, "topic39One");
            return (Criteria) this;
        }

        public Criteria andTopic39OneNotEqualTo(String value) {
            addCriterion("topic39_one <>", value, "topic39One");
            return (Criteria) this;
        }

        public Criteria andTopic39OneGreaterThan(String value) {
            addCriterion("topic39_one >", value, "topic39One");
            return (Criteria) this;
        }

        public Criteria andTopic39OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic39_one >=", value, "topic39One");
            return (Criteria) this;
        }

        public Criteria andTopic39OneLessThan(String value) {
            addCriterion("topic39_one <", value, "topic39One");
            return (Criteria) this;
        }

        public Criteria andTopic39OneLessThanOrEqualTo(String value) {
            addCriterion("topic39_one <=", value, "topic39One");
            return (Criteria) this;
        }

        public Criteria andTopic39OneLike(String value) {
            addCriterion("topic39_one like", value, "topic39One");
            return (Criteria) this;
        }

        public Criteria andTopic39OneNotLike(String value) {
            addCriterion("topic39_one not like", value, "topic39One");
            return (Criteria) this;
        }

        public Criteria andTopic39OneIn(List<String> values) {
            addCriterion("topic39_one in", values, "topic39One");
            return (Criteria) this;
        }

        public Criteria andTopic39OneNotIn(List<String> values) {
            addCriterion("topic39_one not in", values, "topic39One");
            return (Criteria) this;
        }

        public Criteria andTopic39OneBetween(String value1, String value2) {
            addCriterion("topic39_one between", value1, value2, "topic39One");
            return (Criteria) this;
        }

        public Criteria andTopic39OneNotBetween(String value1, String value2) {
            addCriterion("topic39_one not between", value1, value2, "topic39One");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoIsNull() {
            addCriterion("topic39_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoIsNotNull() {
            addCriterion("topic39_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoEqualTo(String value) {
            addCriterion("topic39_two =", value, "topic39Two");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoNotEqualTo(String value) {
            addCriterion("topic39_two <>", value, "topic39Two");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoGreaterThan(String value) {
            addCriterion("topic39_two >", value, "topic39Two");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic39_two >=", value, "topic39Two");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoLessThan(String value) {
            addCriterion("topic39_two <", value, "topic39Two");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoLessThanOrEqualTo(String value) {
            addCriterion("topic39_two <=", value, "topic39Two");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoLike(String value) {
            addCriterion("topic39_two like", value, "topic39Two");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoNotLike(String value) {
            addCriterion("topic39_two not like", value, "topic39Two");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoIn(List<String> values) {
            addCriterion("topic39_two in", values, "topic39Two");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoNotIn(List<String> values) {
            addCriterion("topic39_two not in", values, "topic39Two");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoBetween(String value1, String value2) {
            addCriterion("topic39_two between", value1, value2, "topic39Two");
            return (Criteria) this;
        }

        public Criteria andTopic39TwoNotBetween(String value1, String value2) {
            addCriterion("topic39_two not between", value1, value2, "topic39Two");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeIsNull() {
            addCriterion("topic39_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeIsNotNull() {
            addCriterion("topic39_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeEqualTo(String value) {
            addCriterion("topic39_three =", value, "topic39Three");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeNotEqualTo(String value) {
            addCriterion("topic39_three <>", value, "topic39Three");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeGreaterThan(String value) {
            addCriterion("topic39_three >", value, "topic39Three");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic39_three >=", value, "topic39Three");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeLessThan(String value) {
            addCriterion("topic39_three <", value, "topic39Three");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic39_three <=", value, "topic39Three");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeLike(String value) {
            addCriterion("topic39_three like", value, "topic39Three");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeNotLike(String value) {
            addCriterion("topic39_three not like", value, "topic39Three");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeIn(List<String> values) {
            addCriterion("topic39_three in", values, "topic39Three");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeNotIn(List<String> values) {
            addCriterion("topic39_three not in", values, "topic39Three");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeBetween(String value1, String value2) {
            addCriterion("topic39_three between", value1, value2, "topic39Three");
            return (Criteria) this;
        }

        public Criteria andTopic39ThreeNotBetween(String value1, String value2) {
            addCriterion("topic39_three not between", value1, value2, "topic39Three");
            return (Criteria) this;
        }

        public Criteria andTopic39FourIsNull() {
            addCriterion("topic39_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic39FourIsNotNull() {
            addCriterion("topic39_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic39FourEqualTo(String value) {
            addCriterion("topic39_four =", value, "topic39Four");
            return (Criteria) this;
        }

        public Criteria andTopic39FourNotEqualTo(String value) {
            addCriterion("topic39_four <>", value, "topic39Four");
            return (Criteria) this;
        }

        public Criteria andTopic39FourGreaterThan(String value) {
            addCriterion("topic39_four >", value, "topic39Four");
            return (Criteria) this;
        }

        public Criteria andTopic39FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic39_four >=", value, "topic39Four");
            return (Criteria) this;
        }

        public Criteria andTopic39FourLessThan(String value) {
            addCriterion("topic39_four <", value, "topic39Four");
            return (Criteria) this;
        }

        public Criteria andTopic39FourLessThanOrEqualTo(String value) {
            addCriterion("topic39_four <=", value, "topic39Four");
            return (Criteria) this;
        }

        public Criteria andTopic39FourLike(String value) {
            addCriterion("topic39_four like", value, "topic39Four");
            return (Criteria) this;
        }

        public Criteria andTopic39FourNotLike(String value) {
            addCriterion("topic39_four not like", value, "topic39Four");
            return (Criteria) this;
        }

        public Criteria andTopic39FourIn(List<String> values) {
            addCriterion("topic39_four in", values, "topic39Four");
            return (Criteria) this;
        }

        public Criteria andTopic39FourNotIn(List<String> values) {
            addCriterion("topic39_four not in", values, "topic39Four");
            return (Criteria) this;
        }

        public Criteria andTopic39FourBetween(String value1, String value2) {
            addCriterion("topic39_four between", value1, value2, "topic39Four");
            return (Criteria) this;
        }

        public Criteria andTopic39FourNotBetween(String value1, String value2) {
            addCriterion("topic39_four not between", value1, value2, "topic39Four");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionIsNull() {
            addCriterion("topic39_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionIsNotNull() {
            addCriterion("topic39_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionEqualTo(String value) {
            addCriterion("topic39_fraction =", value, "topic39Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionNotEqualTo(String value) {
            addCriterion("topic39_fraction <>", value, "topic39Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionGreaterThan(String value) {
            addCriterion("topic39_fraction >", value, "topic39Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic39_fraction >=", value, "topic39Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionLessThan(String value) {
            addCriterion("topic39_fraction <", value, "topic39Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionLessThanOrEqualTo(String value) {
            addCriterion("topic39_fraction <=", value, "topic39Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionLike(String value) {
            addCriterion("topic39_fraction like", value, "topic39Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionNotLike(String value) {
            addCriterion("topic39_fraction not like", value, "topic39Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionIn(List<String> values) {
            addCriterion("topic39_fraction in", values, "topic39Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionNotIn(List<String> values) {
            addCriterion("topic39_fraction not in", values, "topic39Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionBetween(String value1, String value2) {
            addCriterion("topic39_fraction between", value1, value2, "topic39Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic39FractionNotBetween(String value1, String value2) {
            addCriterion("topic39_fraction not between", value1, value2, "topic39Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic39SixIsNull() {
            addCriterion("topic39_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic39SixIsNotNull() {
            addCriterion("topic39_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic39SixEqualTo(String value) {
            addCriterion("topic39_six =", value, "topic39Six");
            return (Criteria) this;
        }

        public Criteria andTopic39SixNotEqualTo(String value) {
            addCriterion("topic39_six <>", value, "topic39Six");
            return (Criteria) this;
        }

        public Criteria andTopic39SixGreaterThan(String value) {
            addCriterion("topic39_six >", value, "topic39Six");
            return (Criteria) this;
        }

        public Criteria andTopic39SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic39_six >=", value, "topic39Six");
            return (Criteria) this;
        }

        public Criteria andTopic39SixLessThan(String value) {
            addCriterion("topic39_six <", value, "topic39Six");
            return (Criteria) this;
        }

        public Criteria andTopic39SixLessThanOrEqualTo(String value) {
            addCriterion("topic39_six <=", value, "topic39Six");
            return (Criteria) this;
        }

        public Criteria andTopic39SixLike(String value) {
            addCriterion("topic39_six like", value, "topic39Six");
            return (Criteria) this;
        }

        public Criteria andTopic39SixNotLike(String value) {
            addCriterion("topic39_six not like", value, "topic39Six");
            return (Criteria) this;
        }

        public Criteria andTopic39SixIn(List<String> values) {
            addCriterion("topic39_six in", values, "topic39Six");
            return (Criteria) this;
        }

        public Criteria andTopic39SixNotIn(List<String> values) {
            addCriterion("topic39_six not in", values, "topic39Six");
            return (Criteria) this;
        }

        public Criteria andTopic39SixBetween(String value1, String value2) {
            addCriterion("topic39_six between", value1, value2, "topic39Six");
            return (Criteria) this;
        }

        public Criteria andTopic39SixNotBetween(String value1, String value2) {
            addCriterion("topic39_six not between", value1, value2, "topic39Six");
            return (Criteria) this;
        }

        public Criteria andTopic40OneIsNull() {
            addCriterion("topic40_one is null");
            return (Criteria) this;
        }

        public Criteria andTopic40OneIsNotNull() {
            addCriterion("topic40_one is not null");
            return (Criteria) this;
        }

        public Criteria andTopic40OneEqualTo(String value) {
            addCriterion("topic40_one =", value, "topic40One");
            return (Criteria) this;
        }

        public Criteria andTopic40OneNotEqualTo(String value) {
            addCriterion("topic40_one <>", value, "topic40One");
            return (Criteria) this;
        }

        public Criteria andTopic40OneGreaterThan(String value) {
            addCriterion("topic40_one >", value, "topic40One");
            return (Criteria) this;
        }

        public Criteria andTopic40OneGreaterThanOrEqualTo(String value) {
            addCriterion("topic40_one >=", value, "topic40One");
            return (Criteria) this;
        }

        public Criteria andTopic40OneLessThan(String value) {
            addCriterion("topic40_one <", value, "topic40One");
            return (Criteria) this;
        }

        public Criteria andTopic40OneLessThanOrEqualTo(String value) {
            addCriterion("topic40_one <=", value, "topic40One");
            return (Criteria) this;
        }

        public Criteria andTopic40OneLike(String value) {
            addCriterion("topic40_one like", value, "topic40One");
            return (Criteria) this;
        }

        public Criteria andTopic40OneNotLike(String value) {
            addCriterion("topic40_one not like", value, "topic40One");
            return (Criteria) this;
        }

        public Criteria andTopic40OneIn(List<String> values) {
            addCriterion("topic40_one in", values, "topic40One");
            return (Criteria) this;
        }

        public Criteria andTopic40OneNotIn(List<String> values) {
            addCriterion("topic40_one not in", values, "topic40One");
            return (Criteria) this;
        }

        public Criteria andTopic40OneBetween(String value1, String value2) {
            addCriterion("topic40_one between", value1, value2, "topic40One");
            return (Criteria) this;
        }

        public Criteria andTopic40OneNotBetween(String value1, String value2) {
            addCriterion("topic40_one not between", value1, value2, "topic40One");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoIsNull() {
            addCriterion("topic40_two is null");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoIsNotNull() {
            addCriterion("topic40_two is not null");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoEqualTo(String value) {
            addCriterion("topic40_two =", value, "topic40Two");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoNotEqualTo(String value) {
            addCriterion("topic40_two <>", value, "topic40Two");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoGreaterThan(String value) {
            addCriterion("topic40_two >", value, "topic40Two");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoGreaterThanOrEqualTo(String value) {
            addCriterion("topic40_two >=", value, "topic40Two");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoLessThan(String value) {
            addCriterion("topic40_two <", value, "topic40Two");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoLessThanOrEqualTo(String value) {
            addCriterion("topic40_two <=", value, "topic40Two");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoLike(String value) {
            addCriterion("topic40_two like", value, "topic40Two");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoNotLike(String value) {
            addCriterion("topic40_two not like", value, "topic40Two");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoIn(List<String> values) {
            addCriterion("topic40_two in", values, "topic40Two");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoNotIn(List<String> values) {
            addCriterion("topic40_two not in", values, "topic40Two");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoBetween(String value1, String value2) {
            addCriterion("topic40_two between", value1, value2, "topic40Two");
            return (Criteria) this;
        }

        public Criteria andTopic40TwoNotBetween(String value1, String value2) {
            addCriterion("topic40_two not between", value1, value2, "topic40Two");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeIsNull() {
            addCriterion("topic40_three is null");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeIsNotNull() {
            addCriterion("topic40_three is not null");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeEqualTo(String value) {
            addCriterion("topic40_three =", value, "topic40Three");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeNotEqualTo(String value) {
            addCriterion("topic40_three <>", value, "topic40Three");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeGreaterThan(String value) {
            addCriterion("topic40_three >", value, "topic40Three");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeGreaterThanOrEqualTo(String value) {
            addCriterion("topic40_three >=", value, "topic40Three");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeLessThan(String value) {
            addCriterion("topic40_three <", value, "topic40Three");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeLessThanOrEqualTo(String value) {
            addCriterion("topic40_three <=", value, "topic40Three");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeLike(String value) {
            addCriterion("topic40_three like", value, "topic40Three");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeNotLike(String value) {
            addCriterion("topic40_three not like", value, "topic40Three");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeIn(List<String> values) {
            addCriterion("topic40_three in", values, "topic40Three");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeNotIn(List<String> values) {
            addCriterion("topic40_three not in", values, "topic40Three");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeBetween(String value1, String value2) {
            addCriterion("topic40_three between", value1, value2, "topic40Three");
            return (Criteria) this;
        }

        public Criteria andTopic40ThreeNotBetween(String value1, String value2) {
            addCriterion("topic40_three not between", value1, value2, "topic40Three");
            return (Criteria) this;
        }

        public Criteria andTopic40FourIsNull() {
            addCriterion("topic40_four is null");
            return (Criteria) this;
        }

        public Criteria andTopic40FourIsNotNull() {
            addCriterion("topic40_four is not null");
            return (Criteria) this;
        }

        public Criteria andTopic40FourEqualTo(String value) {
            addCriterion("topic40_four =", value, "topic40Four");
            return (Criteria) this;
        }

        public Criteria andTopic40FourNotEqualTo(String value) {
            addCriterion("topic40_four <>", value, "topic40Four");
            return (Criteria) this;
        }

        public Criteria andTopic40FourGreaterThan(String value) {
            addCriterion("topic40_four >", value, "topic40Four");
            return (Criteria) this;
        }

        public Criteria andTopic40FourGreaterThanOrEqualTo(String value) {
            addCriterion("topic40_four >=", value, "topic40Four");
            return (Criteria) this;
        }

        public Criteria andTopic40FourLessThan(String value) {
            addCriterion("topic40_four <", value, "topic40Four");
            return (Criteria) this;
        }

        public Criteria andTopic40FourLessThanOrEqualTo(String value) {
            addCriterion("topic40_four <=", value, "topic40Four");
            return (Criteria) this;
        }

        public Criteria andTopic40FourLike(String value) {
            addCriterion("topic40_four like", value, "topic40Four");
            return (Criteria) this;
        }

        public Criteria andTopic40FourNotLike(String value) {
            addCriterion("topic40_four not like", value, "topic40Four");
            return (Criteria) this;
        }

        public Criteria andTopic40FourIn(List<String> values) {
            addCriterion("topic40_four in", values, "topic40Four");
            return (Criteria) this;
        }

        public Criteria andTopic40FourNotIn(List<String> values) {
            addCriterion("topic40_four not in", values, "topic40Four");
            return (Criteria) this;
        }

        public Criteria andTopic40FourBetween(String value1, String value2) {
            addCriterion("topic40_four between", value1, value2, "topic40Four");
            return (Criteria) this;
        }

        public Criteria andTopic40FourNotBetween(String value1, String value2) {
            addCriterion("topic40_four not between", value1, value2, "topic40Four");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionIsNull() {
            addCriterion("topic40_fraction is null");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionIsNotNull() {
            addCriterion("topic40_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionEqualTo(String value) {
            addCriterion("topic40_fraction =", value, "topic40Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionNotEqualTo(String value) {
            addCriterion("topic40_fraction <>", value, "topic40Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionGreaterThan(String value) {
            addCriterion("topic40_fraction >", value, "topic40Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionGreaterThanOrEqualTo(String value) {
            addCriterion("topic40_fraction >=", value, "topic40Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionLessThan(String value) {
            addCriterion("topic40_fraction <", value, "topic40Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionLessThanOrEqualTo(String value) {
            addCriterion("topic40_fraction <=", value, "topic40Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionLike(String value) {
            addCriterion("topic40_fraction like", value, "topic40Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionNotLike(String value) {
            addCriterion("topic40_fraction not like", value, "topic40Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionIn(List<String> values) {
            addCriterion("topic40_fraction in", values, "topic40Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionNotIn(List<String> values) {
            addCriterion("topic40_fraction not in", values, "topic40Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionBetween(String value1, String value2) {
            addCriterion("topic40_fraction between", value1, value2, "topic40Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic40FractionNotBetween(String value1, String value2) {
            addCriterion("topic40_fraction not between", value1, value2, "topic40Fraction");
            return (Criteria) this;
        }

        public Criteria andTopic40SixIsNull() {
            addCriterion("topic40_six is null");
            return (Criteria) this;
        }

        public Criteria andTopic40SixIsNotNull() {
            addCriterion("topic40_six is not null");
            return (Criteria) this;
        }

        public Criteria andTopic40SixEqualTo(String value) {
            addCriterion("topic40_six =", value, "topic40Six");
            return (Criteria) this;
        }

        public Criteria andTopic40SixNotEqualTo(String value) {
            addCriterion("topic40_six <>", value, "topic40Six");
            return (Criteria) this;
        }

        public Criteria andTopic40SixGreaterThan(String value) {
            addCriterion("topic40_six >", value, "topic40Six");
            return (Criteria) this;
        }

        public Criteria andTopic40SixGreaterThanOrEqualTo(String value) {
            addCriterion("topic40_six >=", value, "topic40Six");
            return (Criteria) this;
        }

        public Criteria andTopic40SixLessThan(String value) {
            addCriterion("topic40_six <", value, "topic40Six");
            return (Criteria) this;
        }

        public Criteria andTopic40SixLessThanOrEqualTo(String value) {
            addCriterion("topic40_six <=", value, "topic40Six");
            return (Criteria) this;
        }

        public Criteria andTopic40SixLike(String value) {
            addCriterion("topic40_six like", value, "topic40Six");
            return (Criteria) this;
        }

        public Criteria andTopic40SixNotLike(String value) {
            addCriterion("topic40_six not like", value, "topic40Six");
            return (Criteria) this;
        }

        public Criteria andTopic40SixIn(List<String> values) {
            addCriterion("topic40_six in", values, "topic40Six");
            return (Criteria) this;
        }

        public Criteria andTopic40SixNotIn(List<String> values) {
            addCriterion("topic40_six not in", values, "topic40Six");
            return (Criteria) this;
        }

        public Criteria andTopic40SixBetween(String value1, String value2) {
            addCriterion("topic40_six between", value1, value2, "topic40Six");
            return (Criteria) this;
        }

        public Criteria andTopic40SixNotBetween(String value1, String value2) {
            addCriterion("topic40_six not between", value1, value2, "topic40Six");
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