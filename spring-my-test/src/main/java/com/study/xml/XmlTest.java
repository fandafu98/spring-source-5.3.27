package com.study.xml;

import com.study.myEditor.Customer;
import com.study.mytag.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-05-21 11:38
 */
public class XmlTest {

	/*public static void main(String[] args) {
		MyClassPathXmlApplicationContext applicationContext = new MyClassPathXmlApplicationContext("spring-config.xml");
		Person bean = applicationContext.getBean(Person.class);
		User user = (User) applicationContext.getBean("msb");
		System.out.println(user.getUsername());
		System.out.println(bean);
		Customer customerBean = applicationContext.getBean(Customer.class);
		System.out.println(customerBean.getAddress());

	}*/


	public static void main(String[] args) {
		MyClassPathXmlApplicationContext applicationContext = new MyClassPathXmlApplicationContext("load-bean-definitions.xml");
	}


}
