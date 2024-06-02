package com.oldcode.aop;

import com.oldcode.xml.MyClassPathXmlApplicationContext;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-07-11 23:31
 */
public class AopStartApplication {

	public static void main(String[] args) {
		MyClassPathXmlApplicationContext applicationContext = new MyClassPathXmlApplicationContext("spring-aop.xml");
		MyCalculator bean = applicationContext.getBean(MyCalculator.class);
		Integer addValue = bean.add(1, 1);
		System.out.println(addValue);
	}

}
