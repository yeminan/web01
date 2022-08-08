package com.lmhshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lmhshop.dto.BasketDTO;
import com.lmhshop.dto.CfbeanDTO;
import com.lmhshop.dto.PaymentDTO;

@Repository
public class PaymentDAOImpl implements PaymentDAO{
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<PaymentDTO> PaymentList() throws Exception {
		return sqlSession.selectList("payment.paymentList");
	}


	@Override
	public List<PaymentDTO> userPaymentList(String id) throws Exception {
		return sqlSession.selectList("payment.userPaymentList",id);
	}

	@Transactional
	@Override
	public void insertPayment(PaymentDTO payment, int cno) throws Exception {
		CfbeanDTO cfbeans =new CfbeanDTO();
		cfbeans.setCno(payment.getCno());
		cfbeans.setCamount(payment.getAmount());
		BasketDTO basket = new BasketDTO();
		basket.setCno(cno);
		sqlSession.update("payment.paymentCfbeansUpdate",cfbeans);
		sqlSession.delete("payment.paymentBasketUpdate",basket);
		sqlSession.insert("payment.userinsertPayment",payment);
	}

	@Transactional
	@Override
	public void insertPayment(PaymentDTO payment) throws Exception {
		CfbeanDTO cfbeans =new CfbeanDTO();
		cfbeans.setCno(payment.getCno());
		cfbeans.setCamount(payment.getAmount());
		sqlSession.update("payment.insertPayment",payment);
		sqlSession.insert("payment.paymentCfbeanUpdate",cfbeans);
	}

	@Override
	public PaymentDTO paymentRead(int cno) throws Exception {
		return sqlSession.selectOne("payment.paymentRead",cno);
	}

	@Override
	public int paymentCount(String id) throws Exception {
		return sqlSession.selectOne("payment.paymentCount",id);
	}
	@Override
	public void updatePayment(PaymentDTO payment) throws Exception {
		sqlSession.update("payment.updatePayment",payment);
		
	}
	@Transactional
	@Override
	public void deletePayment(PaymentDTO payment) throws Exception {
		CfbeanDTO cfbeans = new CfbeanDTO();
		cfbeans.setCno(payment.getCno());
		cfbeans.setCamount(payment.getAmount());
		sqlSession.update("payment.returnCfbeanUpdate",cfbeans);
		sqlSession.delete("payment.deletePayment",payment);
		
	}
	
}
