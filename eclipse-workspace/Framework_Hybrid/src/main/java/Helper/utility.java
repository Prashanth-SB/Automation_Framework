package Helper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class utility 
{
	public static void captureScreenshot(WebDriver driver)
	{
		
		TakesScreenshot ts=(TakesScreenshot) driver;

		try 
		{
			FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")+"/screenshots/Sample"+getCurrentTimeStamp()+".png"));
			
		} catch (WebDriverException e) 
		{
			System.out.println("Exception "+e.getMessage());
		} catch (IOException e) 
		{
			System.out.println("IO Execption "+e.getMessage());
		}

	}
	
	public static String captureScreenshotInBase64(WebDriver driver)
	{
		
		TakesScreenshot ts=(TakesScreenshot) driver;

		String src=ts.getScreenshotAs(OutputType.BASE64);
		
		return src;
	}
	
	
	public static void captureScreenShot(WebDriver driver,WebElement ele) 
	{
		
		/*
		 *  Complete this method > use custom date time stamp
		 * 
		 */
		
	}
	
	
	public static String getCurrentTimeStamp()
	{
		String date=new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(new Date());
		
		return date;
	}
	
	
	public static void WaitForSecond(int second)
	{
		try {
			Thread.sleep(second*100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
