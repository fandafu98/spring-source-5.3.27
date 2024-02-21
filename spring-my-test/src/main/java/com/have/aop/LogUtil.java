package com.have.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

import java.util.Arrays;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-07-09 15:56
 */
public class LogUtil {

	public void myPointCut() {
	}


	public void before(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		Object[] args = joinPoint.getArgs();
		System.out.println("aop切面LogUtil的before方法：" + signature.getName() + Arrays.asList(args));

	}


	public void afterReturning(JoinPoint joinPoint, Object result) {
		Signature signature = joinPoint.getSignature();
		System.out.println("aop切面LogUtil的afterReturning方法：" + signature.getName() + result);

	}

	private void afterThrowing(JoinPoint joinPoint, Exception e) {
		Signature signature = joinPoint.getSignature();
		System.out.println("aop切面LogUtil的afterThrowing方法：" + signature.getName() + e.getMessage());

	}


	public void after(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		System.out.println("aop切面LogUtil的after方法：" + signature.getName());
	}


	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Signature signature = proceedingJoinPoint.getSignature();
		Object[] args = proceedingJoinPoint.getArgs();
		Object result = null;
		try {
			System.out.println("aop切面LogUtil的around方法：" + signature.getName() + Arrays.asList(args));
			result = proceedingJoinPoint.proceed(args);
		} catch (Throwable e) {
			System.out.println("aop切面LogUtil的around异常方法：" + signature.getName() + e.getMessage());
			throw e;
		}
		System.out.println("aop切面LogUtil的around返回结果：" + result);
		return result;
	}


}
