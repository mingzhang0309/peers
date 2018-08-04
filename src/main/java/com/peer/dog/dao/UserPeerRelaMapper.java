package com.peer.dog.dao;

import com.peer.dog.dao.entity.UserPeerRela;
import com.peer.dog.dao.entity.UserPeerRelaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserPeerRelaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_peer_rela
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    int countByExample(UserPeerRelaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_peer_rela
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    int deleteByExample(UserPeerRelaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_peer_rela
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_peer_rela
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    int insert(UserPeerRela record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_peer_rela
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    int insertSelective(UserPeerRela record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_peer_rela
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    List<UserPeerRela> selectByExampleWithRowbounds(UserPeerRelaExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_peer_rela
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    List<UserPeerRela> selectByExample(UserPeerRelaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_peer_rela
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    UserPeerRela selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_peer_rela
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserPeerRela record, @Param("example") UserPeerRelaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_peer_rela
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    int updateByExample(@Param("record") UserPeerRela record, @Param("example") UserPeerRelaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_peer_rela
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    int updateByPrimaryKeySelective(UserPeerRela record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_peer_rela
     *
     * @mbggenerated Tue Jul 24 23:05:12 CST 2018
     */
    int updateByPrimaryKey(UserPeerRela record);
}