package com.qa.selenium.Firstanimation;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//ChromeOptions option = new ChromeOptions();
		//ChromeDriver driver = new ChromeDriver(option);
		
		String url ="https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		/*
		Robot r1 =new Robot();
		
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(20);
		
		r1.keyPress(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_M);
		Thread.sleep(20);
		r1.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(20);
		r1.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_O);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_P);
		Thread.sleep(20);
		*/
		WebElement username = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions act = new Actions(driver);
		act.moveToElement(username).build().perform();
		//act.contextClick();//right click
		//act.doubleClick();//double click
		act.click(username).keyUp(Keys.SHIFT).sendKeys("air cooler").build().perform();
		
		WebElement submit = driver.findElement(By.id("nav-search-submit-button"));
		submit.click();
		
		//driver.close();
		
	}

}
