package com.lmhshop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lmhshop.dto.CfbeanDTO;
import com.lmhshop.dto.MemberDTO;
import com.lmhshop.dto.PaymentDTO;
import com.lmhshop.service.CfbeanService;
import com.lmhshop.service.PaymentService;

@Controller
@RequestMapping("/payment/")
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	@Autowired
	CfbeanService cfbeanService;
	@Autowired
	HttpSession session;
	
	//관리자 구매정보 리스트 불러오기
	@RequestMapping(value="List.do",method = RequestMethod.GET)
	public String paymentList(Model model) throws Exception{
		MemberDTO user = (MemberDTO) session.getAttribute("member");
		String id= user.getId();
		List<PaymentDTO> paymentList = paymentService.userPaymentList(id);
		model.addAttribute("paymentList",paymentList);
		return "payment/paymentList";
	}
	//상세 결제 내역 보기 
		@RequestMapping(value="getPaymet.do", method = RequestMethod.GET)
	    public String PaymentList(int cno, Model model) throws Exception {
			PaymentDTO payment = paymentService.paymentRead(cno);
			model.addAttribute("payment", payment);
	        return "payment/getPayment";
	    }
	//해당 회원의 구매정보 불러오기
	@RequestMapping(value="userPaymentList.do", method = RequestMethod.POST)
	public String userPaymentList(PaymentDTO payment, HttpSession session, Model model)throws Exception{
		String id = (String) session.getAttribute("id");
		//서비스의 해당 메서드 호출하여 해당 아이디를 가진 사람의 상품결제 목록을 불러옴
		List<PaymentDTO> userPaymentList = paymentService.userPaymentList(id);
		model.addAttribute("userPaymentList", userPaymentList);
		return "payment/getPayment";
	}
	//회원구매정보 폼
	@RequestMapping(value="userPaymentListForm.do", method = RequestMethod.POST)
	public String userPaymentListForm(CfbeanDTO cfbean, Model model)throws Exception{
		model.addAttribute("cfbean",cfbean);
		return "payment/userPaymentListForm";
	}

	//상품 구매처리
	 @RequestMapping(value="insertPayment.do",method = RequestMethod.POST) 
	 public String insertPayment(PaymentDTO payment,Model model)throws Exception{
		System.out.println(payment.getAddr1());
		paymentService.insertPayment(payment);
		 return "payment/insertPaymentForm";
	 }
	//상품구매 보기
	@RequestMapping(value="paymentRead.do",method = RequestMethod.GET)
	public String paymentRead(@RequestParam("cno")int cno,Model model)throws Exception{
	PaymentDTO payment = paymentService.paymentRead(cno);
	model.addAttribute("payment",payment);
	return "payment/paymentRead";
}

	//상품상세보기에서 구입하기 했을 때의 구매 화면 로딩
	@RequestMapping(value="insertPaymentForm.do", method = RequestMethod.GET)
    public String insertPaymentForm(CfbeanDTO cfbean, Model model) throws Exception {
		int cno = cfbean.getCno();
		CfbeanDTO dto = cfbeanService.getCfbean(cno);
		model.addAttribute("cfbean",dto);
        return "payment/insertPaymentForm";
    }
	//장바구니에서 구입하기 했을 때의 구매 화면 로딩
		@RequestMapping(value="getPayment.do", method = RequestMethod.POST)
	    public String insertPaymentForm(int ccode, int cno, int camount, Model model) throws Exception {
			CfbeanDTO cfbean = cfbeanService.getCfbean(cno);
			model.addAttribute("cfbean", cfbean);
			if(cno>0) {
				model.addAttribute("cno", cno);
			}
			if(camount>0) {
				model.addAttribute("camount", camount);
			}
	        return "payment/insertPaymentForm";
	    }
	
	@RequestMapping(value="pay.do", method = RequestMethod.GET)
    public String paypop(String paytype, Model model) throws Exception {
		model.addAttribute("paytype", paytype);
        return "payment/pay";
    }	
	//구매정보수정처리
	@RequestMapping(value="updatePayment.do", method = RequestMethod.POST)
		public String updatePayment(PaymentDTO payment,Model model)throws Exception{
		paymentService.updatePayment(payment);
		return "redirect:/updatePayment";
	}
	//구매정보삭제
	@RequestMapping(value="deletePayment.do", method = RequestMethod.GET)
    public String deletePayment(@RequestParam("cno") int cno, Model model) throws Exception {
		PaymentDTO payment = new PaymentDTO();
		payment.setCno(cno);
		paymentService.deletePayment(payment);
		return "redirect:/paymentList";
	}
	//주문취소처리
		@RequestMapping(value="deleteSales.do", method = RequestMethod.GET)
		public String deleteSales(PaymentDTO sales, Model model) throws Exception {
			PaymentDTO dto = paymentService.paymentRead(sales.getCno());
			paymentService.deletePayment(dto);
			return "redirect:/";
		}
	}

