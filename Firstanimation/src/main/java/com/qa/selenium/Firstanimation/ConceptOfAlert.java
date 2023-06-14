package com.qa.selenium.Firstanimation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConceptOfAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		String url = "https://demo.guru99.com/test/delete_customer.php";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement cust_id = driver.findElement(By.name("cusid"));
		cust_id.sendKeys("1234");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		//For pop-up windows alert class is used
		Alert al = driver.switchTo().alert();
		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		al.accept();
		//al.dismiss();
		
		
		Alert al1 = driver.switchTo().alert();
		String str1 = driver.switchTo().alert().getText();
		System.out.println(str1);
		al1.accept();
		
		//driver.close();
		
	}
	
}
