package com.lmhshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lmhshop.dto.MemberDTO;


@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	 SqlSession sqlSession;

	@Override
	public List<MemberDTO> memberList() throws Exception {
		return sqlSession.selectList("member.memberList");
	}

	@Override
	public MemberDTO viewMember(String id) throws Exception {
		return sqlSession.selectOne("member.viewMember", id);
	}

	
	@Override
	public MemberDTO getMember(String id) throws Exception {
		return sqlSession.selectOne("member.getMember");
	}
	
	@Override
	public int memberCount() throws Exception {
		return sqlSession.selectOne("member.memberCount");
	}

	@Override
	public void insertMember(MemberDTO mdto) throws Exception {
		sqlSession.selectOne("member.insertMember", mdto);
	}

	@Override
	public void updateMember(MemberDTO mdto) throws Exception {
		sqlSession.update("member.updateMember", mdto);
	}

	@Override
	public void deleteMember(MemberDTO mdto) throws Exception {
		sqlSession.delete("member.deleteMember", mdto);
	}

	
	@Override
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception {
		sqlSession.selectOne("member.loginCheck", mdto);
		return mdto;
	}
	@Override
	public MemberDTO signin(MemberDTO mdto) throws Exception {
		System.out.println("로그인 아이디 : "+mdto.getId());
		System.out.println("로그인 비밀번호 : "+mdto.getPwd());
		return sqlSession.selectOne("member.signin", mdto);
	}

	@Override
	public MemberDTO login(MemberDTO mdto) throws Exception {
		return sqlSession.selectOne("member.login", mdto);
	}

	@Override
	public int idCheck(String id) throws Exception {
		return sqlSession.selectOne("member.idCheck", id);
	}
}