package com.lmhshop.service;

import java.util.List;

import com.lmhshop.dto.DatabankDTO;

public interface DatabankService {

		public List<DatabankDTO> Databanklist() throws Exception;
		public void Databankinsert(DatabankDTO databank) throws Exception;
}

