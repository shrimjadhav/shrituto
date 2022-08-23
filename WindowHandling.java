package com.vyasa.basic2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\FinalAutomation\\AutomationProject\\driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
        
	   String pWin=driver.getWindowHandle();
	   System.out.println(pWin);
	   driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
	   driver.switchTo().window(pWin);
	   
	   driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	   Set<String> allWin=driver.getWindowHandles();
	  System.out.println(allWin);
	  for (String oneWin : allWin) 
	  {
		if(!pWin.equals(oneWin))//pWin,cWin,cWin
		{
		System.out.println(driver.switchTo().window(oneWin).getTitle());
		driver.close();
		}
		
	}
	
	}

}
