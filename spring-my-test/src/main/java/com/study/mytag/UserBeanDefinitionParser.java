package com.study.mytag;

import javafx.util.Pair;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-05-26 22:21
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	// 返回属性值所对应的对象
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		// 获取标签具体的属性值
		String username = element.getAttribute("username");
		String email = element.getAttribute("email");
		String password = element.getAttribute("password");

		if (StringUtils.hasText(username)){
			builder.addPropertyValue("username",username);
		}
		if (StringUtils.hasText(email)) {
			builder.addPropertyValue("email",email);
		}
		if (StringUtils.hasText(password)) {
			builder.addPropertyValue("password",password);
		}

	}
}
