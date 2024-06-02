package com.oldcode.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class StudySpringApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService helloService = ac.getBean(HelloService.class);
		helloService.hello();
	}

}