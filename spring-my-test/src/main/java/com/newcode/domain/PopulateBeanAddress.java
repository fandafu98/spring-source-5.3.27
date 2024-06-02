/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2024 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2024-01-31 23:40
 */
package com.newcode.domain;

import lombok.Data;

/**
 *
 *
 * @author zhengyankang
 * @version PopulateBeanAddress.java, v 0.1 2024-01-31 23:40
 */
@Data
public class PopulateBeanAddress {

	private String address;

	public PopulateBeanAddress(String address) {
		this.address = address;
	}

}
