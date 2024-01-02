package com.training.r.model;

import java.util.ArrayList;
import java.util.List;

public class KhachHangExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public KhachHangExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andMakhIsNull() {
            addCriterion("MaKH is null");
            return (Criteria) this;
        }

        public Criteria andMakhIsNotNull() {
            addCriterion("MaKH is not null");
            return (Criteria) this;
        }

        public Criteria andMakhEqualTo(String value) {
            addCriterion("MaKH =", value, "makh");
            return (Criteria) this;
        }

        public Criteria andMakhNotEqualTo(String value) {
            addCriterion("MaKH <>", value, "makh");
            return (Criteria) this;
        }

        public Criteria andMakhGreaterThan(String value) {
            addCriterion("MaKH >", value, "makh");
            return (Criteria) this;
        }

        public Criteria andMakhGreaterThanOrEqualTo(String value) {
            addCriterion("MaKH >=", value, "makh");
            return (Criteria) this;
        }

        public Criteria andMakhLessThan(String value) {
            addCriterion("MaKH <", value, "makh");
            return (Criteria) this;
        }

        public Criteria andMakhLessThanOrEqualTo(String value) {
            addCriterion("MaKH <=", value, "makh");
            return (Criteria) this;
        }

        public Criteria andMakhLike(String value) {
            addCriterion("MaKH like", value, "makh");
            return (Criteria) this;
        }

        public Criteria andMakhNotLike(String value) {
            addCriterion("MaKH not like", value, "makh");
            return (Criteria) this;
        }

        public Criteria andMakhIn(List<String> values) {
            addCriterion("MaKH in", values, "makh");
            return (Criteria) this;
        }

        public Criteria andMakhNotIn(List<String> values) {
            addCriterion("MaKH not in", values, "makh");
            return (Criteria) this;
        }

        public Criteria andMakhBetween(String value1, String value2) {
            addCriterion("MaKH between", value1, value2, "makh");
            return (Criteria) this;
        }

        public Criteria andMakhNotBetween(String value1, String value2) {
            addCriterion("MaKH not between", value1, value2, "makh");
            return (Criteria) this;
        }

        public Criteria andDiachiIsNull() {
            addCriterion("DiaChi is null");
            return (Criteria) this;
        }

        public Criteria andDiachiIsNotNull() {
            addCriterion("DiaChi is not null");
            return (Criteria) this;
        }

        public Criteria andDiachiEqualTo(String value) {
            addCriterion("DiaChi =", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotEqualTo(String value) {
            addCriterion("DiaChi <>", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiGreaterThan(String value) {
            addCriterion("DiaChi >", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiGreaterThanOrEqualTo(String value) {
            addCriterion("DiaChi >=", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiLessThan(String value) {
            addCriterion("DiaChi <", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiLessThanOrEqualTo(String value) {
            addCriterion("DiaChi <=", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiLike(String value) {
            addCriterion("DiaChi like", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotLike(String value) {
            addCriterion("DiaChi not like", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiIn(List<String> values) {
            addCriterion("DiaChi in", values, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotIn(List<String> values) {
            addCriterion("DiaChi not in", values, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiBetween(String value1, String value2) {
            addCriterion("DiaChi between", value1, value2, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotBetween(String value1, String value2) {
            addCriterion("DiaChi not between", value1, value2, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiemailIsNull() {
            addCriterion("DiaChiEmail is null");
            return (Criteria) this;
        }

        public Criteria andDiachiemailIsNotNull() {
            addCriterion("DiaChiEmail is not null");
            return (Criteria) this;
        }

        public Criteria andDiachiemailEqualTo(String value) {
            addCriterion("DiaChiEmail =", value, "diachiemail");
            return (Criteria) this;
        }

        public Criteria andDiachiemailNotEqualTo(String value) {
            addCriterion("DiaChiEmail <>", value, "diachiemail");
            return (Criteria) this;
        }

        public Criteria andDiachiemailGreaterThan(String value) {
            addCriterion("DiaChiEmail >", value, "diachiemail");
            return (Criteria) this;
        }

        public Criteria andDiachiemailGreaterThanOrEqualTo(String value) {
            addCriterion("DiaChiEmail >=", value, "diachiemail");
            return (Criteria) this;
        }

        public Criteria andDiachiemailLessThan(String value) {
            addCriterion("DiaChiEmail <", value, "diachiemail");
            return (Criteria) this;
        }

        public Criteria andDiachiemailLessThanOrEqualTo(String value) {
            addCriterion("DiaChiEmail <=", value, "diachiemail");
            return (Criteria) this;
        }

        public Criteria andDiachiemailLike(String value) {
            addCriterion("DiaChiEmail like", value, "diachiemail");
            return (Criteria) this;
        }

        public Criteria andDiachiemailNotLike(String value) {
            addCriterion("DiaChiEmail not like", value, "diachiemail");
            return (Criteria) this;
        }

        public Criteria andDiachiemailIn(List<String> values) {
            addCriterion("DiaChiEmail in", values, "diachiemail");
            return (Criteria) this;
        }

        public Criteria andDiachiemailNotIn(List<String> values) {
            addCriterion("DiaChiEmail not in", values, "diachiemail");
            return (Criteria) this;
        }

        public Criteria andDiachiemailBetween(String value1, String value2) {
            addCriterion("DiaChiEmail between", value1, value2, "diachiemail");
            return (Criteria) this;
        }

        public Criteria andDiachiemailNotBetween(String value1, String value2) {
            addCriterion("DiaChiEmail not between", value1, value2, "diachiemail");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiIsNull() {
            addCriterion("SoDienThoai is null");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiIsNotNull() {
            addCriterion("SoDienThoai is not null");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiEqualTo(String value) {
            addCriterion("SoDienThoai =", value, "sodienthoai");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiNotEqualTo(String value) {
            addCriterion("SoDienThoai <>", value, "sodienthoai");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiGreaterThan(String value) {
            addCriterion("SoDienThoai >", value, "sodienthoai");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiGreaterThanOrEqualTo(String value) {
            addCriterion("SoDienThoai >=", value, "sodienthoai");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiLessThan(String value) {
            addCriterion("SoDienThoai <", value, "sodienthoai");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiLessThanOrEqualTo(String value) {
            addCriterion("SoDienThoai <=", value, "sodienthoai");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiLike(String value) {
            addCriterion("SoDienThoai like", value, "sodienthoai");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiNotLike(String value) {
            addCriterion("SoDienThoai not like", value, "sodienthoai");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiIn(List<String> values) {
            addCriterion("SoDienThoai in", values, "sodienthoai");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiNotIn(List<String> values) {
            addCriterion("SoDienThoai not in", values, "sodienthoai");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiBetween(String value1, String value2) {
            addCriterion("SoDienThoai between", value1, value2, "sodienthoai");
            return (Criteria) this;
        }

        public Criteria andSodienthoaiNotBetween(String value1, String value2) {
            addCriterion("SoDienThoai not between", value1, value2, "sodienthoai");
            return (Criteria) this;
        }

        public Criteria andTenkhIsNull() {
            addCriterion("TenKH is null");
            return (Criteria) this;
        }

        public Criteria andTenkhIsNotNull() {
            addCriterion("TenKH is not null");
            return (Criteria) this;
        }

        public Criteria andTenkhEqualTo(String value) {
            addCriterion("TenKH =", value, "tenkh");
            return (Criteria) this;
        }

        public Criteria andTenkhNotEqualTo(String value) {
            addCriterion("TenKH <>", value, "tenkh");
            return (Criteria) this;
        }

        public Criteria andTenkhGreaterThan(String value) {
            addCriterion("TenKH >", value, "tenkh");
            return (Criteria) this;
        }

        public Criteria andTenkhGreaterThanOrEqualTo(String value) {
            addCriterion("TenKH >=", value, "tenkh");
            return (Criteria) this;
        }

        public Criteria andTenkhLessThan(String value) {
            addCriterion("TenKH <", value, "tenkh");
            return (Criteria) this;
        }

        public Criteria andTenkhLessThanOrEqualTo(String value) {
            addCriterion("TenKH <=", value, "tenkh");
            return (Criteria) this;
        }

        public Criteria andTenkhLike(String value) {
            addCriterion("TenKH like", value, "tenkh");
            return (Criteria) this;
        }

        public Criteria andTenkhNotLike(String value) {
            addCriterion("TenKH not like", value, "tenkh");
            return (Criteria) this;
        }

        public Criteria andTenkhIn(List<String> values) {
            addCriterion("TenKH in", values, "tenkh");
            return (Criteria) this;
        }

        public Criteria andTenkhNotIn(List<String> values) {
            addCriterion("TenKH not in", values, "tenkh");
            return (Criteria) this;
        }

        public Criteria andTenkhBetween(String value1, String value2) {
            addCriterion("TenKH between", value1, value2, "tenkh");
            return (Criteria) this;
        }

        public Criteria andTenkhNotBetween(String value1, String value2) {
            addCriterion("TenKH not between", value1, value2, "tenkh");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table KHACHHANG
     *
     * @mbg.generated do_not_delete_during_merge Thu Mar 02 14:52:42 ICT 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table KHACHHANG
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
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