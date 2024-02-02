/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2024 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2024-02-01 14:24
 */
package com.have.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

/**
 *
 *
 * @author zhengyankang
 * @version B.java, v 0.1 2024-02-01 14:24
 */
@Data
public class B {

	@Autowired
	private A a;

}
