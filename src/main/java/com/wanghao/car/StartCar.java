package com.wanghao.car;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartCar {
	private static Logger log = Logger.getLogger(StartCar.class);

	public static void main(String[] args) throws IOException {
		log.trace("启动中。。。。。");
		new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		log.info("启动成功");
		System.in.read();
	}
}
