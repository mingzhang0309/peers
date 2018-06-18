package com.peer.dog.controller;

import com.peer.dog.dao.PeerMapper;
import com.peer.dog.dao.PeerUserMapper;
import com.peer.dog.dao.UserPeerRelaMapper;
import com.peer.dog.dao.entity.*;
import com.peer.dog.pojo.BaseResponseVO;
import com.peer.dog.pojo.PeerInfoVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author stephen.zhang
 * @date 2018/6/11.
 */
@RestController
@RequestMapping("/peer")
public class PeerControllerV1 {
    @Resource
    PeerMapper peerMapper;

    @Resource
    PeerUserMapper peerUserMapper;

    @Resource
    UserPeerRelaMapper userPeerRelaMapper;

    @PostMapping("/info/post")
    public BaseResponseVO setInfos(@RequestBody PeerInfoVo peerInfoVo) {
        Peer peer = new Peer();
        peer.setName(peerInfoVo.getName());
        peer.setSex(peerInfoVo.getSex());
        peer.setVarieties(peerInfoVo.getVarieties());
        peer.setPeerHeadUrl(peerInfoVo.getPeerHeadUrl());
        peer.setPeerTag("");

        PeerUserExample example = new PeerUserExample();
        example.createCriteria().andPhoneEqualTo(peerInfoVo.getPhone());
        List<PeerUser> peerUsers = peerUserMapper.selectByExample(example);

        //插入宠物信息
        peer.setOwnerId(peerUsers.get(0).getId());
        int peerId = peerMapper.insertSelective(peer);

        //修改用户宠物关联信息
        UserPeerRela userPeerRela = new UserPeerRela();
        userPeerRela.setPeerId(peerId);
        userPeerRela.setUserId(peer.getOwnerId());
        userPeerRela.setRela(0);
        userPeerRelaMapper.insertSelective(userPeerRela);

        return BaseResponseVO.SuccessResponse(true);
    }

    @GetMapping("/info/{id}")
    public BaseResponseVO getInfos(@PathVariable Integer id) {
        Peer peer = peerMapper.selectByPrimaryKey(id);
        if(peer == null) {
            throw new RuntimeException("宠物不存在");
        }

        PeerInfoVo peerInfoVo = new PeerInfoVo();
        peerInfoVo.setId(peer.getId());
        peerInfoVo.setName(peer.getName());
        peerInfoVo.setPeerHeadUrl(peer.getPeerHeadUrl());
        peerInfoVo.setSex(peer.getSex());
        peerInfoVo.setVarieties(peer.getVarieties());

        UserPeerRelaExample example = new UserPeerRelaExample();
        example.createCriteria().andPeerIdEqualTo(peer.getId()).andRelaEqualTo(0);
        List<UserPeerRela> userPeerRelas = userPeerRelaMapper.selectByExample(example);
        peerInfoVo.setOwnId(userPeerRelas.get(0).getUserId());
        return BaseResponseVO.SuccessResponse(peerInfoVo);
    }
}
