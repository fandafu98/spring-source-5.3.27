package com.newcode.circular;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-05-21 13:46
 */
public class CircularClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public CircularClassPathXmlApplicationContext(String configPath) {
		super(configPath);
	}

}
