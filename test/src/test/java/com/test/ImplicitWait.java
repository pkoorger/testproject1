package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swami koragajja\\git\\Rock\\projectJan2024\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		// ImpliciyWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("how stuff works");

		List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for (int i = 0; i < allSuggestions.size(); i++) {
			String expR = "how stuff works quiz";

			if (allSuggestions.get(i).getText().equalsIgnoreCase(expR)) {
				allSuggestions.get(i).click();
				break;
			}
		}

	}

}
