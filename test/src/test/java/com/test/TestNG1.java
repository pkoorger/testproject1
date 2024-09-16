package com.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void a2() {
		System.out.println("Hello a2 method");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("Hello b method");
	}
	

}
