package com.sns.comment.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.comment.mapper.CommentMapper;

@Service
public class CommentBO {

	@Autowired
	private CommentMapper commentMapper;
	
	public void addComment(int postId, int userId, String content) {
		commentMapper.insertComment(postId, userId, content);
	}
	
	// input: 글번호  output: List<CommentView>
	public List<CommentView> generateCommentViewListByPostId(int postId){
		//List<Comment> -> List<CommentView>
		List<CommentView> commentViewList = new ArrayList<>(); // []
		// 글에 해당하는 댓글들 목록 가져오기 List<Comment>
		List<Comment> commentList = commentMapper.
		// 반복문 순회
		//List<Comment> -> List<CommentView>
		
	}
	
}