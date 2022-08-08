package com.lmhshop.dao;

import java.util.List;

import com.lmhshop.dto.BasketDTO;

public interface BasketDAO {
	
	public List<BasketDTO> BasketList(String id) throws Exception;
	public void insertbasket(BasketDTO basket)throws Exception;
	public void deletebasket(BasketDTO basket)throws Exception;
	public void updatebasket(BasketDTO basket)throws Exception;
	public int basketCount()throws Exception;
	public BasketDTO basketRead(BasketDTO basket) throws Exception;
	
}
