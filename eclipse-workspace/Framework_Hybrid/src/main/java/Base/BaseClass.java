package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import browserFactory.LanchBrowser;
import dataProvider.Config_Reader;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass
	public void start() {
		driver = LanchBrowser.startBrowser(Config_Reader.getProperty("Browser"),Config_Reader.getProperty("Qa_Env_Url"));
	}

	@AfterClass
	public void closebrowse() {
		//LanchBrowser.quitbrowser(driver);
	}
}
