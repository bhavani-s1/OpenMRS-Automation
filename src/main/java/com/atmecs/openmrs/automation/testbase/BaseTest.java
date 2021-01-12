package com.atmecs.openmrs.automation.testbase;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.atmecs.openmrs.automation.constants.Constants;
import com.atmecs.openmrs.automation.utils.PropertyReader;
import com.atmecs.openmrs.automation.utils.Reports;

public class BaseTest {

	public Properties properties;
	public  WebDriver driver;
	String baseUrl;
	String browser;
	Reports log=new Reports();
	
	@BeforeMethod
	public void invokeBrowser() {

		properties = PropertyReader.readProperties(Constants.CONFIG_FILE);

		baseUrl = properties.getProperty("Url");
		browser=properties.getProperty("Browser_name");
	
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",Constants.CHROME_FILE);
			driver = new ChromeDriver(); 
			//log.info("chrome launched successfully");
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver",Constants.FIREFOX_FILE);	
			driver = new FirefoxDriver(); 
		}

		driver.get(baseUrl);
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//log.info("url launched successfully");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}

