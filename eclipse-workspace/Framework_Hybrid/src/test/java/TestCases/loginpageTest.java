package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.LoginPage_pageObject;
import PageObjects.homePage_PageObj;
import dataProvider.CustomDataProvider;

public class loginpageTest extends BaseClass

{
	homePage_PageObj nav;
	LoginPage_pageObject log;
	
@Test(priority = 1)
public void HomePage() throws InterruptedException
{
	nav=new homePage_PageObj(driver);
	Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Learn Automation Courses']")).isDisplayed());
	
}
@Test(priority = 2,dataProvider="credentials",dataProviderClass =CustomDataProvider.class)
public void login(String username,String password) throws InterruptedException
{
	log=new LoginPage_pageObject(driver);
	nav.navtologin();
	log.logIN(username,password);
	Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Manage']")).isDisplayed());
	log.logout();
}	
@Test(priority = 3)
public void loggedOut()
{
	
	Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Sign In']")).isDisplayed());
}
}

