package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGRealTime {
	
	WebDriver driver;
	
	@BeforeClass
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swami koragajja\\git\\Rock\\projectJan2024\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
	}
	
	@DataProvider
	public Object[][] dataSet() throws Exception{
		File src = new File("F:\\Pavan\\test\\Repository\\testdata.properties");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		
		Object arr[][] = new Object[3][2];
		
		arr[0][0] = pro.getProperty("testdata1");
		arr[0][1] = pro.getProperty("testdata2");
		
		arr[1][0] = pro.getProperty("testdata3");
		arr[1][1] = pro.getProperty("testdata4");
		
		arr[2][0] = pro.getProperty("testdata5");
		arr[2][1] = pro.getProperty("testdata6");
		
		return arr;
		
	}
	
	@Test(dataProvider = "dataSet")
	public void enterData(String username, String password) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
		
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
