package com.qa.selenium.Firstanimation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {

	
		public void takeaPic(WebDriver driver, String destination) throws IOException
		{
			TakesScreenshot tc = (TakesScreenshot)(driver);
			File srcfile = tc.getScreenshotAs(OutputType.FILE);
			
			File desfile = new File(destination);
			
			FileUtils.copyFile(srcfile, desfile);
			
		}
		
		
		

	

}
