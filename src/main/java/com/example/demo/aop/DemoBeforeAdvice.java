package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect	
@Configuration
public class DemoBeforeAdvice  {

	@Before("execution(* com.example.demo.dao.MemberDao.getAllMember(..))") // before the method is invoked
	public void before(JoinPoint poinPoint) {
		System.out.println("Method @Before:"+ poinPoint.toString()); //-> this is advice
	}
	@After("execution(* com.example.demo.dao.MemberDao.getAllMember(..))") // after the method is invoked
	public void after(JoinPoint poinPoint) {
		System.out.println("Method @After:"+ poinPoint.toString()); 
	}
	@AfterReturning("execution(* com.example.demo.dao.MemberDao.getAllMember(..))") // after returning the method is invoked
	public void afterReturning(JoinPoint poinPoint) {
		System.out.println("Method @AfterReturning:"+ poinPoint.toString());
	}
	@AfterThrowing("execution(* com.example.demo.dao.MemberDao.getAllMember(..))") // after throwing the method is invoked
	public void afterThrowing(JoinPoint poinPoint) {
		System.out.println("Method @AfterThrowing:"+ poinPoint.toString()); 
	}

}
