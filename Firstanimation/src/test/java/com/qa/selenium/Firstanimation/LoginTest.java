package com.qa.selenium.Firstanimation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{	
	static WebDriver driver;
	
	@BeforeSuite
	public void UpServer()
	{
		System.out.println("Server is up and running....");
	}
	
	
	@BeforeMethod
	public void OpenApplication()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		System.out.println("Opening the application....");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// Screenshot(driver,"../Firstanimation/Screenshots/amazon.png");
	}
	
	@Test
	public void LaunchingMobile()
	{
		Login.Mobile(driver);
		System.out.println("Launching Mobiles....");
	}
	
	@Test
	public void HelloSigninLaunch()
	{
		Login.HelloSignin(driver);
		System.out.println("Launching hello signin....");
	}
	
	@AfterMethod
	public void CloseApp()
	{
		Login.QuitBrowser(driver);
		System.out.println("Closing the application....");
	}
	
	@AfterSuite
	public void DownServer()
	{
		System.out.println("Server is down and close...");
	}
	
	
	
}
