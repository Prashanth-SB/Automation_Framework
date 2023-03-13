package PageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

//import jdk.internal.misc.FileSystemOption;

public class DefaultLandingPage_POM

{
	WebDriver driver;

	public DefaultLandingPage_POM(WebDriver driver) 
	{
		this.driver = driver;
	}

	By socialmeadiaLinks = By.xpath("//div[@class='footer-div']//a");

	public void default_page_socialMeadia_Icon()

	{
		List<WebElement> links = driver.findElements(socialmeadiaLinks);
		System.out.println("The totla link avilable for social media is :" + links.size());
		List<String> masterlist = new ArrayList<>();
		for (WebElement i : links) {
			String names = i.getAttribute("href");

			String[] split = names.split(".com");

			if (split[0].contains("https")) {
				String[] splited = split[0].split("https://");

				if (!splited[1].contains("www.")) {
					masterlist.add(splited[1]);
				}
				if (splited[1].contains("www.")) {
					String[] result = splited[1].split("www.");

					masterlist.add(result[1]);

				}
			}

		}
		System.out.println(masterlist);

	}

	public void getlikedIN() throws InterruptedException {
		List<WebElement> link = driver.findElements(socialmeadiaLinks);
		String Parent=driver.getWindowHandle();
		for (WebElement linkedIn : link) {
			String allLinks = linkedIn.getAttribute("href");
			if (allLinks.contains("youtube")) 
			{
				WebDriverWait click=new WebDriverWait(driver, Duration.ofSeconds(15));
				WebElement ele=click.until(ExpectedConditions.elementToBeClickable(linkedIn));
				ele.click();
				Set<String> allTabs=driver.getWindowHandles();
				List<String>tabs=new ArrayList<>(allTabs);
				String chilTab=tabs.get(1);
				driver.switchTo().window(chilTab);
				driver.switchTo().window(Parent);
				driver.switchTo().window(chilTab);
				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(17));
				 wait.until(ExpectedConditions.titleContains("Mukesh otwani - YouTube"));
				
		
				System.out.println(driver.getTitle());
			break;
				
			
				
		}
	}
		
		
}}