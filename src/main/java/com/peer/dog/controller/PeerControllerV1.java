package com.peer.dog.controller;

import com.peer.dog.dao.PeerMapper;
import com.peer.dog.dao.PeerUserMapper;
import com.peer.dog.dao.entity.Peer;
import com.peer.dog.dao.entity.PeerUser;
import com.peer.dog.dao.entity.PeerUserExample;
import com.peer.dog.pojo.BaseResponseVO;
import com.peer.dog.pojo.PeerInfoVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author stephen.zhang
 * @date 2018/6/11.
 */
@RestController
@RequestMapping("v1/peer")
public class PeerControllerV1 {
    @Resource
    PeerMapper peerMapper;

    @Resource
    PeerUserMapper peerUserMapper;

    @PostMapping("/info/post")
    public BaseResponseVO setInfos(@RequestBody PeerInfoVo peerInfoVo) {
        Peer peer = new Peer();
        peer.setName(peerInfoVo.getName());
        peer.setSex(peerInfoVo.getSex());
        peer.setVarieties(peerInfoVo.getVarieties());
        peer.setPeerHeadUrl(peerInfoVo.getPeerHeadUrl());

        PeerUserExample example = new PeerUserExample();
        example.createCriteria().andPhoneEqualTo(peerInfoVo.getPhone());
        List<PeerUser> peerUsers = peerUserMapper.selectByExample(example);

        //插入宠物信息
        peer.setOwnerId(peerUsers.get(0).getId());
        int peerId = peerMapper.insert(peer);

        //修改用户信息
        PeerUser peerUser = new PeerUser();
        peerUser.setPeerId(peerId);
        peerUser.setIsMaster(true);
        peerUserMapper.updateByExampleSelective(peerUser, example);

        return BaseResponseVO.SuccessResponse(true);
    }
}
