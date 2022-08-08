package com.lmhshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmhshop.dao.PaymentDAO;
import com.lmhshop.dto.PaymentDTO;

@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	PaymentDAO paymentDAO;

	@Override
	public List<PaymentDTO> PaymentList() throws Exception {
		return paymentDAO.PaymentList();
	}

	@Override
	public List<PaymentDTO> userPaymentList(String id) throws Exception {
		return paymentDAO.userPaymentList(id);
	}

	
	@Override
	public PaymentDTO paymentRead(int cno) throws Exception {
		return paymentDAO.paymentRead(cno);
	}

	@Override
	public int paymentCount(String id) throws Exception {
		return paymentDAO.paymentCount(id);
	}

	@Override
	public void insertPayment(PaymentDTO payment) throws Exception {
		paymentDAO.insertPayment(payment);
		
	}

	@Override
	public void insertPayment(PaymentDTO payment, int cno) throws Exception {
		paymentDAO.insertPayment(payment,cno);
		
	}

	@Override
	public void updatePayment(PaymentDTO payment) throws Exception {
		paymentDAO.updatePayment(payment);
		
	}

	@Override
	public void deletePayment(PaymentDTO payment) throws Exception {
		paymentDAO.deletePayment(payment);
		
	}
	
}
