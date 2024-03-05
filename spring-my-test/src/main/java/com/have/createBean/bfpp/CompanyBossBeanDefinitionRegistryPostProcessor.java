/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2024 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2024-03-05 22:19
 */
package com.have.createBean.bfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 *
 *
 * @author zhengyankang
 * @version CompanyBossBeanDefinitionRegistryPostProcessor.java, v 0.1 2024-03-05 22:19
 */
public class CompanyBossBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("进入了CompanyBoss的BeanDefinitionRegistryPostProcessor的postProcessBeanFactory方法");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("进入了CompanyBoss的BeanDefinitionRegistryPostProcessor的postProcessBeanDefinitionRegistry方法");
	}


}
