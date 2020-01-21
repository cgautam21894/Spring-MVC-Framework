package com.springboot.first;

import java.io.ObjectInputStream.GetField;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		demo objDemo = (demo) context.getBean("demo");
		objDemo.a = 15;
		objDemo.test();
		System.out.println("a: " + objDemo.a);

		demo objDemo1 = (demo) context.getBean("demo");
		objDemo1.test();
		System.out.println("a: " + objDemo1.a);
	}

}
