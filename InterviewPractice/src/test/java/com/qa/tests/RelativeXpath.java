package com.qa.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSS\\Ravi\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		
		//driver.findElement(By.id("email")).sendKeys("Hello");
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hi");
		
		//driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("Hola");
		
		//driver.findElement(By.xpath("//input[contains(@name, 'email')]")).sendKeys("Namaste");
		
		driver.findElement(By.xpath("//input[starts-with(@name, 'ema')]")).sendKeys("HelloJi");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for(int i =0; i<=list.size(); i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		//driver.close();

	}

}
