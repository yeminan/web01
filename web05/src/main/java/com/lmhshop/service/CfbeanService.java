package com.lmhshop.service;

import java.util.List;

import com.lmhshop.dto.CfbeanDTO;

public interface CfbeanService {
	public List<CfbeanDTO> CfbeanList() throws Exception;
	public CfbeanDTO cfbeanRead(int cno) throws Exception;
	public int cfbeanCount() throws Exception;
	public CfbeanDTO getCfbean(int cno) throws Exception;
	public void addCfbean(CfbeanDTO cfbean)throws Exception;
	public void updateCfbean(CfbeanDTO cfbean)throws Exception;
	public void deleteCfbean(CfbeanDTO cfbean)throws Exception;
}
