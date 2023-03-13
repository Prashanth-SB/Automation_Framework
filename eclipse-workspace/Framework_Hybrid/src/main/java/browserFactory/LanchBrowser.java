package browserFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LanchBrowser 
{
	static WebDriver driver;
	static ThreadLocal<WebDriver> threadLocal;
	public static WebDriver getBrowserInstance()
	{
		driver=threadLocal.get();
		return driver;
	}


	public static WebDriver startBrowser(String browsername, String AppUrl) {
		//WebDriver driver=null;

		if (browsername.equalsIgnoreCase("Chrome") || (browsername.equalsIgnoreCase("Google Chrome"))) {
			driver = new ChromeDriver();
		}
		if (browsername.equalsIgnoreCase("FF") || (browsername.equalsIgnoreCase("Firefox"))) {

			driver = new FirefoxDriver();
		}
		if (browsername.equalsIgnoreCase("Edge") || (browsername.equalsIgnoreCase("ED"
				))) {

			driver = new EdgeDriver();
		}
		threadLocal=new ThreadLocal<WebDriver>();
		threadLocal.set(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		driver.get(AppUrl);
		return driver;
	}
	
	public static void quitbrowser(WebDriver driver) {
		driver.quit();
	}
}
