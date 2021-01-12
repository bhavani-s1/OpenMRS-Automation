package com.atmecs.openmrs.automation.constants;

import java.io.File;

public class Constants {

	public static final String USER_HOME = System.getProperty("user.dir") + File.separator;
	public static final String CHROME_FILE= "./lib/chromedriver.exe";
	public static final String FIREFOX_FILE= "./lib/geckodriver.exe";

	
	public static final String LOCATION_READER = "./src/main/java/com/atmecs/openmrs/automation/utils";
	public static final String CONFIG_FILE = "./src/main/resources/locators/config.properties";
	public static final String locator_path = "./src/main/resources/locators/Login.properties";
	
	public static final String User_path = "./src/main/resources/Testdata/login.properties";
	public static final String Valid_path = "./src/test/resources/Userinformation.xlsx";
	public static final String Log4j_file = "./src/main/resources/log4j.properties";

	public static final String Login_xls ="./src/main/resources/testdata/OpenMrLogin.xlsx";
	public static final String Login_Path=".src/main/resources/locators/Login.properties";
	
	
	public static final String Registerlocator_Path="./src/main/resources/locators/register.properties";
	public static final String Registeruserdata_Path="./src/main/resources/Testdata/userdata.properties";
}

	
	
	

