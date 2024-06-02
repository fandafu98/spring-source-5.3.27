package com.oldcode.annotation;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public void hello(){
		System.out.println("================Spring HelloService 启动=======================");
	}
}