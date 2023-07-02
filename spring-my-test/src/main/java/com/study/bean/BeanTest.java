package com.study.bean;

import com.study.myEditor.Customer;
import com.study.mytag.User;
import com.study.xml.MyClassPathXmlApplicationContext;
import com.study.xml.Person;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-05-21 11:38
 */
public class BeanTest {

	public static void main(String[] args) {
		MyClassPathXmlApplicationContext applicationContext = new MyClassPathXmlApplicationContext("spring-person.xml");
	}


}
