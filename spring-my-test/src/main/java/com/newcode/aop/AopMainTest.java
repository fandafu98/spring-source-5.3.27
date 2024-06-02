package com.newcode.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-07-11 23:31
 */
public class AopMainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop/aop.xml");
		MyCalculator bean = applicationContext.getBean(MyCalculator.class);
		Integer addValue = bean.add(1, 1);
		System.out.println(addValue);
	}

}
