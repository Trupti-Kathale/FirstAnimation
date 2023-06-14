package com.qa.selenium.Firstanimation;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Previous_page {

	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			
			//WebDriver driver=new ChromeDriver();
			ChromeOptions option = new ChromeOptions();
			ChromeDriver driver = new ChromeDriver(option);
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			
			String parent_window = driver.getWindowHandle();
			System.out.println(parent_window);
			
			WebElement signin= driver.findElement(By.id("nav-link-accountList"));
			WebElement prime_video = driver.findElement(By.xpath("//span[@class='nav-text' and contains(text(),'Your Prime Video')]"));
			
			Actions a1= new Actions(driver);
			a1.moveToElement(signin).build().perform();
			
			prime_video.click();
			/*
			Set<String> ids= driver.getWindowHandles();
			System.out.println(ids);
			java.util.Iterator<String> i = ids.iterator();

			while(i.hasNext())
			{
				String cwindow = i.next();
				if(parent_window.equalsIgnoreCase(cwindow))
				{
					driver.switchTo().window(parent_window);	
					System.out.println("Driver closes "+ driver.switchTo().window(cwindow).getTitle());
				}
			}*/
			
			driver.navigate().to("https://www.amazon.in/");
			
			
			
			
			//driver.switchTo().window(parent_window);
			Thread.sleep(30);
										
			//driver.close();
	}

}
