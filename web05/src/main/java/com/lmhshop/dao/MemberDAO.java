package com.lmhshop.dao;

import java.util.List;
import com.lmhshop.dto.MemberDTO;

public interface MemberDAO {
	public List<MemberDTO> memberList() throws Exception;
	public MemberDTO viewMember(String id) throws Exception;
	public MemberDTO getMember(String id) throws Exception;
	public int memberCount() throws Exception;
	public void insertMember(MemberDTO mdto) throws Exception;
	public void updateMember(MemberDTO mdto) throws Exception;
	public void deleteMember(MemberDTO mdto) throws Exception;
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception;
	public MemberDTO signin(MemberDTO mdto) throws Exception;
	public MemberDTO login(MemberDTO mdto) throws Exception;
	public int idCheck(String id) throws Exception;
}