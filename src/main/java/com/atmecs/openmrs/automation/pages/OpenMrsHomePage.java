package com.atmecs.openmrs.automation.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.openmrs.automation.constants.Constants;
import com.atmecs.openmrs.automation.helper.HelperClass;
import com.atmecs.openmrs.automation.utils.PropertyReader;
import com.atmecs.openmrs.automation.utils.Reports;

public class OpenMrsHomePage {

	public WebDriver driver;
	Properties property;
	Properties Userdata;
	  Reports log=new Reports();
	public OpenMrsHomePage(WebDriver driver){
		this.driver=driver;
	}
	public void loginProcess(String Username, String Password) {
		property=	PropertyReader.readProperties(Constants.Login_Path);
		Userdata=	PropertyReader.readProperties(Constants.User_path);

	    HelperClass.sendText(driver, property.getProperty("loc_username"), ("Username"));
	    HelperClass.sendText(driver, property.getProperty("loc_password"), ("Password"));
	    HelperClass.clickAction(driver, property.getProperty("loc_pharmacy"));
	    HelperClass.clickAction(driver, property.getProperty("loc_loginbutton"));
	    HelperClass.clickAction(driver, property.getProperty("loc_findpatientrecord"));
	                                                                                                                                                          
	    HelperClass.sendText(driver, property.getProperty("loc_patientsearch"), Userdata.getProperty("user_id"));
	}
	

		public void login() {
		property = PropertyReader.readProperties(Constants.Registerlocator_Path);
		Userdata = PropertyReader.readProperties(Constants.Registeruserdata_Path);
		log.info("Enter user name");

		HelperClass.sendText(driver, property.getProperty("loc_username"), Userdata.getProperty("data_username"));
		log.info("Enter password");
		HelperClass.sendText(driver, property.getProperty("loc_password"), Userdata.getProperty("data_password"));
		log.info("Clicking pharmacy");

		HelperClass.clickAction(driver, property.getProperty("loc_pharmacy"));
		log.info("Enter loginbutton");

		HelperClass.clickAction(driver, property.getProperty("loc_loginbutton"));
		log.info("Clicking loginbutton");
		HelperClass.clickAction(driver, property.getProperty("loc_findpatientrecord"));
		HelperClass.sendText(driver, property.getProperty("loc_patientsearch"), Userdata.getProperty("user_id"));
		}
		}
		

