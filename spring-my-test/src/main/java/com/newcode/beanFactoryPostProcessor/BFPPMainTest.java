package com.newcode.beanFactoryPostProcessor;

import com.oldcode.xml.Person;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-05-21 11:38
 */
public class BFPPMainTest {

	// 注意：BeanDefinitionRegistry直接针对BeanDefinition
	// 而BeanFactoryPostProcessor直接针对BeanFactory

	public static void main(String[] args) {
		BFPPClassPathXmlApplicationContext applicationContext = new BFPPClassPathXmlApplicationContext("bean-factory-post-processor/bean-factory-post-processor.xml");
		Person person1 = applicationContext.getBean(Person.class);
		Person person2 = applicationContext.getBean(Person.class);
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());

	}


}
