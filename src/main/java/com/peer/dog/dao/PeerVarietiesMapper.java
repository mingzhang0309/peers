package com.peer.dog.dao;

import com.peer.dog.dao.entity.PeerVarieties;
import com.peer.dog.dao.entity.PeerVarietiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PeerVarietiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer_varieties
     *
     * @mbggenerated Mon Sep 24 00:24:30 CST 2018
     */
    int countByExample(PeerVarietiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer_varieties
     *
     * @mbggenerated Mon Sep 24 00:24:30 CST 2018
     */
    int deleteByExample(PeerVarietiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer_varieties
     *
     * @mbggenerated Mon Sep 24 00:24:30 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer_varieties
     *
     * @mbggenerated Mon Sep 24 00:24:30 CST 2018
     */
    int insert(PeerVarieties record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer_varieties
     *
     * @mbggenerated Mon Sep 24 00:24:30 CST 2018
     */
    int insertSelective(PeerVarieties record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer_varieties
     *
     * @mbggenerated Mon Sep 24 00:24:30 CST 2018
     */
    List<PeerVarieties> selectByExampleWithRowbounds(PeerVarietiesExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer_varieties
     *
     * @mbggenerated Mon Sep 24 00:24:30 CST 2018
     */
    List<PeerVarieties> selectByExample(PeerVarietiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer_varieties
     *
     * @mbggenerated Mon Sep 24 00:24:30 CST 2018
     */
    PeerVarieties selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer_varieties
     *
     * @mbggenerated Mon Sep 24 00:24:30 CST 2018
     */
    int updateByExampleSelective(@Param("record") PeerVarieties record, @Param("example") PeerVarietiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer_varieties
     *
     * @mbggenerated Mon Sep 24 00:24:30 CST 2018
     */
    int updateByExample(@Param("record") PeerVarieties record, @Param("example") PeerVarietiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer_varieties
     *
     * @mbggenerated Mon Sep 24 00:24:30 CST 2018
     */
    int updateByPrimaryKeySelective(PeerVarieties record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table peer_varieties
     *
     * @mbggenerated Mon Sep 24 00:24:30 CST 2018
     */
    int updateByPrimaryKey(PeerVarieties record);
}