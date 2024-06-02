/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-07-24 20:00
 */
package com.oldcode.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhengyankang
 * @version CalculatorProxy.java, v 0.1 2023-07-24 20:00
 */
public class CalculatorProxy {

	public static Calculator getProxy(final Calculator calculator) {
		ClassLoader loader = calculator.getClass().getClassLoader();
		Class<?>[] interfaces = calculator.getClass().getInterfaces();
		InvocationHandler invocationHandler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				Object result = null;
				try {
					result = method.invoke(calculator, args);
				} catch (Exception e) {

				} finally {

				}
				return result;
			}
		};

		Object proxy = Proxy.newProxyInstance(loader, interfaces, invocationHandler);
		return (Calculator) proxy;
	}

}
