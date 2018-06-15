package com.peer.dog.service;

import com.peer.dog.dao.FeedMessageMapper;
import com.peer.dog.dao.entity.FeedMessage;
import com.peer.dog.dao.entity.FeedMessageExample;
import com.peer.dog.pojo.CommentVO;
import com.peer.dog.pojo.FeedBaseVO;
import com.peer.dog.pojo.FeedCommentsResponseVO;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author stephen.zhang
 * @date 2018/6/15.
 */
@Component
public class FeedCommentsService {
    @Resource
    FeedMessageMapper feedMessageMapper;

    public FeedCommentsResponseVO getFeedComments(FeedBaseVO feedBaseVO) {
        FeedMessageExample example = new FeedMessageExample();
        example.createCriteria().andFeedIdEqualTo(feedBaseVO.getFeedId());
        List<FeedMessage> feedMessages = feedMessageMapper.selectByExample(example);

        if(CollectionUtils.isEmpty(feedMessages)) {
            return null;
        } else {
            FeedCommentsResponseVO responseVO = new FeedCommentsResponseVO();
            List<CommentVO> mainCommentVO = new ArrayList<>();
            for (FeedMessage feedMessage : feedMessages) {
                if(feedMessage.getParentId() == -1) {
                    CommentVO commentVO = new CommentVO();
                    commentVO.setId(feedMessage.getId());
                    commentVO.setMessage(feedMessage.getMessage());
                    mainCommentVO.add(commentVO);
                } else {
                    for (CommentVO commentVO : mainCommentVO) {
                        if(commentVO.getId() == feedMessage.getParentId()) {
                            CommentVO subCommentVO = new CommentVO();
                            subCommentVO.setId(feedMessage.getId());
                            subCommentVO.setMessage(feedMessage.getMessage());
                            if(commentVO.getSubComment() == null) {
                                commentVO.setSubComment(new ArrayList<>());
                            }

                            commentVO.getSubComment().add(subCommentVO);
                            break;
                        }
                    }
                }
            }
            return responseVO;
        }
    }
}
