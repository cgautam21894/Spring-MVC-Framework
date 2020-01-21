package com.springboot.first;

import java.io.ObjectInputStream.GetField;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstApplication.class, args);
		demo obj = context.getBean(demo.class);
		obj.test();
	}

}
