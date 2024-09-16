package com.test;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test(enabled = false)
	public void a() {
		System.out.println("a test method");
	}
	
	@Test(enabled = true)
	public void b() {
		System.out.println("b test method");
	}
	
	@Test(invocationCount = 2, priority = -1)
	public void c() {
		System.out.println("c test method");
	}
	
	@Test(priority = 2)
	public void d() {
		System.out.println("d test method");
		throw new SkipException("d test method skipped");
	}



}
