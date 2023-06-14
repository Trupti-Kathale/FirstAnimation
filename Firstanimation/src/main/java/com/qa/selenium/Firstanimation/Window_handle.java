package com.qa.selenium.Firstanimation;

import java.util.Set;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_handle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		WebElement cl_here = driver.findElement(By.xpath("//a[text()='Click Here']"));
		cl_here.click();
		
		String orignal = driver.getWindowHandle();
		System.out.println("Orignal window = "+orignal);
		
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		java.util.Iterator<String> i = ids.iterator();
		
		while(i.hasNext())
		{
			String cwindow = i.next();
			if(!orignal.equalsIgnoreCase(cwindow))
			{
				driver.switchTo().window(cwindow);
				WebElement email_id = driver.findElement(By.name("emailid"));
				email_id.sendKeys("ethanselenium@gmail.com");
				WebElement submit = driver.findElement(By.name("btnLogin"));
				submit.click();
				driver.close();
												
			}
			driver.switchTo().window(orignal);
			driver.close();
		}
		driver.close();
		
	}

}
