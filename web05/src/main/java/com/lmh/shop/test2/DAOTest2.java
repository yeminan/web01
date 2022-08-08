package com.lmh.shop.test2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lmhshop.dto.MemberDTO;

@Repository
public class DAOTest2 {

	@Autowired
	SqlSession sqlSession;
	
	@Test
	public void test() {
		System.out.println("login DAO 테스트");
	}

	public List<MemberDTO> sampleList(){
		return sqlSession.selectList("member.sampleList");
	}
	
	public int sampleCount(){
		return sqlSession.selectOne("sample.sampleCount");
	}
}
