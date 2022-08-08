package com.lmhshop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lmhshop.dto.CfbeanDTO;
import com.lmhshop.dto.MemberDTO;
import com.lmhshop.service.CfbeanService;

@Controller
@RequestMapping("/cfbean/")
public class CfbeanController {

	@Autowired
	CfbeanService cfbeanService;
	@Autowired
  	HttpSession session;

	@Autowired
	ResourceLoader rsLoader;
//	상품리스트
	@RequestMapping(value="List.do",method = RequestMethod.GET)
	public String cfbeanList(Model model) throws Exception{
		 List<CfbeanDTO> cfbeanList = cfbeanService.CfbeanList(); 
		 int cnt = cfbeanService.cfbeanCount(); 
		 model.addAttribute("cfbeanList",cfbeanList);
		 model.addAttribute("cnt",cnt);
		return "cfbean/cfbeanList";
	}
//	상품 등록 페이지 호출
	@RequestMapping(value="addCfbeanForm.do", method = RequestMethod.GET)
    public String addCfbeanForm(Model model) throws Exception {
        return "cfbean/addCfbeanForm";
    }
//	상품등록 처리
	@RequestMapping(value="addCfbean.do",method = RequestMethod.POST)
		public String addCfbean(CfbeanDTO cfbean,Model model)throws Exception{
		cfbeanService.addCfbean(cfbean);
		return "redirect:/";
	}
//	상품상세보기
	@RequestMapping(value="cfbeanRead.do")
		public String cfbeanRead(int cno,Model model)throws Exception{
		CfbeanDTO cfbean = cfbeanService.cfbeanRead(cno);
		MemberDTO member = (MemberDTO) session.getAttribute("member");
		model.addAttribute("cfbean",cfbean);
		model.addAttribute("member",member);
		return "cfbean/cfbeanRead";
	}
	
//	상품수정
	@RequestMapping(value="updateCfbean.do",method = RequestMethod.POST)
		public String updateCfbean(CfbeanDTO cfbean)throws Exception{
		cfbeanService.updateCfbean(cfbean);
		return "redirect:/";
	}
//	상품삭제
	@RequestMapping(value="deleteCfbean.do", method = RequestMethod.GET)
    public String deleteCfbean(CfbeanDTO cfbean, Model model) throws Exception {
		cfbeanService.deleteCfbean(cfbean);
		return "redirect:/";
	}
	@RequestMapping(value="getBasketCfbean.do", method = RequestMethod.GET)
    public String getBasketCfbean(int cno, int ccode, Model model) throws Exception {
		CfbeanDTO cfbean = cfbeanService.getCfbean(cno);
		model.addAttribute("cfbean", cfbean);
		model.addAttribute("cno", cno);
        return "cfbean/cfbeanRead";
    }
}