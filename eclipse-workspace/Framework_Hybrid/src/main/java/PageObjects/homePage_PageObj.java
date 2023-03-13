package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage_PageObj 

{
	
	WebDriver driver;
	public homePage_PageObj(WebDriver driver)
	{
		this.driver=driver;
	}
	By title=By.xpath("//h1[text()='Learn Automation Courses']");
	By menu=By.xpath("//button[@aria-label='Toggle navigation']");
	By login=By.xpath("//button[text()='Log in']");
	By nav_close=By.xpath("//button[@class='btn-close']");
	
	public LoginPage_pageObject navtologin()
	{
		WebElement gettile=driver.findElement(title);
		driver.findElement(menu).click();
		driver.findElement(login).click();
		driver.findElement(nav_close).click();
		
		LoginPage_pageObject logged=new LoginPage_pageObject(driver);
		return logged;
		
	}
	

}
