package com.grable.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MainApp {
	static Logger log=LoggerFactory.getLogger(MainApp.class);
	public static void main(String[] args) {
		log.info("启动成功=======");
		SpringApplication.run(MainApp.class, args);
		

	}

}
