/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-08-02 20:42
 */
package com.study.tx.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 *
 * @author zhengyankang
 * @version BookDao.java, v 0.1 2023-08-02 20:42
 */
public class BookDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Transactional
	public void updateStock(int id){
		String sql = "update book_stock set stock=stock-1 where id = ?";
		jdbcTemplate.update(sql,id);
	}

	@Transactional
	public int getPrice(int id){
		String sql = "select price from book where id = ?";
		return jdbcTemplate.queryForObject(sql,Integer.class,id);
	}

	@Transactional
	public void updateBalance(String username,int price){
		String sql = "update account set balance=balance- ? where username = ?";
		jdbcTemplate.update(sql,price,username);
	}

}
