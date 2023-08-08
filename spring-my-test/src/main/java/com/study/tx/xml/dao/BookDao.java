/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-08-02 20:42
 */
package com.study.tx.xml.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 *
 * @author zhengyankang
 * @version BookDao.java, v 0.1 2023-08-02 20:42
 */
public class BookDao {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public void updateStock(int id){

	}


	public int getPrice(int id){
		return 1;
	}

	public void updateBalance(String username,int price){

	}

}
