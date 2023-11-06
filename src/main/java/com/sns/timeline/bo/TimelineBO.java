package com.sns.timeline.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.comment.bo.CommentBO;
import com.sns.post.bo.PostBO;
import com.sns.post.entity.PostEntity;
import com.sns.timeline.damain.CardView;
import com.sns.user.bo.UserBO;
import com.sns.user.entity.UserEntity;

@Service
public class TimelineBO {
	
	@Autowired
	public PostBO postBO;
	
	@Autowired
	public UserBO userBO;
	
	@Autowired
	private CommentBO commentBO;
	
	//input : X   output:List<CardView>
	public List<CardView> generateCardViewList(){
		List<CardView> cardViewList = new ArrayList<>(); // []
		
		// 글 목록을 가져온다.   List<PostEntity>
		
		// 글 목록 반복문 순회
		// postEntity => CardView  =>cardViewList에 담는다.
		for(PostEntity post : postList) { // 0 1 2
			// post 하나에 대응되는 하나의 카드를 만든다.
			CardView cardView = new CardView();

			// 글1개
			cardView.setPost(post);
			
			// 글쓴이 정보 세팅
			UserEntity user = userBO.getUserEntityById(post.getUserId());
			cardView.setUser(user);
			
			// 댓글들
			List<CommentView> commentList = commentBO.generateCommentViewList(post.getId());
			cardView.
			
			// 좋아요 카운트
			
			// 내가 좋아요 눌렀는지 여부
			
			//**** 마지막에 cardViewList에 card를 넣는다.
			cardViewList.add(cardView);
		}
		
		return cardViewList;
	}
	
}
