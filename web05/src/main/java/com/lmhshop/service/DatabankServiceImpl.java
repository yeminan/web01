package com.lmhshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmhshop.dao.DatabankDAO;
import com.lmhshop.dto.DatabankDTO;

@Service
public class DatabankServiceImpl implements DatabankService{
	 @Autowired
	 DatabankDAO DatabankDAO;

			@Override
			public List<DatabankDTO> Databanklist() throws Exception {
				return DatabankDAO.Databanklist();
			}
			
			@Override
			public void Databankinsert(DatabankDTO databank) throws Exception {
				DatabankDAO.Databankinsert(databank);
			}
 
}
