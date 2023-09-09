/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-09-08 20:24
 */
package com.msb.mvc.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 *
 * @author zhengyankang
 * @version Controller.java, v 0.1 2023-09-08 20:24
 */
@RequestMapping("/file")
@Controller
public class FileController {


	@PostMapping("/upload")
	public String uploadFile(MultipartFile multipartFile){
		String name = multipartFile.getName();
		return name;
	}



}
