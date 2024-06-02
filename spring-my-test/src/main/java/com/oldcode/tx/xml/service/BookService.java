/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-08-02 20:42
 */
package com.oldcode.tx.xml.service;

import com.oldcode.tx.xml.dao.BookDao;

/**
 *
 *
 * @author zhengyankang
 * @version BookService.java, v 0.1 2023-08-02 20:42
 */

public class BookService {

	BookDao bookDao;

	public void checkout(String username,int id){
		bookDao.updateStock(id);
		int price = bookDao.getPrice(id);
		bookDao.updateBalance(username,price);
	}

	public void updateStock(int id){
		bookDao.updateStock(id);
	}


	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
}
