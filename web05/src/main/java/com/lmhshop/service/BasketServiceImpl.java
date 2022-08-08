package com.lmhshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmhshop.dao.BasketDAO;
import com.lmhshop.dto.BasketDTO;

@Service
public class BasketServiceImpl implements BasketService{
	
	@Autowired
	BasketDAO basketDAO;

	@Override
	public List<BasketDTO> BasketList(String id) throws Exception {
		return basketDAO.BasketList(id);
	}

	
	@Override
	public BasketDTO basketRead(BasketDTO basket) throws Exception {
		return basketDAO.basketRead(basket);
	}


	@Override
	public void insertbasket(BasketDTO basket) throws Exception {
		basketDAO.insertbasket(basket);
		
	}

	@Override
	public void deletebasket(BasketDTO basket) throws Exception {
		basketDAO.deletebasket(basket);
		
	}

	@Override
	public void updatebasket(BasketDTO basket) throws Exception {
		basketDAO.updatebasket(basket);
		
	}

	@Override
	public int basketCount() throws Exception {
		return basketDAO.basketCount();
	}

}
