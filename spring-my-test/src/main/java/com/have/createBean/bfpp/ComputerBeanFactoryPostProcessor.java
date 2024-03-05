/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2024 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2024-03-05 22:17
 */
package com.have.createBean.bfpp;

import com.have.createBean.domain.Computer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 *
 *
 * @author zhengyankang
 * @version ComputerBeanFactoryPostProcessor.java, v 0.1 2024-03-05 22:17
 */
public class ComputerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition computerBeanDefinition = beanFactory.getBeanDefinition("computer");
		computerBeanDefinition.setScope("singleton");
		// 此时肯定为false
		boolean isContains = beanFactory.containsBean("computer");
		System.out.println("在BFPP中是否包含computer的bean："+isContains);

		// 这时候去getBean，肯定会在统一的实例化方法之前生成对象的，
		Computer bean = beanFactory.getBean(Computer.class);
		if (null==bean){
			System.out.println("在BeanFactoryPostProcessor中获取bean,拿到的是个null值");
		}

	}

}
