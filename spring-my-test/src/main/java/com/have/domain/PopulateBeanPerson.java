/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2024 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2024-01-31 23:36
 */
package com.have.domain;

import lombok.Data;

import java.util.Map;

/**
 *
 *
 * @author zhengyankang
 * @version Person.java, v 0.1 2024-01-31 23:36
 */
@Data
public class PopulateBeanPerson {

	private int id;
	private String name = "dahuang";
	private Integer age;
	private String gender;
	private PopulateBeanAddress address;
	private String[] hobbies;
	private Map<String,Object> maps;

	public PopulateBeanPerson(int id, String name, Integer age, String gender, PopulateBeanAddress address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
}
