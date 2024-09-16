package com.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swami koragajja\\git\\Rock\\projectJan2024\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("tabButton")).click();

		// total number of tab

		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);
		Iterator<String> abc = allWindowsId.iterator();
		String win1 = abc.next();
		String win2 = abc.next();
		System.out.println(driver.getTitle());
		driver.switchTo().window(win1);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
		

	}

}
