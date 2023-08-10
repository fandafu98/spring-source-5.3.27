/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-08-08 14:33
 */
package com.study.tx.annotation.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.study.tx.annotation.dao.BookDao;
import com.study.tx.annotation.service.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author zhengyankang
 * @version TransactionConfig.java, v 0.1 2023-08-08 14:33
 */
@Configuration
@PropertySource("classpath:dbconfig.properties")
@EnableTransactionManagement
public class TransactionConfig {

	@Value("com.mysql.cj.jdbc.Driver")
	private String driverClassName;

	@Value("jdbc:mysql://121.41.78.85:13306/spring")
	private String url;

	@Value("root")
	private String username;

	@Value("root")
	private String password;

	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public BookDao bookDao() {
		return new BookDao();
	}

	@Bean
	public BookService bookService() {
		return new BookService();
	}

	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}


}
