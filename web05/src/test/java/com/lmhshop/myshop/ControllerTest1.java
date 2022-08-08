package com.lmhshop.myshop;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
@Controller
public class ControllerTest1 {

	private ServiceTest1 serviceTest;
	
	@Test
	public void ControllrTest1() {
		int cnt = 5;
		try {
			//cnt = controllerCall();
			System.out.println("컨트롤러 단위 테스트 처리가 성공적으로 처리되었음");
			System.out.println("회원수 : "+cnt);
			Assert.assertEquals(cnt, 5);
			Assert.assertNull(cnt);
		} catch(Exception e) {
			System.out.println("컨트롤러 단위 테스트가 실패 되었음");
			fail("Controller 단위 테스트 실패");
		}
	}

	public int controllerCall() {
		int cnt = serviceTest.serviceCall();
		System.out.println("회원수 : "+cnt);
		return cnt;
	}
}
