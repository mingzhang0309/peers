package com.peer.dog.dao;

import com.peer.dog.dao.entity.TbLogin;
import com.peer.dog.dao.entity.TbLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TbLoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_login
     *
     * @mbggenerated Thu Jul 12 23:42:06 CST 2018
     */
    int countByExample(TbLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_login
     *
     * @mbggenerated Thu Jul 12 23:42:06 CST 2018
     */
    int deleteByExample(TbLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_login
     *
     * @mbggenerated Thu Jul 12 23:42:06 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_login
     *
     * @mbggenerated Thu Jul 12 23:42:06 CST 2018
     */
    int insert(TbLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_login
     *
     * @mbggenerated Thu Jul 12 23:42:06 CST 2018
     */
    int insertSelective(TbLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_login
     *
     * @mbggenerated Thu Jul 12 23:42:06 CST 2018
     */
    List<TbLogin> selectByExampleWithRowbounds(TbLoginExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_login
     *
     * @mbggenerated Thu Jul 12 23:42:06 CST 2018
     */
    List<TbLogin> selectByExample(TbLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_login
     *
     * @mbggenerated Thu Jul 12 23:42:06 CST 2018
     */
    TbLogin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_login
     *
     * @mbggenerated Thu Jul 12 23:42:06 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbLogin record, @Param("example") TbLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_login
     *
     * @mbggenerated Thu Jul 12 23:42:06 CST 2018
     */
    int updateByExample(@Param("record") TbLogin record, @Param("example") TbLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_login
     *
     * @mbggenerated Thu Jul 12 23:42:06 CST 2018
     */
    int updateByPrimaryKeySelective(TbLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_login
     *
     * @mbggenerated Thu Jul 12 23:42:06 CST 2018
     */
    int updateByPrimaryKey(TbLogin record);
}