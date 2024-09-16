package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakescreenshotFailure2 {
	TakescreenshotFailure1 t1 = new TakescreenshotFailure1();
	
	@Test
	public void doLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swami koragajja\\git\\Rock\\projectJan2024\\Driver\\chromedriver.exe");
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.get("https://www.facebook.com/");
		
		t1.driver.findElement(By.id("emaisl")).sendKeys("abc");
		
		
	}
	
	@AfterMethod
	public void takescreenshot(ITestResult result2) throws Exception {
		t1.captureScreenshot(result2);
	}
	

}
