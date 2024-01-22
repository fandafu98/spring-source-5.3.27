package com.have.createBean;

import com.study.xml.MyBeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * zhuyanyoushu.com
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
		System.out.println("扩展initPropertySources...");
		// getEnvironment().setRequiredProperties("跑车浪漫旅");
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		BeanDefinition person = beanFactory.getBeanDefinition("person");
		// person.setScope("prototype");
		System.out.println("My postProcessBeanFactory");
	}

}
