/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-09-11 19:48
 */
package com.msb.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * @author zhengyankang
 * @version InitBinderController.java, v 0.1 2023-09-11 19:48
 */
@Controller
@RequestMapping("/init-binder")
public class InitBinderController {


	@RequestMapping("/param")
	public String getFormatDate(Date date, Map<String, Object> map) {
		System.out.println(date);
		map.put("name", "zhangsan");
		map.put("age", 13);
		map.put("date", date);
		return "map";
	}
}
