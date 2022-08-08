package com.lmh.shop.test2;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmhshop.dto.MemberDTO;

import lombok.extern.log4j.Log4j;

@Service
public class ServiceTest {

	@Autowired
	DAOTest2 daoTest;
	
	@Test
	public void test() {
		System.out.println("Service Test~!");
	}
	
	public List<MemberDTO> sampleList(){
		return daoTest.sampleList();
	}
	
	public int sampleCount(){
		return daoTest.sampleCount();
	}
}