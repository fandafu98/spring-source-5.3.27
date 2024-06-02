/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-07-24 23:44
 */
package com.oldcode.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *
 *
 * @author zhengyankang
 * @version MyCglib.java, v 0.1 2023-07-24 23:44
 */
public class MyCglib implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		Object o1 = methodProxy.invokeSuper(o, objects);
		return o1;
	}

}
