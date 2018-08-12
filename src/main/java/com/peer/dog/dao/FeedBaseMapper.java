package com.peer.dog.dao;

import com.peer.dog.dao.entity.FeedBase;
import com.peer.dog.dao.entity.FeedBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FeedBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    int countByExample(FeedBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    int deleteByExample(FeedBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    int insert(FeedBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    int insertSelective(FeedBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    List<FeedBase> selectByExampleWithBLOBsWithRowbounds(FeedBaseExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    List<FeedBase> selectByExampleWithBLOBs(FeedBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    List<FeedBase> selectByExampleWithRowbounds(FeedBaseExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    List<FeedBase> selectByExample(FeedBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    FeedBase selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    int updateByExampleSelective(@Param("record") FeedBase record, @Param("example") FeedBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") FeedBase record, @Param("example") FeedBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    int updateByExample(@Param("record") FeedBase record, @Param("example") FeedBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    int updateByPrimaryKeySelective(FeedBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(FeedBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed_base
     *
     * @mbggenerated Sun Aug 12 18:03:12 CST 2018
     */
    int updateByPrimaryKey(FeedBase record);
}