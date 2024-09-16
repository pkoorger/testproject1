package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	@Test
	public void testcase1() {
		
		String expresult = "Facebook helps you connect and share with the people in your life.";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swami koragajja\\git\\Rock\\projectJan2024\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String actual = driver.findElement(By.xpath("//h2[contains(text(), 'life')]")).getText();
		
		Assert.assertEquals(actual, expresult);
		System.out.println("passed ");
		
	}

}
