package com.training.r.model;

import java.util.ArrayList;
import java.util.List;

public class SuDungDichVuExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SUDUNGDICHVU
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SUDUNGDICHVU
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SUDUNGDICHVU
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUDUNGDICHVU
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public SuDungDichVuExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUDUNGDICHVU
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUDUNGDICHVU
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUDUNGDICHVU
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUDUNGDICHVU
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUDUNGDICHVU
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUDUNGDICHVU
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUDUNGDICHVU
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
     * This method corresponds to the database table SUDUNGDICHVU
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
     * This method corresponds to the database table SUDUNGDICHVU
     *
     * @mbg.generated Thu Mar 02 14:52:42 ICT 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SUDUNGDICHVU
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
     * This class corresponds to the database table SUDUNGDICHVU
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

        public Criteria andMadvIsNull() {
            addCriterion("MaDV is null");
            return (Criteria) this;
        }

        public Criteria andMadvIsNotNull() {
            addCriterion("MaDV is not null");
            return (Criteria) this;
        }

        public Criteria andMadvEqualTo(String value) {
            addCriterion("MaDV =", value, "madv");
            return (Criteria) this;
        }

        public Criteria andMadvNotEqualTo(String value) {
            addCriterion("MaDV <>", value, "madv");
            return (Criteria) this;
        }

        public Criteria andMadvGreaterThan(String value) {
            addCriterion("MaDV >", value, "madv");
            return (Criteria) this;
        }

        public Criteria andMadvGreaterThanOrEqualTo(String value) {
            addCriterion("MaDV >=", value, "madv");
            return (Criteria) this;
        }

        public Criteria andMadvLessThan(String value) {
            addCriterion("MaDV <", value, "madv");
            return (Criteria) this;
        }

        public Criteria andMadvLessThanOrEqualTo(String value) {
            addCriterion("MaDV <=", value, "madv");
            return (Criteria) this;
        }

        public Criteria andMadvLike(String value) {
            addCriterion("MaDV like", value, "madv");
            return (Criteria) this;
        }

        public Criteria andMadvNotLike(String value) {
            addCriterion("MaDV not like", value, "madv");
            return (Criteria) this;
        }

        public Criteria andMadvIn(List<String> values) {
            addCriterion("MaDV in", values, "madv");
            return (Criteria) this;
        }

        public Criteria andMadvNotIn(List<String> values) {
            addCriterion("MaDV not in", values, "madv");
            return (Criteria) this;
        }

        public Criteria andMadvBetween(String value1, String value2) {
            addCriterion("MaDV between", value1, value2, "madv");
            return (Criteria) this;
        }

        public Criteria andMadvNotBetween(String value1, String value2) {
            addCriterion("MaDV not between", value1, value2, "madv");
            return (Criteria) this;
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

        public Criteria andNgaysudungIsNull() {
            addCriterion("NgaySuDung is null");
            return (Criteria) this;
        }

        public Criteria andNgaysudungIsNotNull() {
            addCriterion("NgaySuDung is not null");
            return (Criteria) this;
        }

        public Criteria andNgaysudungEqualTo(String value) {
            addCriterion("NgaySuDung =", value, "ngaysudung");
            return (Criteria) this;
        }

        public Criteria andNgaysudungNotEqualTo(String value) {
            addCriterion("NgaySuDung <>", value, "ngaysudung");
            return (Criteria) this;
        }

        public Criteria andNgaysudungGreaterThan(String value) {
            addCriterion("NgaySuDung >", value, "ngaysudung");
            return (Criteria) this;
        }

        public Criteria andNgaysudungGreaterThanOrEqualTo(String value) {
            addCriterion("NgaySuDung >=", value, "ngaysudung");
            return (Criteria) this;
        }

        public Criteria andNgaysudungLessThan(String value) {
            addCriterion("NgaySuDung <", value, "ngaysudung");
            return (Criteria) this;
        }

        public Criteria andNgaysudungLessThanOrEqualTo(String value) {
            addCriterion("NgaySuDung <=", value, "ngaysudung");
            return (Criteria) this;
        }

        public Criteria andNgaysudungLike(String value) {
            addCriterion("NgaySuDung like", value, "ngaysudung");
            return (Criteria) this;
        }

        public Criteria andNgaysudungNotLike(String value) {
            addCriterion("NgaySuDung not like", value, "ngaysudung");
            return (Criteria) this;
        }

        public Criteria andNgaysudungIn(List<String> values) {
            addCriterion("NgaySuDung in", values, "ngaysudung");
            return (Criteria) this;
        }

        public Criteria andNgaysudungNotIn(List<String> values) {
            addCriterion("NgaySuDung not in", values, "ngaysudung");
            return (Criteria) this;
        }

        public Criteria andNgaysudungBetween(String value1, String value2) {
            addCriterion("NgaySuDung between", value1, value2, "ngaysudung");
            return (Criteria) this;
        }

        public Criteria andNgaysudungNotBetween(String value1, String value2) {
            addCriterion("NgaySuDung not between", value1, value2, "ngaysudung");
            return (Criteria) this;
        }

        public Criteria andGiosudungIsNull() {
            addCriterion("GioSuDung is null");
            return (Criteria) this;
        }

        public Criteria andGiosudungIsNotNull() {
            addCriterion("GioSuDung is not null");
            return (Criteria) this;
        }

        public Criteria andGiosudungEqualTo(String value) {
            addCriterion("GioSuDung =", value, "giosudung");
            return (Criteria) this;
        }

        public Criteria andGiosudungNotEqualTo(String value) {
            addCriterion("GioSuDung <>", value, "giosudung");
            return (Criteria) this;
        }

        public Criteria andGiosudungGreaterThan(String value) {
            addCriterion("GioSuDung >", value, "giosudung");
            return (Criteria) this;
        }

        public Criteria andGiosudungGreaterThanOrEqualTo(String value) {
            addCriterion("GioSuDung >=", value, "giosudung");
            return (Criteria) this;
        }

        public Criteria andGiosudungLessThan(String value) {
            addCriterion("GioSuDung <", value, "giosudung");
            return (Criteria) this;
        }

        public Criteria andGiosudungLessThanOrEqualTo(String value) {
            addCriterion("GioSuDung <=", value, "giosudung");
            return (Criteria) this;
        }

        public Criteria andGiosudungLike(String value) {
            addCriterion("GioSuDung like", value, "giosudung");
            return (Criteria) this;
        }

        public Criteria andGiosudungNotLike(String value) {
            addCriterion("GioSuDung not like", value, "giosudung");
            return (Criteria) this;
        }

        public Criteria andGiosudungIn(List<String> values) {
            addCriterion("GioSuDung in", values, "giosudung");
            return (Criteria) this;
        }

        public Criteria andGiosudungNotIn(List<String> values) {
            addCriterion("GioSuDung not in", values, "giosudung");
            return (Criteria) this;
        }

        public Criteria andGiosudungBetween(String value1, String value2) {
            addCriterion("GioSuDung between", value1, value2, "giosudung");
            return (Criteria) this;
        }

        public Criteria andGiosudungNotBetween(String value1, String value2) {
            addCriterion("GioSuDung not between", value1, value2, "giosudung");
            return (Criteria) this;
        }

        public Criteria andSoluongIsNull() {
            addCriterion("SoLuong is null");
            return (Criteria) this;
        }

        public Criteria andSoluongIsNotNull() {
            addCriterion("SoLuong is not null");
            return (Criteria) this;
        }

        public Criteria andSoluongEqualTo(Integer value) {
            addCriterion("SoLuong =", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongNotEqualTo(Integer value) {
            addCriterion("SoLuong <>", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongGreaterThan(Integer value) {
            addCriterion("SoLuong >", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongGreaterThanOrEqualTo(Integer value) {
            addCriterion("SoLuong >=", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongLessThan(Integer value) {
            addCriterion("SoLuong <", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongLessThanOrEqualTo(Integer value) {
            addCriterion("SoLuong <=", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongIn(List<Integer> values) {
            addCriterion("SoLuong in", values, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongNotIn(List<Integer> values) {
            addCriterion("SoLuong not in", values, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongBetween(Integer value1, Integer value2) {
            addCriterion("SoLuong between", value1, value2, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongNotBetween(Integer value1, Integer value2) {
            addCriterion("SoLuong not between", value1, value2, "soluong");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SUDUNGDICHVU
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
     * This class corresponds to the database table SUDUNGDICHVU
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