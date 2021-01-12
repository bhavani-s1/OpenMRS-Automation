package com.atmecs.openmrs.automation.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.atmecs.openmrs.automation.constants.Constants;
import com.atmecs.openmrs.automation.helper.HelperClass;
import com.atmecs.openmrs.automation.utils.PropertyReader;
import com.atmecs.openmrs.automation.utils.Reports;

public class Registerpage {

	
	public WebDriver driver;
	Properties property;
	Properties Userdata;

	Reports log = new Reports();

	public Registerpage(WebDriver driver) {
		this.driver = driver;
	}

	public void register() throws Exception {
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

		HelperClass.clickAction(driver, property.getProperty("loc_register"));
		log.info("Enter firstname");

		HelperClass.sendText(driver, property.getProperty("loc_givenname"), Userdata.getProperty("data_givenname"));
		
		log.info("Enter familyname");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HelperClass.sendText(driver, property.getProperty("loc_familyname"), Userdata.getProperty("data_familyname"));
		
		log.info("Enter loginbutton");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HelperClass.clickAction(driver, property.getProperty("loc_button"));
		
		log.info("Selecting gender");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HelperClass.clickAction(driver, property.getProperty("loc_gender"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		log.info("Enter loginbutton");

		HelperClass.clickAction(driver, property.getProperty("loc_button"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		log.info("Enter estimation year");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HelperClass.sendText(driver, property.getProperty("loc_estimatedyears"), Userdata.getProperty("data_birthday"));
		
		log.info("Enter estimation month");

		HelperClass.sendText(driver, property.getProperty("loc_month"), Userdata.getProperty("data_month"));
		
		//HelperClass.sendText(driver, property.getProperty("loc_year"), Userdata.getProperty("data_year"));
		log.info("Enter loginbutton");

		HelperClass.clickAction(driver, property.getProperty("loc_button"));
		log.info("Enter address");

		HelperClass.sendText(driver, property.getProperty("loc_address"), Userdata.getProperty("data_address"));
		log.info("Enter secondaddress");

		HelperClass.sendText(driver, property.getProperty("loc_secondaddress"),
				Userdata.getProperty("data_secondaddress"));
		log.info("Enter cityname");

		HelperClass.sendText(driver, property.getProperty("loc_city"), Userdata.getProperty("data_city"));
		log.info("Enter statename");

		HelperClass.sendText(driver, property.getProperty("loc_state"), Userdata.getProperty("data_state"));
		log.info("Enter country");

		HelperClass.sendText(driver, property.getProperty("loc_country"), Userdata.getProperty("data_country"));
		log.info("Enter postal code");

		HelperClass.sendText(driver, property.getProperty("loc_postalcode"), Userdata.getProperty("data_postalcode"));
		log.info("Enter loginbutton");

		HelperClass.clickAction(driver, property.getProperty("loc_button"));
		log.info("Enter phonenumber");

		HelperClass.sendText(driver, property.getProperty("loc_phonenumber"),
				Userdata.getProperty("data_phonenumber"));
		HelperClass.clickAction(driver, property.getProperty("loc_button"));
		log.info("Selecting relationship");

		HelperClass.dropDownMenu(driver, property.getProperty("loc_relationship"), "Doctor");
		log.info("Enter name of the person");

		HelperClass.sendText(driver, property.getProperty("loc_nameoftheperson"),Userdata.getProperty("data_nameoftheperson"));
		log.info("Enter loginbutton");

		HelperClass.clickAction(driver, property.getProperty("loc_button"));
		log.info("Enter confirmbutton");

		HelperClass.clickAction(driver, property.getProperty("loc_confirmbutton"));
		
		log.info("Clicking  homepageicon");

		Thread.sleep(2000);
		
		HelperClass.clickAction(driver, property.getProperty("loc_homepageicon"));
		
		
		log.info("Clicking  patient record");

		HelperClass.clickAction(driver, property.getProperty("loc_findpatientrecord"));
		
		log.info("Enter patient search");

		HelperClass.sendText(driver, property.getProperty("loc_patientsearch"), Userdata.getProperty("user_id"));
		log.info("Clicking homepageicon");

		HelperClass.clickAction(driver, property.getProperty("loc_homepageicon"));
		log.info("Clicking  datamanagement");

		HelperClass.clickAction(driver, property.getProperty("loc_datamanagement"));
		log.info("Clicking mergerecords");

		HelperClass.clickAction(driver, property.getProperty("loc_mergerecords"));
		log.info("Enter patient  id");

		HelperClass.sendText(driver, property.getProperty("loc_patienttext"), Userdata.getProperty("patient_id"));
		log.info("Enter second patient  id");

		HelperClass.sendText(driver, property.getProperty("loc_secondpatienttext"),Userdata.getProperty("secondpatient_id"));
		log.info("Clicking confirm button");

		HelperClass.clickAction(driver, property.getProperty("loc_conbutton"));

	}
}
	

