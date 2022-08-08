package com.lmh.shop.test2;

import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lmhshop.dto.MemberDTO;
import com.lmhshop.service.MemberService;

@Controller
public class LoginControllerTest {
	@Autowired
	HttpSession session;
	
	@Autowired
	MemberService memberService;

	@Test
	public void test() throws Exception {  //로그인 테스트
		System.out.println("Controller Test~!");
		MemberDTO member = new MemberDTO();
		member.setId("admin");
		member.setPwd("1234");
		System.out.println("Controller id : "+member.getId());
		System.out.println("Controller pwd : "+member.getPwd());
		if (member.getId().equals("admin") && member.getPwd().equals("1234")){
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
	}
