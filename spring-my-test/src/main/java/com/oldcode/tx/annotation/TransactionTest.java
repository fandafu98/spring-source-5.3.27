/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-08-08 14:34
 */
package com.oldcode.tx.annotation;

import com.oldcode.tx.annotation.config.TransactionConfig;
import com.oldcode.tx.annotation.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 *
 * @author zhengyankang
 * @version TransactionTest.java, v 0.1 2023-08-08 14:34
 */
public class TransactionTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(TransactionConfig.class);
		applicationContext.refresh();
		BookService bookService = applicationContext.getBean(BookService.class);
		bookService.checkout("zhangsan",1);

	}

}
