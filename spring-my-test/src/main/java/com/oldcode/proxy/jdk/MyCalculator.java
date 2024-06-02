/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-07-24 19:57
 */
package com.oldcode.proxy.jdk;

/**
 *
 *
 * @author zhengyankang
 * @version MyCalculator.java, v 0.1 2023-07-24 19:57
 */
public class MyCalculator implements Calculator{

	@Override
	public int add(int i, int j) {
		int result = i+j;
		return result;
	}

	@Override
	public int sub(int i, int j) {
		int result = i-j;
		return result;
	}

	@Override
	public int mult(int i, int j) {
		int result = i*j;
		return result;
	}

	@Override
	public int div(int i, int j) {
		int result = i/j;
		return result;
	}
}
