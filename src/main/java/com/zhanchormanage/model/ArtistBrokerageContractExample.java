package com.zhanchormanage.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArtistBrokerageContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtistBrokerageContractExample() {
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

        public Criteria andBNameIsNull() {
            addCriterion("b_name is null");
            return (Criteria) this;
        }

        public Criteria andBNameIsNotNull() {
            addCriterion("b_name is not null");
            return (Criteria) this;
        }

        public Criteria andBNameEqualTo(String value) {
            addCriterion("b_name =", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotEqualTo(String value) {
            addCriterion("b_name <>", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThan(String value) {
            addCriterion("b_name >", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThanOrEqualTo(String value) {
            addCriterion("b_name >=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThan(String value) {
            addCriterion("b_name <", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThanOrEqualTo(String value) {
            addCriterion("b_name <=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLike(String value) {
            addCriterion("b_name like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotLike(String value) {
            addCriterion("b_name not like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameIn(List<String> values) {
            addCriterion("b_name in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotIn(List<String> values) {
            addCriterion("b_name not in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameBetween(String value1, String value2) {
            addCriterion("b_name between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotBetween(String value1, String value2) {
            addCriterion("b_name not between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andFromtimeIsNull() {
            addCriterion("fromtime is null");
            return (Criteria) this;
        }

        public Criteria andFromtimeIsNotNull() {
            addCriterion("fromtime is not null");
            return (Criteria) this;
        }

        public Criteria andFromtimeEqualTo(Date value) {
            addCriterion("fromtime =", value, "fromtime");
            return (Criteria) this;
        }

        public Criteria andFromtimeNotEqualTo(Date value) {
            addCriterion("fromtime <>", value, "fromtime");
            return (Criteria) this;
        }

        public Criteria andFromtimeGreaterThan(Date value) {
            addCriterion("fromtime >", value, "fromtime");
            return (Criteria) this;
        }

        public Criteria andFromtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fromtime >=", value, "fromtime");
            return (Criteria) this;
        }

        public Criteria andFromtimeLessThan(Date value) {
            addCriterion("fromtime <", value, "fromtime");
            return (Criteria) this;
        }

        public Criteria andFromtimeLessThanOrEqualTo(Date value) {
            addCriterion("fromtime <=", value, "fromtime");
            return (Criteria) this;
        }

        public Criteria andFromtimeIn(List<Date> values) {
            addCriterion("fromtime in", values, "fromtime");
            return (Criteria) this;
        }

        public Criteria andFromtimeNotIn(List<Date> values) {
            addCriterion("fromtime not in", values, "fromtime");
            return (Criteria) this;
        }

        public Criteria andFromtimeBetween(Date value1, Date value2) {
            addCriterion("fromtime between", value1, value2, "fromtime");
            return (Criteria) this;
        }

        public Criteria andFromtimeNotBetween(Date value1, Date value2) {
            addCriterion("fromtime not between", value1, value2, "fromtime");
            return (Criteria) this;
        }

        public Criteria andTotimeIsNull() {
            addCriterion("totime is null");
            return (Criteria) this;
        }

        public Criteria andTotimeIsNotNull() {
            addCriterion("totime is not null");
            return (Criteria) this;
        }

        public Criteria andTotimeEqualTo(Date value) {
            addCriterion("totime =", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeNotEqualTo(Date value) {
            addCriterion("totime <>", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeGreaterThan(Date value) {
            addCriterion("totime >", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("totime >=", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeLessThan(Date value) {
            addCriterion("totime <", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeLessThanOrEqualTo(Date value) {
            addCriterion("totime <=", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeIn(List<Date> values) {
            addCriterion("totime in", values, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeNotIn(List<Date> values) {
            addCriterion("totime not in", values, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeBetween(Date value1, Date value2) {
            addCriterion("totime between", value1, value2, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeNotBetween(Date value1, Date value2) {
            addCriterion("totime not between", value1, value2, "totime");
            return (Criteria) this;
        }

        public Criteria andBlanceIsNull() {
            addCriterion("blance is null");
            return (Criteria) this;
        }

        public Criteria andBlanceIsNotNull() {
            addCriterion("blance is not null");
            return (Criteria) this;
        }

        public Criteria andBlanceEqualTo(String value) {
            addCriterion("blance =", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceNotEqualTo(String value) {
            addCriterion("blance <>", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceGreaterThan(String value) {
            addCriterion("blance >", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceGreaterThanOrEqualTo(String value) {
            addCriterion("blance >=", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceLessThan(String value) {
            addCriterion("blance <", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceLessThanOrEqualTo(String value) {
            addCriterion("blance <=", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceLike(String value) {
            addCriterion("blance like", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceNotLike(String value) {
            addCriterion("blance not like", value, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceIn(List<String> values) {
            addCriterion("blance in", values, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceNotIn(List<String> values) {
            addCriterion("blance not in", values, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceBetween(String value1, String value2) {
            addCriterion("blance between", value1, value2, "blance");
            return (Criteria) this;
        }

        public Criteria andBlanceNotBetween(String value1, String value2) {
            addCriterion("blance not between", value1, value2, "blance");
            return (Criteria) this;
        }

        public Criteria andANameIsNull() {
            addCriterion("a_name is null");
            return (Criteria) this;
        }

        public Criteria andANameIsNotNull() {
            addCriterion("a_name is not null");
            return (Criteria) this;
        }

        public Criteria andANameEqualTo(String value) {
            addCriterion("a_name =", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotEqualTo(String value) {
            addCriterion("a_name <>", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThan(String value) {
            addCriterion("a_name >", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThanOrEqualTo(String value) {
            addCriterion("a_name >=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThan(String value) {
            addCriterion("a_name <", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThanOrEqualTo(String value) {
            addCriterion("a_name <=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLike(String value) {
            addCriterion("a_name like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotLike(String value) {
            addCriterion("a_name not like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameIn(List<String> values) {
            addCriterion("a_name in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotIn(List<String> values) {
            addCriterion("a_name not in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameBetween(String value1, String value2) {
            addCriterion("a_name between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotBetween(String value1, String value2) {
            addCriterion("a_name not between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
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

        public Criteria andYyNumberIsNull() {
            addCriterion("yy_number is null");
            return (Criteria) this;
        }

        public Criteria andYyNumberIsNotNull() {
            addCriterion("yy_number is not null");
            return (Criteria) this;
        }

        public Criteria andYyNumberEqualTo(Integer value) {
            addCriterion("yy_number =", value, "yyNumber");
            return (Criteria) this;
        }

        public Criteria andYyNumberNotEqualTo(Integer value) {
            addCriterion("yy_number <>", value, "yyNumber");
            return (Criteria) this;
        }

        public Criteria andYyNumberGreaterThan(Integer value) {
            addCriterion("yy_number >", value, "yyNumber");
            return (Criteria) this;
        }

        public Criteria andYyNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("yy_number >=", value, "yyNumber");
            return (Criteria) this;
        }

        public Criteria andYyNumberLessThan(Integer value) {
            addCriterion("yy_number <", value, "yyNumber");
            return (Criteria) this;
        }

        public Criteria andYyNumberLessThanOrEqualTo(Integer value) {
            addCriterion("yy_number <=", value, "yyNumber");
            return (Criteria) this;
        }

        public Criteria andYyNumberIn(List<Integer> values) {
            addCriterion("yy_number in", values, "yyNumber");
            return (Criteria) this;
        }

        public Criteria andYyNumberNotIn(List<Integer> values) {
            addCriterion("yy_number not in", values, "yyNumber");
            return (Criteria) this;
        }

        public Criteria andYyNumberBetween(Integer value1, Integer value2) {
            addCriterion("yy_number between", value1, value2, "yyNumber");
            return (Criteria) this;
        }

        public Criteria andYyNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("yy_number not between", value1, value2, "yyNumber");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIsNull() {
            addCriterion("collection_account is null");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIsNotNull() {
            addCriterion("collection_account is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountEqualTo(String value) {
            addCriterion("collection_account =", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountNotEqualTo(String value) {
            addCriterion("collection_account <>", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountGreaterThan(String value) {
            addCriterion("collection_account >", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountGreaterThanOrEqualTo(String value) {
            addCriterion("collection_account >=", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountLessThan(String value) {
            addCriterion("collection_account <", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountLessThanOrEqualTo(String value) {
            addCriterion("collection_account <=", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountLike(String value) {
            addCriterion("collection_account like", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountNotLike(String value) {
            addCriterion("collection_account not like", value, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountIn(List<String> values) {
            addCriterion("collection_account in", values, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountNotIn(List<String> values) {
            addCriterion("collection_account not in", values, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountBetween(String value1, String value2) {
            addCriterion("collection_account between", value1, value2, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionAccountNotBetween(String value1, String value2) {
            addCriterion("collection_account not between", value1, value2, "collectionAccount");
            return (Criteria) this;
        }

        public Criteria andHouseholderIsNull() {
            addCriterion("householder is null");
            return (Criteria) this;
        }

        public Criteria andHouseholderIsNotNull() {
            addCriterion("householder is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholderEqualTo(String value) {
            addCriterion("householder =", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderNotEqualTo(String value) {
            addCriterion("householder <>", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderGreaterThan(String value) {
            addCriterion("householder >", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderGreaterThanOrEqualTo(String value) {
            addCriterion("householder >=", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderLessThan(String value) {
            addCriterion("householder <", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderLessThanOrEqualTo(String value) {
            addCriterion("householder <=", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderLike(String value) {
            addCriterion("householder like", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderNotLike(String value) {
            addCriterion("householder not like", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderIn(List<String> values) {
            addCriterion("householder in", values, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderNotIn(List<String> values) {
            addCriterion("householder not in", values, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderBetween(String value1, String value2) {
            addCriterion("householder between", value1, value2, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderNotBetween(String value1, String value2) {
            addCriterion("householder not between", value1, value2, "householder");
            return (Criteria) this;
        }

        public Criteria andOpeningBankIsNull() {
            addCriterion("opening_bank is null");
            return (Criteria) this;
        }

        public Criteria andOpeningBankIsNotNull() {
            addCriterion("opening_bank is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningBankEqualTo(String value) {
            addCriterion("opening_bank =", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotEqualTo(String value) {
            addCriterion("opening_bank <>", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankGreaterThan(String value) {
            addCriterion("opening_bank >", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankGreaterThanOrEqualTo(String value) {
            addCriterion("opening_bank >=", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLessThan(String value) {
            addCriterion("opening_bank <", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLessThanOrEqualTo(String value) {
            addCriterion("opening_bank <=", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLike(String value) {
            addCriterion("opening_bank like", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotLike(String value) {
            addCriterion("opening_bank not like", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankIn(List<String> values) {
            addCriterion("opening_bank in", values, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotIn(List<String> values) {
            addCriterion("opening_bank not in", values, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankBetween(String value1, String value2) {
            addCriterion("opening_bank between", value1, value2, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotBetween(String value1, String value2) {
            addCriterion("opening_bank not between", value1, value2, "openingBank");
            return (Criteria) this;
        }

        public Criteria andStageNameIsNull() {
            addCriterion("stage_name is null");
            return (Criteria) this;
        }

        public Criteria andStageNameIsNotNull() {
            addCriterion("stage_name is not null");
            return (Criteria) this;
        }

        public Criteria andStageNameEqualTo(String value) {
            addCriterion("stage_name =", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotEqualTo(String value) {
            addCriterion("stage_name <>", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameGreaterThan(String value) {
            addCriterion("stage_name >", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("stage_name >=", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameLessThan(String value) {
            addCriterion("stage_name <", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameLessThanOrEqualTo(String value) {
            addCriterion("stage_name <=", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameLike(String value) {
            addCriterion("stage_name like", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotLike(String value) {
            addCriterion("stage_name not like", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameIn(List<String> values) {
            addCriterion("stage_name in", values, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotIn(List<String> values) {
            addCriterion("stage_name not in", values, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameBetween(String value1, String value2) {
            addCriterion("stage_name between", value1, value2, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotBetween(String value1, String value2) {
            addCriterion("stage_name not between", value1, value2, "stageName");
            return (Criteria) this;
        }

        public Criteria andEffectiveDaysIsNull() {
            addCriterion("effective_days is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDaysIsNotNull() {
            addCriterion("effective_days is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDaysEqualTo(Integer value) {
            addCriterion("effective_days =", value, "effectiveDays");
            return (Criteria) this;
        }

        public Criteria andEffectiveDaysNotEqualTo(Integer value) {
            addCriterion("effective_days <>", value, "effectiveDays");
            return (Criteria) this;
        }

        public Criteria andEffectiveDaysGreaterThan(Integer value) {
            addCriterion("effective_days >", value, "effectiveDays");
            return (Criteria) this;
        }

        public Criteria andEffectiveDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("effective_days >=", value, "effectiveDays");
            return (Criteria) this;
        }

        public Criteria andEffectiveDaysLessThan(Integer value) {
            addCriterion("effective_days <", value, "effectiveDays");
            return (Criteria) this;
        }

        public Criteria andEffectiveDaysLessThanOrEqualTo(Integer value) {
            addCriterion("effective_days <=", value, "effectiveDays");
            return (Criteria) this;
        }

        public Criteria andEffectiveDaysIn(List<Integer> values) {
            addCriterion("effective_days in", values, "effectiveDays");
            return (Criteria) this;
        }

        public Criteria andEffectiveDaysNotIn(List<Integer> values) {
            addCriterion("effective_days not in", values, "effectiveDays");
            return (Criteria) this;
        }

        public Criteria andEffectiveDaysBetween(Integer value1, Integer value2) {
            addCriterion("effective_days between", value1, value2, "effectiveDays");
            return (Criteria) this;
        }

        public Criteria andEffectiveDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("effective_days not between", value1, value2, "effectiveDays");
            return (Criteria) this;
        }

        public Criteria andEffectiveHoursIsNull() {
            addCriterion("effective_hours is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveHoursIsNotNull() {
            addCriterion("effective_hours is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveHoursEqualTo(Integer value) {
            addCriterion("effective_hours =", value, "effectiveHours");
            return (Criteria) this;
        }

        public Criteria andEffectiveHoursNotEqualTo(Integer value) {
            addCriterion("effective_hours <>", value, "effectiveHours");
            return (Criteria) this;
        }

        public Criteria andEffectiveHoursGreaterThan(Integer value) {
            addCriterion("effective_hours >", value, "effectiveHours");
            return (Criteria) this;
        }

        public Criteria andEffectiveHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("effective_hours >=", value, "effectiveHours");
            return (Criteria) this;
        }

        public Criteria andEffectiveHoursLessThan(Integer value) {
            addCriterion("effective_hours <", value, "effectiveHours");
            return (Criteria) this;
        }

        public Criteria andEffectiveHoursLessThanOrEqualTo(Integer value) {
            addCriterion("effective_hours <=", value, "effectiveHours");
            return (Criteria) this;
        }

        public Criteria andEffectiveHoursIn(List<Integer> values) {
            addCriterion("effective_hours in", values, "effectiveHours");
            return (Criteria) this;
        }

        public Criteria andEffectiveHoursNotIn(List<Integer> values) {
            addCriterion("effective_hours not in", values, "effectiveHours");
            return (Criteria) this;
        }

        public Criteria andEffectiveHoursBetween(Integer value1, Integer value2) {
            addCriterion("effective_hours between", value1, value2, "effectiveHours");
            return (Criteria) this;
        }

        public Criteria andEffectiveHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("effective_hours not between", value1, value2, "effectiveHours");
            return (Criteria) this;
        }

        public Criteria andFilehostIsNull() {
            addCriterion("filehost is null");
            return (Criteria) this;
        }

        public Criteria andFilehostIsNotNull() {
            addCriterion("filehost is not null");
            return (Criteria) this;
        }

        public Criteria andFilehostEqualTo(String value) {
            addCriterion("filehost =", value, "filehost");
            return (Criteria) this;
        }

        public Criteria andFilehostNotEqualTo(String value) {
            addCriterion("filehost <>", value, "filehost");
            return (Criteria) this;
        }

        public Criteria andFilehostGreaterThan(String value) {
            addCriterion("filehost >", value, "filehost");
            return (Criteria) this;
        }

        public Criteria andFilehostGreaterThanOrEqualTo(String value) {
            addCriterion("filehost >=", value, "filehost");
            return (Criteria) this;
        }

        public Criteria andFilehostLessThan(String value) {
            addCriterion("filehost <", value, "filehost");
            return (Criteria) this;
        }

        public Criteria andFilehostLessThanOrEqualTo(String value) {
            addCriterion("filehost <=", value, "filehost");
            return (Criteria) this;
        }

        public Criteria andFilehostLike(String value) {
            addCriterion("filehost like", value, "filehost");
            return (Criteria) this;
        }

        public Criteria andFilehostNotLike(String value) {
            addCriterion("filehost not like", value, "filehost");
            return (Criteria) this;
        }

        public Criteria andFilehostIn(List<String> values) {
            addCriterion("filehost in", values, "filehost");
            return (Criteria) this;
        }

        public Criteria andFilehostNotIn(List<String> values) {
            addCriterion("filehost not in", values, "filehost");
            return (Criteria) this;
        }

        public Criteria andFilehostBetween(String value1, String value2) {
            addCriterion("filehost between", value1, value2, "filehost");
            return (Criteria) this;
        }

        public Criteria andFilehostNotBetween(String value1, String value2) {
            addCriterion("filehost not between", value1, value2, "filehost");
            return (Criteria) this;
        }

        public Criteria andTofileIsNull() {
            addCriterion("tofile is null");
            return (Criteria) this;
        }

        public Criteria andTofileIsNotNull() {
            addCriterion("tofile is not null");
            return (Criteria) this;
        }

        public Criteria andTofileEqualTo(Integer value) {
            addCriterion("tofile =", value, "tofile");
            return (Criteria) this;
        }

        public Criteria andTofileNotEqualTo(Integer value) {
            addCriterion("tofile <>", value, "tofile");
            return (Criteria) this;
        }

        public Criteria andTofileGreaterThan(Integer value) {
            addCriterion("tofile >", value, "tofile");
            return (Criteria) this;
        }

        public Criteria andTofileGreaterThanOrEqualTo(Integer value) {
            addCriterion("tofile >=", value, "tofile");
            return (Criteria) this;
        }

        public Criteria andTofileLessThan(Integer value) {
            addCriterion("tofile <", value, "tofile");
            return (Criteria) this;
        }

        public Criteria andTofileLessThanOrEqualTo(Integer value) {
            addCriterion("tofile <=", value, "tofile");
            return (Criteria) this;
        }

        public Criteria andTofileIn(List<Integer> values) {
            addCriterion("tofile in", values, "tofile");
            return (Criteria) this;
        }

        public Criteria andTofileNotIn(List<Integer> values) {
            addCriterion("tofile not in", values, "tofile");
            return (Criteria) this;
        }

        public Criteria andTofileBetween(Integer value1, Integer value2) {
            addCriterion("tofile between", value1, value2, "tofile");
            return (Criteria) this;
        }

        public Criteria andTofileNotBetween(Integer value1, Integer value2) {
            addCriterion("tofile not between", value1, value2, "tofile");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
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