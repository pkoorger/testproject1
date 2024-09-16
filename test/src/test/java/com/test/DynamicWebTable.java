package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swami koragajja\\git\\Rock\\projectJan2024\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> allCompany = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total companies " + allCompany.size());

		List<WebElement> allPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total companies " + allCompany.size());
		
		String expResult = "Premier Polyfilm";
		
		for(int i =0; i<allCompany.size(); i++) {
			if(allCompany.get(i).getText().equalsIgnoreCase(expResult)) {
				System.out.println(allCompany.get(i).getText() + "   " + allPrice.get(i).getText());
				allCompany.get(i).click();
				break;
			}
		}

	}

}
