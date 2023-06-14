package com.qa.selenium.Firstanimation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	static WebDriver driver;
	
	public static void Mobile(WebDriver driver) {
		WebElement text = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		text.sendKeys("Mobiles");

		WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search.click();

	}

	public static void HelloSignin(WebDriver driver) {
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));

		// Action class in selenium is responsible for hover and move to element.
		Actions a1 = new Actions(driver);
		a1.moveToElement(signin).build().perform();

		WebElement sellerAccount = driver.findElement(By.xpath("//span[@class='nav-text' and contains(text(),'Your Seller Account')]"));
		sellerAccount.click();
	}

	public static void QuitBrowser(WebDriver driver) {
		driver.close();

	}

}
