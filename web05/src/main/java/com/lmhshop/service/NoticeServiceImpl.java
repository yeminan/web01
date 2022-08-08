package com.lmhshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmhshop.dao.NoticeDAO;
import com.lmhshop.dto.NoticeDTO;
import com.lmhshop.util.PageMaker;

@Service
public class NoticeServiceImpl implements NoticeService{
 @Autowired
 NoticeDAO noticeDAO;

@Override
public List<NoticeDTO> noticeList() throws Exception {
	return noticeDAO.noticeList();
}

@Override
public List<NoticeDTO> noticePageList(PageMaker page) throws Exception {
	return noticeDAO.noticePageList(page);
}

@Override
public NoticeDTO noticeRead(int seq) throws Exception {
	return noticeDAO.noticeRead(seq);
}

@Override
public int noticeCount() throws Exception {
	return noticeDAO.noticeCount();
	
}

@Override
public void addNotice(NoticeDTO notice) throws Exception {
	noticeDAO.addNotice(notice);
	
}

@Override
public void deleteNotice(NoticeDTO notice) throws Exception {
	noticeDAO.deleteNotice(notice);
	
}

@Override
public void updateNotice(NoticeDTO notice) throws Exception {
	noticeDAO.updateNotice(notice);
	
}
 
}
