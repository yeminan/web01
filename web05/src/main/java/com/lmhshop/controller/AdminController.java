package com.lmhshop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lmhshop.service.MemberService;

@Controller
@RequestMapping("/admin/")
public class AdminController {
	
	@Autowired
	MemberService memberService;
		
	@Autowired
	BCryptPasswordEncoder passEncoder;
	
	@Autowired
	HttpSession session;
	
	//관리자 페이지
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String AdminRoot() {
        return "admin/admin";
    }
	
    //관리자 페이지
    @RequestMapping(value="admin.do", method = RequestMethod.GET)
    public String Admin() {
        return "admin/admin";
    }
    
    //상품 목록
    @RequestMapping(value="goodsList.do", method = RequestMethod.GET)
    public String goodsList() {
        return "admin/goodsList";
    }
        
    //카테고리 등록 폼
    @RequestMapping(value="cateForm.do", method = RequestMethod.GET)
    public String cateForm() {
        return "admin/cateForm";
    }
    
    //카테고리 등록 처리
    @RequestMapping(value="addCate.do", method = RequestMethod.POST)
    public String addCate() {
    	return "redirect:/";
    }
    
    //상품 등록 폼
    @RequestMapping(value="goodsForm.do", method = RequestMethod.GET)
    public String goodsForm() {
        return "admin/goodsForm";
    }
    
    //상품 등록 처리
    @RequestMapping(value="addGoods.do", method = RequestMethod.POST)
    public String addGoods() {
    	return "redirect:/";
    }

    //관리자 상품 정보 보기 및 수정 폼
    @RequestMapping(value="getGoods.do", method = RequestMethod.GET)
    public String getGoods() {
        return "admin/getGoods";
    }
    
    //상품 정보 수정 처리
    @RequestMapping(value="updateGoods.do", method = RequestMethod.POST)
    public String updateGoods() {
    	return "redirect:/";
    }
    
    //상품 삭제
    @RequestMapping(value="deleteGoods.do", method = RequestMethod.POST)
    public String deleteGoods() {
        return "redirect:/";
    }
    
    //회원 목록
    
    //관리자 직권 회원 등록
    
    //관리자 직원 회원 수정
    
    //관리자 직권 회원 탈퇴
    
    //공지사항 목록

    //공지사항 등록 폼 로딩
    @RequestMapping(value="adminNoticeForm.do", method = RequestMethod.GET)
    public String adminNoticeForm() {
    	return "notice/adminNoticeForm";
    }
    
    //공지사항 등록
    
    
    //공지사항 수정
    
    //공지사항 삭제
    
    //답변 등록
    
    //답변 수정
    
    //답변 삭제
    
    //판매 목록
    
    //배송지 관리
    
    //배송지 배정
    
}