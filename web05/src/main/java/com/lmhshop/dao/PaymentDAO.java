package com.lmhshop.dao;

import java.util.List;


import com.lmhshop.dto.PaymentDTO;

public interface PaymentDAO {
	public List<PaymentDTO> PaymentList()throws Exception;
	public List<PaymentDTO> userPaymentList(String id)throws Exception;
	public void insertPayment(PaymentDTO payment)throws Exception;
	public void insertPayment(PaymentDTO payment,int cno)throws Exception;
	public int paymentCount(String id) throws Exception;
	public void updatePayment(PaymentDTO payment)throws Exception;
	public void deletePayment(PaymentDTO payment)throws Exception;
	public PaymentDTO paymentRead(int cno) throws Exception;
}
