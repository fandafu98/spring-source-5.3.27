/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-07-24 20:07
 */
package com.study.proxy.jdk;

/**
 *
 *
 * @author zhengyankang
 * @version Test.java, v 0.1 2023-07-24 20:07
 */
public class Test {
	public static void main(String[] args) {
		System.getProperties().put("sum.misc.ProxyGenerator.saveGeneratoredFiles","true");
		Calculator proxy = CalculatorProxy.getProxy(new MyCalculator());
		proxy.add(1,1);
		System.out.println(proxy.getClass());
	}

}
