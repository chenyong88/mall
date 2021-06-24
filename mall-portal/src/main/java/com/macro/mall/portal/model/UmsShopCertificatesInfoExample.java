package com.macro.mall.portal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UmsShopCertificatesInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsShopCertificatesInfoExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgIsNull() {
            addCriterion("idcard_positive_img is null");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgIsNotNull() {
            addCriterion("idcard_positive_img is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgEqualTo(String value) {
            addCriterion("idcard_positive_img =", value, "idcardPositiveImg");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgNotEqualTo(String value) {
            addCriterion("idcard_positive_img <>", value, "idcardPositiveImg");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgGreaterThan(String value) {
            addCriterion("idcard_positive_img >", value, "idcardPositiveImg");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_positive_img >=", value, "idcardPositiveImg");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgLessThan(String value) {
            addCriterion("idcard_positive_img <", value, "idcardPositiveImg");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgLessThanOrEqualTo(String value) {
            addCriterion("idcard_positive_img <=", value, "idcardPositiveImg");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgLike(String value) {
            addCriterion("idcard_positive_img like", value, "idcardPositiveImg");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgNotLike(String value) {
            addCriterion("idcard_positive_img not like", value, "idcardPositiveImg");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgIn(List<String> values) {
            addCriterion("idcard_positive_img in", values, "idcardPositiveImg");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgNotIn(List<String> values) {
            addCriterion("idcard_positive_img not in", values, "idcardPositiveImg");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgBetween(String value1, String value2) {
            addCriterion("idcard_positive_img between", value1, value2, "idcardPositiveImg");
            return (Criteria) this;
        }

        public Criteria andIdcardPositiveImgNotBetween(String value1, String value2) {
            addCriterion("idcard_positive_img not between", value1, value2, "idcardPositiveImg");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgIsNull() {
            addCriterion("idcard_back_img is null");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgIsNotNull() {
            addCriterion("idcard_back_img is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgEqualTo(String value) {
            addCriterion("idcard_back_img =", value, "idcardBackImg");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgNotEqualTo(String value) {
            addCriterion("idcard_back_img <>", value, "idcardBackImg");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgGreaterThan(String value) {
            addCriterion("idcard_back_img >", value, "idcardBackImg");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_back_img >=", value, "idcardBackImg");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgLessThan(String value) {
            addCriterion("idcard_back_img <", value, "idcardBackImg");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgLessThanOrEqualTo(String value) {
            addCriterion("idcard_back_img <=", value, "idcardBackImg");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgLike(String value) {
            addCriterion("idcard_back_img like", value, "idcardBackImg");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgNotLike(String value) {
            addCriterion("idcard_back_img not like", value, "idcardBackImg");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgIn(List<String> values) {
            addCriterion("idcard_back_img in", values, "idcardBackImg");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgNotIn(List<String> values) {
            addCriterion("idcard_back_img not in", values, "idcardBackImg");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgBetween(String value1, String value2) {
            addCriterion("idcard_back_img between", value1, value2, "idcardBackImg");
            return (Criteria) this;
        }

        public Criteria andIdcardBackImgNotBetween(String value1, String value2) {
            addCriterion("idcard_back_img not between", value1, value2, "idcardBackImg");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("business_license is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("business_license is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("business_license =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("business_license <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("business_license >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("business_license >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("business_license <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("business_license <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("business_license like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("business_license not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("business_license in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("business_license not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("business_license between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("business_license not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andIdcardNameIsNull() {
            addCriterion("idcard_name is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNameIsNotNull() {
            addCriterion("idcard_name is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNameEqualTo(String value) {
            addCriterion("idcard_name =", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameNotEqualTo(String value) {
            addCriterion("idcard_name <>", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameGreaterThan(String value) {
            addCriterion("idcard_name >", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_name >=", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameLessThan(String value) {
            addCriterion("idcard_name <", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameLessThanOrEqualTo(String value) {
            addCriterion("idcard_name <=", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameLike(String value) {
            addCriterion("idcard_name like", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameNotLike(String value) {
            addCriterion("idcard_name not like", value, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameIn(List<String> values) {
            addCriterion("idcard_name in", values, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameNotIn(List<String> values) {
            addCriterion("idcard_name not in", values, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameBetween(String value1, String value2) {
            addCriterion("idcard_name between", value1, value2, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNameNotBetween(String value1, String value2) {
            addCriterion("idcard_name not between", value1, value2, "idcardName");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIsNull() {
            addCriterion("idcard_number is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIsNotNull() {
            addCriterion("idcard_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberEqualTo(String value) {
            addCriterion("idcard_number =", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotEqualTo(String value) {
            addCriterion("idcard_number <>", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberGreaterThan(String value) {
            addCriterion("idcard_number >", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_number >=", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLessThan(String value) {
            addCriterion("idcard_number <", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLessThanOrEqualTo(String value) {
            addCriterion("idcard_number <=", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLike(String value) {
            addCriterion("idcard_number like", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotLike(String value) {
            addCriterion("idcard_number not like", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIn(List<String> values) {
            addCriterion("idcard_number in", values, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotIn(List<String> values) {
            addCriterion("idcard_number not in", values, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberBetween(String value1, String value2) {
            addCriterion("idcard_number between", value1, value2, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotBetween(String value1, String value2) {
            addCriterion("idcard_number not between", value1, value2, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIsNull() {
            addCriterion("idcard_type is null");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIsNotNull() {
            addCriterion("idcard_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeEqualTo(String value) {
            addCriterion("idcard_type =", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeNotEqualTo(String value) {
            addCriterion("idcard_type <>", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeGreaterThan(String value) {
            addCriterion("idcard_type >", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_type >=", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeLessThan(String value) {
            addCriterion("idcard_type <", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeLessThanOrEqualTo(String value) {
            addCriterion("idcard_type <=", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeLike(String value) {
            addCriterion("idcard_type like", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeNotLike(String value) {
            addCriterion("idcard_type not like", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIn(List<String> values) {
            addCriterion("idcard_type in", values, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeNotIn(List<String> values) {
            addCriterion("idcard_type not in", values, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeBetween(String value1, String value2) {
            addCriterion("idcard_type between", value1, value2, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeNotBetween(String value1, String value2) {
            addCriterion("idcard_type not between", value1, value2, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityEndIsNull() {
            addCriterion("idcard_validity_end is null");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityEndIsNotNull() {
            addCriterion("idcard_validity_end is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityEndEqualTo(Date value) {
            addCriterionForJDBCDate("idcard_validity_end =", value, "idcardValidityEnd");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("idcard_validity_end <>", value, "idcardValidityEnd");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityEndGreaterThan(Date value) {
            addCriterionForJDBCDate("idcard_validity_end >", value, "idcardValidityEnd");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("idcard_validity_end >=", value, "idcardValidityEnd");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityEndLessThan(Date value) {
            addCriterionForJDBCDate("idcard_validity_end <", value, "idcardValidityEnd");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("idcard_validity_end <=", value, "idcardValidityEnd");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityEndIn(List<Date> values) {
            addCriterionForJDBCDate("idcard_validity_end in", values, "idcardValidityEnd");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("idcard_validity_end not in", values, "idcardValidityEnd");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("idcard_validity_end between", value1, value2, "idcardValidityEnd");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("idcard_validity_end not between", value1, value2, "idcardValidityEnd");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityStartIsNull() {
            addCriterion("idcard_validity_start is null");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityStartIsNotNull() {
            addCriterion("idcard_validity_start is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityStartEqualTo(Date value) {
            addCriterionForJDBCDate("idcard_validity_start =", value, "idcardValidityStart");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("idcard_validity_start <>", value, "idcardValidityStart");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityStartGreaterThan(Date value) {
            addCriterionForJDBCDate("idcard_validity_start >", value, "idcardValidityStart");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("idcard_validity_start >=", value, "idcardValidityStart");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityStartLessThan(Date value) {
            addCriterionForJDBCDate("idcard_validity_start <", value, "idcardValidityStart");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("idcard_validity_start <=", value, "idcardValidityStart");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityStartIn(List<Date> values) {
            addCriterionForJDBCDate("idcard_validity_start in", values, "idcardValidityStart");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("idcard_validity_start not in", values, "idcardValidityStart");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("idcard_validity_start between", value1, value2, "idcardValidityStart");
            return (Criteria) this;
        }

        public Criteria andIdcardValidityStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("idcard_validity_start not between", value1, value2, "idcardValidityStart");
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