 package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.DefaultLandingPage_POM;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class DefaultLandingPage extends BaseClass
{
	
	@Test()
	
	public void getsocialmeadiaicons() throws InterruptedException 
	{
		DefaultLandingPage_POM obj = new DefaultLandingPage_POM(driver);
		obj.default_page_socialMeadia_Icon();
		obj.getlikedIN();
		Assert.assertTrue(driver.getTitle().contains("Mukesh otwani - YouTube"));
		
		
	}
}
