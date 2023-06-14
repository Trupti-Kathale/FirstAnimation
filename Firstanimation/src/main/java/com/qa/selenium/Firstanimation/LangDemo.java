package com.qa.selenium.Firstanimation;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
//import com.sun.org.apache.bcel.internal.generic.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LangDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
		
			WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.amazon.in/");
		
			driver.manage().window().maximize();
			
			WebElement en = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']//preceding-sibling::span[@class='nav-line-2']"));
			
			en.click();
			
			List<WebElement> List = driver.findElements(By.xpath("//span[@class='a-label a-radio-label']"));
			
			java.util.Iterator<WebElement> it = List.iterator();
			System.out.println("Language Drop down button is : ");
			while(it.hasNext())
			{		
				System.out.println(it.next().getText());
				Thread.sleep(10);
			}
				
			WebElement submit = driver.findElement(By.xpath("//span[@class='a-button-inner']//following::span[@id='icp-save-button-announce']"));

			Actions actions = new Actions(driver);
			actions.moveToElement(submit).click().build().perform();
			
			
			
	                   		
						
			driver.close();
	}

}
