/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-07-24 23:44
 */
package com.oldcode.proxy.cglib;

/**
 *
 *
 * @author zhengyankang
 * @version MyCalculator.java, v 0.1 2023-07-24 23:44
 */
public class MyCalculator {

	public int add(int i, int j) {
		int result = i+j;
		return result;
	}

	public int sub(int i, int j) {
		int result = i-j;
		return result;
	}

	public int mult(int i, int j) {
		int result = i*j;
		return result;
	}

	public int div(int i, int j) {
		int result = i/j;
		return result;
	}

}
