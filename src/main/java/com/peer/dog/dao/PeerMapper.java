package com.peer.dog.dao;

import com.peer.dog.dao.entity.Peer;
import com.peer.dog.dao.entity.PeerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Fri Jun 15 21:15:50 CST 2018
     */
    int countByExample(PeerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Fri Jun 15 21:15:50 CST 2018
     */
    int deleteByExample(PeerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Fri Jun 15 21:15:50 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Fri Jun 15 21:15:50 CST 2018
     */
    int insert(Peer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Fri Jun 15 21:15:50 CST 2018
     */
    int insertSelective(Peer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Fri Jun 15 21:15:50 CST 2018
     */
    List<Peer> selectByExample(PeerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Fri Jun 15 21:15:50 CST 2018
     */
    Peer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Fri Jun 15 21:15:50 CST 2018
     */
    int updateByExampleSelective(@Param("record") Peer record, @Param("example") PeerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Fri Jun 15 21:15:50 CST 2018
     */
    int updateByExample(@Param("record") Peer record, @Param("example") PeerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Fri Jun 15 21:15:50 CST 2018
     */
    int updateByPrimaryKeySelective(Peer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer
     *
     * @mbggenerated Fri Jun 15 21:15:50 CST 2018
     */
    int updateByPrimaryKey(Peer record);
}