package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSim {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swami koragajja\\git\\Rock\\projectJan2024\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(electro).build().perform();
		Thread.sleep(2000);
		
		WebElement fash = driver.findElement(By.xpath("//*[text()='Fashion']"));
		act.sendKeys(fash, Keys.ENTER).build().perform();
		
		act.contextClick().build().perform();
		
		
		

	}

}
