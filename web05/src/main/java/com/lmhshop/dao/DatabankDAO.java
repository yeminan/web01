package com.lmhshop.dao;

import java.util.List;

import com.lmhshop.dto.DatabankDTO;

public interface DatabankDAO {
		public List<DatabankDTO> Databanklist() throws Exception;
		public void Databankinsert(DatabankDTO databank) throws Exception;
}
