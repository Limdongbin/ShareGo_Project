package com.java501.S20230401.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java501.S20230401.dao.ReplyDao;
import com.java501.S20230401.model.Article;
import com.java501.S20230401.model.Reply;

import kotlin.jvm.internal.SerializedIr;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {
	private final ReplyDao replyDao;
	@Override
	public List<Reply> replyList(Article article) {
		return replyDao.replyList(article);
	}
	@Override
	public int writeReply(Reply reply) {
		return replyDao.writeReply(reply);
	}

}
