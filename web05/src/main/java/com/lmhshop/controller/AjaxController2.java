package com.lmhshop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lmhshop.dto.UserDTO;

@Controller
@RequestMapping("/ajax/")
public class AjaxController2 {
	
	@GetMapping(value="ajaxForm6.do")
	public String ajaxForm6() {
		return "ajax/ajaxForm6";
	}
	//@RequestBody EMP emp
		//@RequestParam("sno") int sno, @RequestParam("name") String name, @RequestParam("sno") String address 개별로 받기
		@ResponseBody 
		@RequestMapping(value="ajax6.do", method=RequestMethod.POST, headers="Accept=application/json")
		public EMP ajax6(@RequestBody EMP data, HttpServletRequest request, Model model) {
			System.out.println("emp : "+(data.getSno()));
			return data;
		}
		
		@GetMapping(value="ajaxForm7.do")
		public String ajaxForm7() {
			return "ajax/ajaxForm7";
		}
		
		@ResponseBody 
		@RequestMapping(value="ajax7.do", method=RequestMethod.POST, headers="Accept=application/json")
		public UserDTO ajax7(@RequestBody UserDTO data, HttpServletRequest request, Model model) {
			System.out.println("emp : "+(data.getId()));
			if(data.getId().equals("admin")) {
//				data.setGg("관리자");
			} else {
//				data.setGg("일반사용자");
			}
			return data;
		}
	}