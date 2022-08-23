package com.vyasa.automation.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\FinalAutomation\\AutomationProject\\driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
	//driver.findElement(By.xpath("//input[ @id='twotabsearchtextbox']")).sendKeys("ToY");
	//driver.findElement(By.linkText("//a[ @class='nav-a']")).click();
	driver.findElement(By.linkText("Best Sellers")).click();
	driver.quit();
	
	
	
	}


}
