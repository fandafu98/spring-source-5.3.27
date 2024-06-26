package com.newcode.createBean;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * zhuyanyoushu.co
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-05-21 13:46
 */
public class CreateBeanClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public CreateBeanClassPathXmlApplicationContext(String configPath) {
		super(configPath);
	}

	@Override
	protected void initPropertySources() {
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
	}

}
