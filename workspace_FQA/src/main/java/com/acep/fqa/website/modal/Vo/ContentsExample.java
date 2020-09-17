package com.acep.fqa.website.modal.Vo;

import java.util.ArrayList;
import java.util.List;

public class ContentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentsExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionIsNull() {
            addCriterion("fqa_question is null");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionIsNotNull() {
            addCriterion("fqa_question is not null");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionEqualTo(String value) {
            addCriterion("fqa_question =", value, "fqaQuestion");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionNotEqualTo(String value) {
            addCriterion("fqa_question <>", value, "fqaQuestion");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionGreaterThan(String value) {
            addCriterion("fqa_question >", value, "fqaQuestion");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("fqa_question >=", value, "fqaQuestion");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionLessThan(String value) {
            addCriterion("fqa_question <", value, "fqaQuestion");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionLessThanOrEqualTo(String value) {
            addCriterion("fqa_question <=", value, "fqaQuestion");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionLike(String value) {
            addCriterion("fqa_question like", value, "fqaQuestion");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionNotLike(String value) {
            addCriterion("fqa_question not like", value, "fqaQuestion");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionIn(List<String> values) {
            addCriterion("fqa_question in", values, "fqaQuestion");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionNotIn(List<String> values) {
            addCriterion("fqa_question not in", values, "fqaQuestion");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionBetween(String value1, String value2) {
            addCriterion("fqa_question between", value1, value2, "fqaQuestion");
            return (Criteria) this;
        }

        public Criteria andFqaQuestionNotBetween(String value1, String value2) {
            addCriterion("fqa_question not between", value1, value2, "fqaQuestion");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIsNull() {
            addCriterion("parent_category is null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIsNotNull() {
            addCriterion("parent_category is not null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryEqualTo(Integer value) {
            addCriterion("parent_category =", value, "parentCategory");
            return (Criteria) this;
        }

        public Criteria andParentCategoryNotEqualTo(Integer value) {
            addCriterion("parent_category <>", value, "parentCategory");
            return (Criteria) this;
        }

        public Criteria andParentCategoryGreaterThan(Integer value) {
            addCriterion("parent_category >", value, "parentCategory");
            return (Criteria) this;
        }

        public Criteria andParentCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_category >=", value, "parentCategory");
            return (Criteria) this;
        }

        public Criteria andParentCategoryLessThan(Integer value) {
            addCriterion("parent_category <", value, "parentCategory");
            return (Criteria) this;
        }

        public Criteria andParentCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("parent_category <=", value, "parentCategory");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIn(List<Integer> values) {
            addCriterion("parent_category in", values, "parentCategory");
            return (Criteria) this;
        }

        public Criteria andParentCategoryNotIn(List<Integer> values) {
            addCriterion("parent_category not in", values, "parentCategory");
            return (Criteria) this;
        }

        public Criteria andParentCategoryBetween(Integer value1, Integer value2) {
            addCriterion("parent_category between", value1, value2, "parentCategory");
            return (Criteria) this;
        }

        public Criteria andParentCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_category not between", value1, value2, "parentCategory");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIsNull() {
            addCriterion("child_category is null");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIsNotNull() {
            addCriterion("child_category is not null");
            return (Criteria) this;
        }

        public Criteria andChildCategoryEqualTo(Integer value) {
            addCriterion("child_category =", value, "childCategory");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNotEqualTo(Integer value) {
            addCriterion("child_category <>", value, "childCategory");
            return (Criteria) this;
        }

        public Criteria andChildCategoryGreaterThan(Integer value) {
            addCriterion("child_category >", value, "childCategory");
            return (Criteria) this;
        }

        public Criteria andChildCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_category >=", value, "childCategory");
            return (Criteria) this;
        }

        public Criteria andChildCategoryLessThan(Integer value) {
            addCriterion("child_category <", value, "childCategory");
            return (Criteria) this;
        }

        public Criteria andChildCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("child_category <=", value, "childCategory");
            return (Criteria) this;
        }

        public Criteria andChildCategoryIn(List<Integer> values) {
            addCriterion("child_category in", values, "childCategory");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNotIn(List<Integer> values) {
            addCriterion("child_category not in", values, "childCategory");
            return (Criteria) this;
        }

        public Criteria andChildCategoryBetween(Integer value1, Integer value2) {
            addCriterion("child_category between", value1, value2, "childCategory");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("child_category not between", value1, value2, "childCategory");
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