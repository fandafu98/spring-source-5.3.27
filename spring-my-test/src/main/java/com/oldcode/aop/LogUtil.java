package com.oldcode.aop;

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


	public void start(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		Object[] args = joinPoint.getArgs();
		System.out.println("aop切面LogUtil的start方法："+signature.getName() + Arrays.asList(args));

	}


	public void stop(JoinPoint joinPoint, Object result) {
		Signature signature = joinPoint.getSignature();
		System.out.println("aop切面LogUtil的stop方法："+signature.getName() + result);

	}

	private void logException(JoinPoint joinPoint, Exception e) {
		Signature signature = joinPoint.getSignature();
		System.out.println("aop切面LogUtil的logException方法："+signature.getName() + e.getMessage());

	}


	public void logFinally(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		System.out.println("aop切面LogUtil的logFinally方法："+signature.getName());
	}


	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Signature signature = proceedingJoinPoint.getSignature();
		Object[] args = proceedingJoinPoint.getArgs();
		Object result = null;
		try {
			System.out.println("aop切面LogUtil的around方法："+signature.getName() + Arrays.asList(args));
			result = proceedingJoinPoint.proceed(args);
		} catch (Throwable e) {
			System.out.println("aop切面LogUtil的around异常方法："+signature.getName() + e.getMessage());
			throw e;
		}
		return result;
	}


}
