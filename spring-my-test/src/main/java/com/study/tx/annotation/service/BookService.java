/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-08-02 20:42
 */
package com.study.tx.annotation.service;

import com.study.tx.annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 *
 * @author zhengyankang
 * @version BookService.java, v 0.1 2023-08-02 20:42
 */

public class BookService {

	@Autowired
	BookDao bookDao;

	@Transactional
	public void checkout(String username,int id){
		bookDao.updateStock(id);
		int price = bookDao.getPrice(id);
		bookDao.updateBalance(username,price);
	}


	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
}
