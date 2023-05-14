package com.java501.S20230401.dao;

import java.util.List;

import com.java501.S20230401.model.Article;
import com.java501.S20230401.model.Reply;
import com.java501.S20230401.model.ReplyMember;

public interface ReplyDao {

	// 양동균
	List<Reply> replyShareList(Article article);
	int writeReply(Reply reply);
	int deleteReply(Reply reply);
	int dgUpdateReply(Reply reply);
	int dgReportReply(Reply reply); // 신고
	
	
	// 백준
	Reply 					replyCount(Reply reply);
	List<Reply> 			replyMain(Reply reply);
	int 					bjreReply(Reply reply);
	int 					bjReGood(Reply reply);
	int 					bjReBad(Reply reply);
	
	// 최승환
	int 			shReplyCount(Reply reply);
	List<Reply> 	replyList(Article article);
	int 			customerWriteReply(Reply reply);
	int 			customerDeleteReply(Reply reply);
	int 			customerUpdateReply(Reply reply);
	
	// 유현규
	public List<ReplyMember> getReplyByArticle(Article article);
	public int hgInsertReply(Reply reply);
	public List<ReplyMember> hgGetRepliesOfMember(int mem_id);
	
	// 임동빈
	int 	dbInsertReply(Reply reply);
	int 	dbDeleteReply(Reply reply);
	int 	dbUpdateReply(Reply reply);
	
	
	// 김진현
	int        replyInsert2(Article article);
	int        replyDelete2(Article article);

	
	// 김찬영
	List<Reply> 	replyAll(Reply reply);	
	int 			cywriteReply(Reply reply);
	int 			cydeleteReply(Reply reply);
	int 			updateReply(Reply reply);
	int				replyupdategood(Reply reply);
	int 			replyupdatebad(Reply reply);
	
}
