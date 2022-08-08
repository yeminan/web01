package com.lmhshop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

/*AOP 관점지향형
	 * POJO전통적인 자바객체
	 * view에서 매번 parseInt를하지 않고 순수 자바객체를 controller전에 처리하여 
	 * 프로그램에 이상이 없도록 자바객체를 처리할수있도록 해보자
	 * */
@Aspect
@Log4j
@Component
public class LogAdvice {
	@Before("execution(* com.lmhshop.service.SampleService*.*(..))")

	public void logBefore() {
		log.info("==========");
	}
	
}
