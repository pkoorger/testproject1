package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swami koragajja\\git\\Rock\\projectJan2024\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(4000);
		
		//Radio Button 1st way
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//Radio button 2nd way
		
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total radio buttons : "  + radios.size());
		Thread.sleep(2000);
		System.out.println(radios.get(0).isSelected());
		Thread.sleep(2000);
		System.out.println(radios.get(1).isEnabled());
		Thread.sleep(2000);
		System.out.println(radios.get(2).isDisplayed());
		Thread.sleep(2000);
		radios.get(1).click();
		Thread.sleep(2000);
		System.out.println(radios.get(2).isSelected());
		Thread.sleep(3000);
		
		//3rd way
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total radio buttons : "  + radios1.size());
		
		for(int i =0; i<radios1.size(); i++) {
			if(radios1.get(i).getText().equalsIgnoreCase("Female")){
				radios1.get(i).click();
				System.out.println("Female clicked ");
				break;
			}
		}
		

	}

}
