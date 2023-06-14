package SeleniumProject.readData;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFile {

	public static void main(String[] args) {
		File f = new File("../Firstanimation/src/main/java/SeleniumProject/readData/DataFile.properties");
		
		FileInputStream fis =null;
		
		try
		{
			
			fis = new FileInputStream(f);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try
		{
			prop.load(fis);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		
		WebElement globaltext = driver.findElement(By.id("twotabsearchtextbox"));
		
		
		
		globaltext.sendKeys(prop.getProperty("globaltext"));
		
		/*Actions act =new Actions(driver);
		act.moveToElement(globaltext).build().perform();
		act.click(globaltext).contextClick().build().perform();
		*/
		
		
		
		System.out.println("Url = "+prop.getProperty("url"));
		
		
		
	}

}
