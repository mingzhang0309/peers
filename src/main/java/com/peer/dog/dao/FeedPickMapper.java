package com.peer.dog.dao;

import com.peer.dog.dao.entity.FeedPick;
import com.peer.dog.dao.entity.FeedPickExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FeedPickMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_pick
     *
     * @mbggenerated Thu Jul 12 00:12:48 CST 2018
     */
    int countByExample(FeedPickExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_pick
     *
     * @mbggenerated Thu Jul 12 00:12:48 CST 2018
     */
    int deleteByExample(FeedPickExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_pick
     *
     * @mbggenerated Thu Jul 12 00:12:48 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_pick
     *
     * @mbggenerated Thu Jul 12 00:12:48 CST 2018
     */
    int insert(FeedPick record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_pick
     *
     * @mbggenerated Thu Jul 12 00:12:48 CST 2018
     */
    int insertSelective(FeedPick record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_pick
     *
     * @mbggenerated Thu Jul 12 00:12:48 CST 2018
     */
    List<FeedPick> selectByExampleWithRowbounds(FeedPickExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_pick
     *
     * @mbggenerated Thu Jul 12 00:12:48 CST 2018
     */
    List<FeedPick> selectByExample(FeedPickExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_pick
     *
     * @mbggenerated Thu Jul 12 00:12:48 CST 2018
     */
    FeedPick selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_pick
     *
     * @mbggenerated Thu Jul 12 00:12:48 CST 2018
     */
    int updateByExampleSelective(@Param("record") FeedPick record, @Param("example") FeedPickExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_pick
     *
     * @mbggenerated Thu Jul 12 00:12:48 CST 2018
     */
    int updateByExample(@Param("record") FeedPick record, @Param("example") FeedPickExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_pick
     *
     * @mbggenerated Thu Jul 12 00:12:48 CST 2018
     */
    int updateByPrimaryKeySelective(FeedPick record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_pick
     *
     * @mbggenerated Thu Jul 12 00:12:48 CST 2018
     */
    int updateByPrimaryKey(FeedPick record);
}