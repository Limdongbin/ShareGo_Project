package com.java501.S20230401.service;

import java.util.List;

import com.java501.S20230401.model.Article;
import com.java501.S20230401.model.Reply;

public interface ReplyService {

	List<Reply> replyList(Article article);
	int writeReply(Reply reply);

}
