/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-08-02 20:42
 */
package com.study.tx.xml;

import com.study.tx.xml.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 *
 * @author zhengyankang
 * @version TxTest.java, v 0.1 2023-08-02 20:42
 */
public class TxTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
		BookService bookService = context.getBean("bookService", BookService.class);
		bookService.checkout("zhangsan",1);

	}


}
