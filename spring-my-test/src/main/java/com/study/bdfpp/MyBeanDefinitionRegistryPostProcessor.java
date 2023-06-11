package com.study.bdfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-05-31 20:35
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Computer.class);
		beanDefinitionBuilder.addPropertyValue("name", "Steam Deck");
		registry.registerBeanDefinition("computer", beanDefinitionBuilder.getBeanDefinition());

		// registry.registerBeanDefinition("msb",new RootBeanDefinition(Computer.class));
	}
}
