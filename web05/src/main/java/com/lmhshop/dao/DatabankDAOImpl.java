package com.lmhshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lmhshop.dto.DatabankDTO;

@Repository
public class DatabankDAOImpl implements DatabankDAO{
	@Autowired
	SqlSession sqlsession;

	@Override
	public List<DatabankDTO> Databanklist() throws Exception {
		return sqlsession.selectList("databank.Databanklist");
	}

	@Override
	public void Databankinsert(DatabankDTO databank) throws Exception {
		sqlsession.insert("databank.Databankinsert",databank);
		
	}
	
	
}
