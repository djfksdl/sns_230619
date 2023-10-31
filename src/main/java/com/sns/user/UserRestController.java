package com.sns.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sns.user.bo.UserBO;
import com.sns.user.entity.UserEntity;

@RequestMapping("/user")
@RestController
public class UserRestController {
	@Autowired
	private UserBO userBO;
	
	@RequestMapping("/is-duplicated-id")
	public Map<String, Object> isDuplicatedId(
			@RequestParam("loginId")String loginId){
		//db조회
		UserEntity user = userBO.getUserEntityByLoginId(loginId);
		
		//응답값 만들고 리턴 => JSON
		Map<String, Object> result = new 
	}
}
