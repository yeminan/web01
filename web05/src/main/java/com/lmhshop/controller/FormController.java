package com.lmhshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmhshop.dto.FormDTO;

@Controller
public class FormController {
	@RequestMapping(value="/save")
	public String formSave(@ModelAttribute FormDTO member , BindingResult result) {
		System.out.println("이름: "+member.getName());
		System.out.println("이름: "+member.getId());
		System.out.println("이름: "+member.getPwd());
		System.out.println("이름: "+member.getEmail());
		return "redirect:/input";
	}
	
	@RequestMapping(value="/input")
	public ModelAndView formInput() {
		return new ModelAndView("testForm","formDTO",new FormDTO());	
	}
}