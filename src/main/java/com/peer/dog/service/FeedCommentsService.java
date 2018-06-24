package com.peer.dog.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.peer.dog.dao.FeedMessageMapper;
import com.peer.dog.dao.PeerUserMapper;
import com.peer.dog.dao.entity.FeedMessage;
import com.peer.dog.dao.entity.FeedMessageExample;
import com.peer.dog.dao.entity.PeerUser;
import com.peer.dog.dao.entity.PeerUserExample;
import com.peer.dog.pojo.CommentVO;
import com.peer.dog.pojo.FeedBaseVO;
import com.peer.dog.pojo.FeedCommentsResponseVO;
import com.peer.dog.pojo.PostCommentVO;
import com.peer.dog.util.HttpHeaderUtil;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
@Component
public class FeedCommentsService {
    @Resource
    FeedMessageMapper feedMessageMapper;

    @Resource
    PeerUserMapper peerUserMapper;

    public FeedCommentsResponseVO getFeedComments(Integer feedId) {
        FeedMessageExample example = new FeedMessageExample();
        example.createCriteria().andFeedIdEqualTo(feedId);
        example.setOrderByClause("`create_time` ASC");
        List<FeedMessage> feedMessages = feedMessageMapper.selectByExample(example);

        return handlerCommentsResponse(feedMessages);
    }

    public FeedCommentsResponseVO batchGetFeedComments(List<Integer> feedBaseVOs) {
        if(CollectionUtils.isEmpty(feedBaseVOs)) {
            return null;
        }

        FeedMessageExample example = new FeedMessageExample();
        example.createCriteria().andFeedIdIn(feedBaseVOs);
        example.setOrderByClause("`create_time` ASC");
        List<FeedMessage> feedMessages = feedMessageMapper.selectByExample(example);

        return handlerCommentsResponse(feedMessages);
    }

    private FeedCommentsResponseVO handlerCommentsResponse(List<FeedMessage> feedMessages) {
        if(CollectionUtils.isEmpty(feedMessages)) {
            return null;
        } else {
            FeedCommentsResponseVO responseVO = new FeedCommentsResponseVO();
            Map<Integer, CommentVO> mainComment = Maps.newHashMap();
            for (FeedMessage feedMessage : feedMessages) {
                PeerUser peerUser = peerUserMapper.selectByPrimaryKey(feedMessage.getUserId());

                //主留言
                if(feedMessage.getParentId() == -1) {
                    CommentVO commentVO = new CommentVO();
                    commentVO.setId(feedMessage.getId());
                    commentVO.setMessage(feedMessage.getMessage());
                    commentVO.setUserNick(peerUser.getNick());
                    commentVO.setUserHeaderUrl(peerUser.getHeadUrl());
                    mainComment.put(commentVO.getId(), commentVO);
                } else {
                    //回复留言
                    CommentVO commentVO = mainComment.get(feedMessage.getParentId());
                    CommentVO subCommentVO = new CommentVO();
                    subCommentVO.setId(feedMessage.getId());
                    subCommentVO.setMessage(feedMessage.getMessage());
                    subCommentVO.setUserNick(peerUser.getNick());
                    subCommentVO.setUserHeaderUrl(peerUser.getHeadUrl());
                    if (commentVO.getSubComment() == null) {
                        commentVO.setSubComment(new ArrayList<>());
                    }

                    commentVO.getSubComment().add(subCommentVO);
                }
            }

            responseVO.setCommentVOS(mainComment);
            return responseVO;
        }
    }

    public boolean putComment(PostCommentVO postCommentVO) {
        FeedMessage feedMessage = new FeedMessage();
        feedMessage.setFeedId(postCommentVO.getFeedId());
        feedMessage.setUserId(HttpHeaderUtil.getUserId());
        feedMessage.setMessage(postCommentVO.getMessage());
        feedMessage.setParentId(postCommentVO.getParentId());
        feedMessageMapper.insertSelective(feedMessage);
        return true;
    }
}
