package com.qa.selenium.Firstanimation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Screenshots s = new Screenshots();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		s.takeaPic(driver, "../Firstanimation/Screenshots/amazon.png");

		Actions actions = new Actions(driver);
		//actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		//actions.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN).perform();
		
		WebElement scroll = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		
		actions.moveToElement(scroll);
		actions.perform();
		scroll.click();
		Thread.sleep(50);
		
		WebElement aboutUs = driver.findElement(By.xpath("//a[@class='nav_a' and text()='About Us']"));
		actions.moveToElement(aboutUs);
		actions.perform();
		aboutUs.click();
		
		// driver.close();

	}

}
