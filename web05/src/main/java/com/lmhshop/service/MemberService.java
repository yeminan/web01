package com.lmhshop.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lmhshop.dto.MemberDTO;

public interface MemberService {	
		public List<MemberDTO> memberList() throws Exception;
		public int memberCount() throws Exception;
		public MemberDTO viewMember(String id) throws Exception;
		public MemberDTO getMember(String id) throws Exception;
		public void insertMember(MemberDTO mdto) throws Exception;
		public void updateMember(MemberDTO mdto) throws Exception;
		public void deleteMember(MemberDTO mdto) throws Exception;
		public MemberDTO loginCheck(MemberDTO mdto) throws Exception;
		public MemberDTO signin(MemberDTO mdto) throws Exception;
		public boolean login(HttpServletRequest request) throws Exception;
		public int idCheck(String id) throws Exception;
		public boolean loginMemberTest(MemberDTO member) throws Exception;
	}
