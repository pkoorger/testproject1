package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swami koragajja\\git\\Rock\\projectJan2024\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(4000);
		
		//1st way
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total dopdown values : " + birthMonth.size());
		birthMonth.get(8).click();  //Sep
		Thread.sleep(4000);
		
		//2nd way
		
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm);
		Thread.sleep(4000);
		month.selectByVisibleText("Apr");
		Thread.sleep(4000);
		month.selectByValue("12");
		Thread.sleep(4000);
		month.selectByIndex(7);
		Thread.sleep(4000);
		System.out.println(month.getFirstSelectedOption().getText());
		
		//3rd way
		
		List<WebElement> dropdown = month.getOptions();
		for(int i=0; i<dropdown.size(); i++) {
			if(dropdown.get(i).getText().equalsIgnoreCase("Mar")) {
				dropdown.get(i).click();
				
			}
		}
		
		bm.sendKeys("Jun");
		
		System.out.println(month.isMultiple());
		
		
		month.deselectAll();
		month.selectByIndex(0);
		
		

	}

}
