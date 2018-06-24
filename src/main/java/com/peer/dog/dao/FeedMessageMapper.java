package com.peer.dog.dao;

import com.peer.dog.dao.entity.FeedMessage;
import com.peer.dog.dao.entity.FeedMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FeedMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_message
     *
     * @mbggenerated Sun Jun 24 18:26:18 CST 2018
     */
    int countByExample(FeedMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_message
     *
     * @mbggenerated Sun Jun 24 18:26:18 CST 2018
     */
    int deleteByExample(FeedMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_message
     *
     * @mbggenerated Sun Jun 24 18:26:18 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_message
     *
     * @mbggenerated Sun Jun 24 18:26:18 CST 2018
     */
    int insert(FeedMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_message
     *
     * @mbggenerated Sun Jun 24 18:26:18 CST 2018
     */
    int insertSelective(FeedMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_message
     *
     * @mbggenerated Sun Jun 24 18:26:18 CST 2018
     */
    List<FeedMessage> selectByExampleWithRowbounds(FeedMessageExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_message
     *
     * @mbggenerated Sun Jun 24 18:26:18 CST 2018
     */
    List<FeedMessage> selectByExample(FeedMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_message
     *
     * @mbggenerated Sun Jun 24 18:26:18 CST 2018
     */
    FeedMessage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_message
     *
     * @mbggenerated Sun Jun 24 18:26:18 CST 2018
     */
    int updateByExampleSelective(@Param("record") FeedMessage record, @Param("example") FeedMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_message
     *
     * @mbggenerated Sun Jun 24 18:26:18 CST 2018
     */
    int updateByExample(@Param("record") FeedMessage record, @Param("example") FeedMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_message
     *
     * @mbggenerated Sun Jun 24 18:26:18 CST 2018
     */
    int updateByPrimaryKeySelective(FeedMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_message
     *
     * @mbggenerated Sun Jun 24 18:26:18 CST 2018
     */
    int updateByPrimaryKey(FeedMessage record);
}