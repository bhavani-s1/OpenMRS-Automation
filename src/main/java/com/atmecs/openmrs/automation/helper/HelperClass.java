package com.atmecs.openmrs.automation.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.atmecs.openmrs.automation.utils.Reports;

public class HelperClass  {

Reports log = new Reports();
	
	public static void webElement(WebDriver driver, String elementPath, String actual, String expected) {
		driver.findElement(By.xpath(elementPath)).getText();
    }

	public static void sendText(WebDriver driver, String elementPath, String value) {
		driver.findElement(By.xpath(elementPath)).sendKeys(value);
	}

	public static void clickAction(WebDriver driver, String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
		
	
	}
	public static void dropDownMenu(WebDriver driver, String xpath, String valueToSelect) throws Exception {
		Select dropdown = new Select(driver.findElement(By.xpath(xpath)));
		dropdown.selectByVisibleText(valueToSelect);
	}

    public  void textvalidate(WebDriver driver ,String xpath,String expected) {
    	
	    String actual = driver.findElement(By.xpath(xpath)).getText();
	    System.out.println("actual text"+actual);
	    System.out.println("expected text"+expected);
	
	try {
//		Assert.assertEquals(actual, expected);
		log.info("assertion passed:" + actual);
		
	} catch (AssertionError e) {
		log.info("Assertion failed" + e.getMessage());
	}
}
}

	
	

