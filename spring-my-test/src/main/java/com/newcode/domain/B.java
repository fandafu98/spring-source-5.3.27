/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2024 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2024-02-01 14:24
 */
package com.newcode.domain;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 *
 * @author zhengyankang
 * @version B.java, v 0.1 2024-02-01 14:24
 */

public class B {

	@Autowired
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
}
