package com.peer.dog.dao;

import com.peer.dog.dao.entity.TbCaptcha;
import com.peer.dog.dao.entity.TbCaptchaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TbCaptchaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_captcha
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    int countByExample(TbCaptchaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_captcha
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    int deleteByExample(TbCaptchaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_captcha
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_captcha
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    int insert(TbCaptcha record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_captcha
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    int insertSelective(TbCaptcha record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_captcha
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    List<TbCaptcha> selectByExampleWithRowbounds(TbCaptchaExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_captcha
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    List<TbCaptcha> selectByExample(TbCaptchaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_captcha
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    TbCaptcha selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_captcha
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbCaptcha record, @Param("example") TbCaptchaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_captcha
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    int updateByExample(@Param("record") TbCaptcha record, @Param("example") TbCaptchaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_captcha
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    int updateByPrimaryKeySelective(TbCaptcha record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_captcha
     *
     * @mbggenerated Mon Jul 16 00:11:06 CST 2018
     */
    int updateByPrimaryKey(TbCaptcha record);
}