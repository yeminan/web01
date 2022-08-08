package com.lmhshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmhshop.dao.CfbeanDAO;
import com.lmhshop.dto.CfbeanDTO;

@Service
public class CfbeanServiceImpl implements CfbeanService{
@Autowired
CfbeanDAO cfbeanDAO;

@Override
public List<CfbeanDTO> CfbeanList() throws Exception {
	return cfbeanDAO.CfbeanList();
}

@Override
public CfbeanDTO getCfbean(int cno) throws Exception {
	return cfbeanDAO.getCfbean(cno);
}

@Override
public CfbeanDTO cfbeanRead(int cno) throws Exception {
	return cfbeanDAO.cfbeanRead(cno);
}

@Override
public int cfbeanCount() throws Exception {
	return cfbeanDAO.cfbeanCount();
}

@Override
public void addCfbean(CfbeanDTO cfbean) throws Exception {
	cfbeanDAO.addCfbean(cfbean);
	
}

@Override
public void updateCfbean(CfbeanDTO cfbean) throws Exception {
	cfbeanDAO.updateCfbean(cfbean);
	
}

@Override
public void deleteCfbean(CfbeanDTO cfbean) throws Exception {
	cfbeanDAO.deleteCfbean(cfbean);
	
}

}
