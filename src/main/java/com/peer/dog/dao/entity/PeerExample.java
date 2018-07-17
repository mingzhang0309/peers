package com.peer.dog.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PeerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public PeerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
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
     * This method corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
     */
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andVarietiesIsNull() {
            addCriterion("varieties is null");
            return (Criteria) this;
        }

        public Criteria andVarietiesIsNotNull() {
            addCriterion("varieties is not null");
            return (Criteria) this;
        }

        public Criteria andVarietiesEqualTo(String value) {
            addCriterion("varieties =", value, "varieties");
            return (Criteria) this;
        }

        public Criteria andVarietiesNotEqualTo(String value) {
            addCriterion("varieties <>", value, "varieties");
            return (Criteria) this;
        }

        public Criteria andVarietiesGreaterThan(String value) {
            addCriterion("varieties >", value, "varieties");
            return (Criteria) this;
        }

        public Criteria andVarietiesGreaterThanOrEqualTo(String value) {
            addCriterion("varieties >=", value, "varieties");
            return (Criteria) this;
        }

        public Criteria andVarietiesLessThan(String value) {
            addCriterion("varieties <", value, "varieties");
            return (Criteria) this;
        }

        public Criteria andVarietiesLessThanOrEqualTo(String value) {
            addCriterion("varieties <=", value, "varieties");
            return (Criteria) this;
        }

        public Criteria andVarietiesLike(String value) {
            addCriterion("varieties like", value, "varieties");
            return (Criteria) this;
        }

        public Criteria andVarietiesNotLike(String value) {
            addCriterion("varieties not like", value, "varieties");
            return (Criteria) this;
        }

        public Criteria andVarietiesIn(List<String> values) {
            addCriterion("varieties in", values, "varieties");
            return (Criteria) this;
        }

        public Criteria andVarietiesNotIn(List<String> values) {
            addCriterion("varieties not in", values, "varieties");
            return (Criteria) this;
        }

        public Criteria andVarietiesBetween(String value1, String value2) {
            addCriterion("varieties between", value1, value2, "varieties");
            return (Criteria) this;
        }

        public Criteria andVarietiesNotBetween(String value1, String value2) {
            addCriterion("varieties not between", value1, value2, "varieties");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("owner_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Integer value) {
            addCriterion("owner_id =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Integer value) {
            addCriterion("owner_id <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Integer value) {
            addCriterion("owner_id >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner_id >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Integer value) {
            addCriterion("owner_id <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("owner_id <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Integer> values) {
            addCriterion("owner_id in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Integer> values) {
            addCriterion("owner_id not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Integer value1, Integer value2) {
            addCriterion("owner_id between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("owner_id not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlIsNull() {
            addCriterion("peer_head_url is null");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlIsNotNull() {
            addCriterion("peer_head_url is not null");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlEqualTo(String value) {
            addCriterion("peer_head_url =", value, "peerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlNotEqualTo(String value) {
            addCriterion("peer_head_url <>", value, "peerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlGreaterThan(String value) {
            addCriterion("peer_head_url >", value, "peerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("peer_head_url >=", value, "peerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlLessThan(String value) {
            addCriterion("peer_head_url <", value, "peerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlLessThanOrEqualTo(String value) {
            addCriterion("peer_head_url <=", value, "peerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlLike(String value) {
            addCriterion("peer_head_url like", value, "peerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlNotLike(String value) {
            addCriterion("peer_head_url not like", value, "peerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlIn(List<String> values) {
            addCriterion("peer_head_url in", values, "peerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlNotIn(List<String> values) {
            addCriterion("peer_head_url not in", values, "peerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlBetween(String value1, String value2) {
            addCriterion("peer_head_url between", value1, value2, "peerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andPeerHeadUrlNotBetween(String value1, String value2) {
            addCriterion("peer_head_url not between", value1, value2, "peerHeadUrl");
            return (Criteria) this;
        }

        public Criteria andPeerTagIsNull() {
            addCriterion("peer_tag is null");
            return (Criteria) this;
        }

        public Criteria andPeerTagIsNotNull() {
            addCriterion("peer_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPeerTagEqualTo(String value) {
            addCriterion("peer_tag =", value, "peerTag");
            return (Criteria) this;
        }

        public Criteria andPeerTagNotEqualTo(String value) {
            addCriterion("peer_tag <>", value, "peerTag");
            return (Criteria) this;
        }

        public Criteria andPeerTagGreaterThan(String value) {
            addCriterion("peer_tag >", value, "peerTag");
            return (Criteria) this;
        }

        public Criteria andPeerTagGreaterThanOrEqualTo(String value) {
            addCriterion("peer_tag >=", value, "peerTag");
            return (Criteria) this;
        }

        public Criteria andPeerTagLessThan(String value) {
            addCriterion("peer_tag <", value, "peerTag");
            return (Criteria) this;
        }

        public Criteria andPeerTagLessThanOrEqualTo(String value) {
            addCriterion("peer_tag <=", value, "peerTag");
            return (Criteria) this;
        }

        public Criteria andPeerTagLike(String value) {
            addCriterion("peer_tag like", value, "peerTag");
            return (Criteria) this;
        }

        public Criteria andPeerTagNotLike(String value) {
            addCriterion("peer_tag not like", value, "peerTag");
            return (Criteria) this;
        }

        public Criteria andPeerTagIn(List<String> values) {
            addCriterion("peer_tag in", values, "peerTag");
            return (Criteria) this;
        }

        public Criteria andPeerTagNotIn(List<String> values) {
            addCriterion("peer_tag not in", values, "peerTag");
            return (Criteria) this;
        }

        public Criteria andPeerTagBetween(String value1, String value2) {
            addCriterion("peer_tag between", value1, value2, "peerTag");
            return (Criteria) this;
        }

        public Criteria andPeerTagNotBetween(String value1, String value2) {
            addCriterion("peer_tag not between", value1, value2, "peerTag");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table peer
     *
     * @mbggenerated do_not_delete_during_merge Wed Jul 18 00:46:23 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table peer
     *
     * @mbggenerated Wed Jul 18 00:46:23 CST 2018
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