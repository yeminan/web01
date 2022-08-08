package com.lmhshop.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

/* AOP 테스트 케이스 */

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class SampleServiceTest {
	
	@Setter(onMethod_ = @Autowired)
	private SampleService service;
	
	@Test
	public void testAOP() throws Exception {
		System.out.println(service);
		System.out.println(service.getClass().getName());
		System.out.println(service.doAdd("123","456"));
	}
}

