package com.have.circular;

import com.have.domain.A;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-05-21 11:38
 */
public class CircularMainTest {

	// 注意：BeanDefinitionRegistry直接针对BeanDefinition
	// 而BeanFactoryPostProcessor直接针对BeanFactory

	public static void main(String[] args) {
		CircularClassPathXmlApplicationContext applicationContext
				= new CircularClassPathXmlApplicationContext("circular/circular.xml");
		A bean = applicationContext.getBean(A.class);
		System.out.println(bean.getB());
	}


}
