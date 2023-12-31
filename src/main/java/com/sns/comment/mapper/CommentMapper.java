package com.sns.comment.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sns.comment.domain.Comment;

@Repository
public interface CommentMapper {

	public void insertComment(
			@Param("postId") int postId, 
			@Param("userId") int userId, 
			@Param("content") String content);
	
	public List<Comment> selectCommentListByPostId(int postId);
	
	public void deleteCommentById(int id);
//<<<<<<< HEAD
//=======
	
	public void deleteCommentsByPostId(int postId);
//>>>>>>> parent of fe27d58 (Revert "삭제됨?")
}