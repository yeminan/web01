package com.lmhshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.lmhshop.dto.CfbeanDTO;

@Repository
public class CfbeanDAOImpl implements CfbeanDAO{
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<CfbeanDTO> CfbeanList() throws Exception {
		return sqlSession.selectList("cfbean.cfbeanList");
	}

	@Override
	public CfbeanDTO getCfbean(int cno) throws Exception {
		return sqlSession.selectOne("cfbean.getCfbean",cno);
	}

	@Override
	public CfbeanDTO cfbeanRead(int cno) throws Exception {
		return sqlSession.selectOne("cfbean.cfbeanRead",cno);
	}

	@Override
	public int cfbeanCount() throws Exception {
		return sqlSession.selectOne("cfbean.cfbeanCount");
	}

	@Override
	public void addCfbean(CfbeanDTO cfbean) throws Exception {
		sqlSession.insert("cfbean.addCfbean",cfbean);
		
	}

	@Override
	public void updateCfbean(CfbeanDTO cfbean) throws Exception {
		sqlSession.update("cfbean.updateCfbean",cfbean);
		
	}

	@Override
	public void deleteCfbean(CfbeanDTO cfbean) throws Exception {
		sqlSession.delete("cfbean.deleteCfbean",cfbean);
		
	}

}