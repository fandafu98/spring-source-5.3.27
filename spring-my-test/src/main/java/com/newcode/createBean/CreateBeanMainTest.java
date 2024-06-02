package com.newcode.createBean;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-05-21 11:38
 */
public class CreateBeanMainTest {

	// 注意：BeanDefinitionRegistry直接针对BeanDefinition
	// 而BeanFactoryPostProcessor直接针对BeanFactory

	public static void main(String[] args) {
		CreateBeanClassPathXmlApplicationContext applicationContext = new CreateBeanClassPathXmlApplicationContext("create-bean/create-bean.xml");
	}


}
