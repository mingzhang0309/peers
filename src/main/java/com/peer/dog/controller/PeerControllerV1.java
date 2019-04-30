package com.peer.dog.controller;

import com.google.common.collect.Lists;
import com.peer.dog.dao.*;
import com.peer.dog.dao.entity.*;
import com.peer.dog.pojo.BaseResponseVO;
import com.peer.dog.pojo.PeerInfoVo;
import com.peer.dog.util.HttpHeaderUtil;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

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

    @Resource
    PeerVarietiesMapper peerVarietiesMapper;

    @Resource
    FeedBaseMapper feedBaseMapper;

    @PostMapping("/")
    public BaseResponseVO setInfos(@RequestBody PeerInfoVo peerInfoVo) {
        Peer peer = new Peer();
        peer.setName(peerInfoVo.getName());
        peer.setSex(peerInfoVo.getSex());
        peer.setVarieties(peerInfoVo.getVarieties());
        peer.setPeerHeadUrl(peerInfoVo.getPeerHeadUrl());
        peer.setPeerTag("");

        //插入宠物信息
        peer.setOwnerId(HttpHeaderUtil.getUserId());
        int peerId = peerMapper.insertSelective(peer);

        //修改用户宠物关联信息
        UserPeerRela userPeerRela = new UserPeerRela();
        userPeerRela.setPeerId(peer.getId());
        userPeerRela.setUserId(peer.getOwnerId());
        userPeerRela.setRela(0);
        userPeerRelaMapper.insertSelective(userPeerRela);

        return BaseResponseVO.SuccessResponse(peer);
    }

    @GetMapping("/{id}")
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

        FeedBaseExample feedBaseExample = new FeedBaseExample();
        feedBaseExample.createCriteria().andPeerIdEqualTo(id);
        Integer feedCount = feedBaseMapper.countByExample(feedBaseExample);
        peerInfoVo.setFeedCount(feedCount);

        UserPeerRelaExample example = new UserPeerRelaExample();
        example.createCriteria().andPeerIdEqualTo(peer.getId()).andRelaEqualTo(0);
        List<UserPeerRela> userPeerRelas = userPeerRelaMapper.selectByExample(example);
        peerInfoVo.setOwnId(userPeerRelas.get(0).getUserId());
        return BaseResponseVO.SuccessResponse(peerInfoVo);
    }

    @GetMapping("/varieties")
    public BaseResponseVO getVarieties() {
        List<PeerVarieties> peerVarieties = peerVarietiesMapper.selectByExample(null);
        return BaseResponseVO.SuccessResponse(peerVarieties);
    }

    /**
     * 先根据自己的宠物标签推荐，没有的话再按品种推荐
     * 不考虑分页
     * @return
     */
    @GetMapping("/recommend")
    public BaseResponseVO recommend() {
        Integer userId = HttpHeaderUtil.getUserId();

        UserPeerRelaExample userPeerRelaExample = new UserPeerRelaExample();
        userPeerRelaExample.createCriteria().andUserIdEqualTo(userId);
        List<UserPeerRela> userPeerRelas = userPeerRelaMapper.selectByExample(userPeerRelaExample);

        PeerExample peerExample = new PeerExample();
        List<Integer> peerIds = userPeerRelas.stream().map(UserPeerRela::getPeerId).collect(Collectors.toList());
        peerExample.createCriteria().andIdIn(peerIds);
        List<Peer> peers = peerMapper.selectByExample(peerExample);
        List<String> peerVarietiesList = peers.stream().map(Peer::getVarieties).collect(Collectors.toList());

        PeerExample peerExample2 = new PeerExample();
        peerExample2.createCriteria().andVarietiesIn(peerVarietiesList).andOwnerIdNotEqualTo(userId);
        List<Peer> recommendPeers = peerMapper.selectByExample(peerExample);

        if(CollectionUtils.isEmpty(recommendPeers)) {
            return BaseResponseVO.SuccessResponse(null);
        } else {
            List<PeerInfoVo> peerInfoVos = Lists.newArrayList();
            for (Peer peer : recommendPeers) {
                PeerInfoVo peerInfoVo = new PeerInfoVo();
                peerInfoVo.setId(peer.getId());
                peerInfoVo.setName(peer.getName());
                peerInfoVo.setPeerHeadUrl(peer.getPeerHeadUrl());
                peerInfoVo.setSex(peer.getSex());
                peerInfoVo.setVarieties(peer.getVarieties());
                peerInfoVos.add(peerInfoVo);
            }
            return BaseResponseVO.SuccessResponse(peerInfoVos);
        }
    }
}
