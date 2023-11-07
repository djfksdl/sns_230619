package com.sns.like;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LikeRestComtroller {
	//GET: /like?postId=13 @RequestParam("postId")
	//GET: /like/13        @PathVariable
	@RequestMapping("/like/{postId}")
	public Map<String, Object> likeToggle(
			@PathVariable int postId){
		//로그인 여부 확인
		
		// BO 호출 -> like 여부 체크
		likeBO.likeToggle(파라미터들);
		// 응답값
		
	}
}