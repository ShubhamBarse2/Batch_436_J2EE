package com.tka;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspect {

//	@Before("execution (public void rechargePaln())")
//	public void beforeMain() {
//		System.out.println("U R data PACK expiring soon ... ! ");
//
//	}
//
//	@After("execution (public void rechargePaln())")
//	public void afterMain() {
//		System.out.println("enjoy ur data pack ... ! ");
//	}

	@Around("execution (* com.tka.Recharge.*(..))")
	public void both(ProceedingJoinPoint p) {
		System.out.println("U R data PACK expiring soon ... ! ");

		try {
			p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		System.out.println("enjoy ur data pack ... ! ");

	}
//	
}
