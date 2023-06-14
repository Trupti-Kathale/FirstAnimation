package com.qa.selenium.Firstanimation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextMatch {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(option);
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement all = driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
		all.click();
		//Thread.sleep(10);
		
		WebElement your_account = driver.findElement(By.xpath("//a[@class='hmenu-item' and contains(text(), 'Your Account')]"));	
		your_account.click();
		//Thread.sleep(10);
		
		String presenturl = driver.getCurrentUrl();
		System.out.println(presenturl);
		Thread.sleep(10);
		
			
		List<WebElement> order = driver.findElements(By.xpath("//div[@class='a-box ya-card--rich']//preceding-sibling::div[@class='a-row']//preceding-sibling::div[@class='a-column a-span9 a-span-last']"));
		
		
		for(WebElement a:order)
		{
			System.out.println(a.getText());
		}
		/*	
		String str1 = "Your Orders";
		String str2 = "Login & security";
		String str3 = "Prime";
		String str4 = "Your Addresses";
		String str5 = "Payment options";
		String str6 = "Amazon Pay balance";
		String a1 = null,a2 = null,a3 = null,a4 = null,a5 = null,a6 = null;
		
		for(WebElement a:order)
		{
			a1 = order.get(0).getText();
			
			//System.out.println("s1= "+ str1);
			//System.out.println("a1= "+ a1);	
			
			a2 = order.get(1).getText();
			a3 = order.get(2).getText();
			a4 = order.get(3).getText();
			a5 = order.get(4).getText();
			a6 = order.get(5).getText();
			
			if(str1.equalsIgnoreCase(a1))
			{
				System.out.println(str1 + " String is matched with = "+a1);
			}
			if(str2.equalsIgnoreCase(a2))
			{
				System.out.println(str2 + " String is matched with = "+a2);
			}
			if(str3.equalsIgnoreCase(a3))
			{
				System.out.println(str3 + " String is matched with = "+a3);
			}
			if(str4.equalsIgnoreCase(a4))
			{
				System.out.println(str4 + " String is matched with = "+a4);
			}
			if(str5.equalsIgnoreCase(a5))
			{
				System.out.println(str5 + " String is matched with = "+a5);
			}
			if(str6.equalsIgnoreCase(a6))
			{
				System.out.println(str6 + " String is matched with = "+a6);
			}
			else
				System.out.println("String is not matched");
		}*/
		//System.out.println(order.get(i).getText());
		driver.close();
		
	}
}

