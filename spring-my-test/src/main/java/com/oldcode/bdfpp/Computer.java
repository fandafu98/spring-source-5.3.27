package com.oldcode.bdfpp;

import java.math.BigDecimal;

/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-05-31 20:36
 */
public class Computer {

	private String name;

	private BigDecimal price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Computer() {
		System.out.println("创建电脑主机对象");
	}
}
