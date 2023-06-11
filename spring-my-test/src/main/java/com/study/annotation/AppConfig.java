package com.study.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.study")
public class AppConfig {
   //扫描ccom.dazhu.spring包下面的所有bean
}