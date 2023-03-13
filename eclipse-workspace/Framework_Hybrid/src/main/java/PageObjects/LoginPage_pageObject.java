package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import Helper.utility;
import lombok.experimental.Helper;

public class LoginPage_pageObject
{
	WebDriver driver;
	
	public LoginPage_pageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By user_name=By.id("email1");
	By pwd=By.xpath("//input[@placeholder='Enter Password']");
	By SignIn=By.xpath("//button[text()='Sign in']");
	By signout_nav=By.xpath("//span[@class='navbar-toggler-icon']");
	By signout=By.xpath("//button[text()='Sign out']");
	By Signoutclose=By.xpath("//button[@class='btn-close']");
	
	public void logIN(String username,String password) throws InterruptedException
	{
		utility.WaitForSecond(3);
		driver.findElement(user_name).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(SignIn).click();
		
		}
	public void logout()
	{
		utility.WaitForSecond(3);
		driver.findElement(signout_nav).click();
		driver.findElement(signout).click();
		driver.findElement(Signoutclose).click();
	}
	
}