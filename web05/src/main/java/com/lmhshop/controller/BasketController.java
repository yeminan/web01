package com.lmhshop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lmhshop.dto.BasketDTO;
import com.lmhshop.service.BasketService;

@Controller
@RequestMapping("/basket/*")
public class BasketController {
	@Autowired
	BasketService basketService;
	@Autowired
	HttpSession Session;


//장바구니 리스트
	@RequestMapping(value="list.do" ,method=RequestMethod.GET)
	public String basketList(Model model,String id) throws Exception{
		List<BasketDTO> basket= basketService.BasketList(id);
		model.addAttribute("basket",basket);
		return "basket/basketList";
	}

// 장바구니 등록 처리
	@RequestMapping(value="insertBasket.do",method = RequestMethod.POST)
	public String insertBasket(BasketDTO basket,Model model)throws Exception{
		basketService.insertbasket(basket);
		return "redirect:/";
	}
//	장바구니 상세보기
	@RequestMapping(value="basketRead.do",method=RequestMethod.POST)
	public String basketRead(BasketDTO basket,Model model)throws Exception{
		BasketDTO basketList= basketService.basketRead(basket);
		model.addAttribute("basketList",basketList);
		return "basket/basketRead";
	}
	
//	장바구니 상품 수정
	@RequestMapping(value="updateBasket.do",method=RequestMethod.GET)
	public String updateBasket(BasketDTO basket,Model model) throws Exception{
		System.out.println(basket.getCamount());
		basketService.updatebasket(basket);
		return "redirect:list.do";
	}
//	장바구니  삭제
	@RequestMapping(value="deleteBasket.do",method = RequestMethod.GET)
	public String deleteBasket(BasketDTO basket,Model model)throws Exception{
		basketService.deletebasket(basket);
		return "redirect:/";
	}
	
}
