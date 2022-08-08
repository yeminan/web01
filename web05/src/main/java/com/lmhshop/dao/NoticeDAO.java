package com.lmhshop.dao;

import java.util.List;

import com.lmhshop.dto.NoticeDTO;
import com.lmhshop.util.PageMaker;

public interface NoticeDAO {
	public List<NoticeDTO> noticeList() throws Exception;
	public List<NoticeDTO> noticePageList(PageMaker page) throws Exception;
	public NoticeDTO noticeRead(int seq) throws Exception;
	public int noticeCount() throws Exception;
	public void addNotice(NoticeDTO notice) throws Exception; 
	public void deleteNotice(NoticeDTO notice) throws Exception;
	public void updateNotice(NoticeDTO notice) throws Exception;
}
