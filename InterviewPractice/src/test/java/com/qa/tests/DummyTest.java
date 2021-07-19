package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DummyTest {
	
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSS\\Ravi\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		/*Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alert.dismiss(); */
		
		//driver.findElement(By.name("email")).sendKeys("ravi.rulez999@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("ravi.rulez");
		
		//driver.close();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Motors"))).build().perform();
		driver.findElement(By.linkText("Motorcycles")).click();
		
		
		
	}

}
