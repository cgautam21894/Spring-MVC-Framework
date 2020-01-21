package com.springboot.first;

import javax.jws.WebParam.Mode;

import org.springframework.asm.ModuleVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class demo {
	
	@Autowired
	Module mref;
	
	public void test() {
		System.out.println("Hi I am Gautam");
		mref.disp();
		
	}
	
	

}
