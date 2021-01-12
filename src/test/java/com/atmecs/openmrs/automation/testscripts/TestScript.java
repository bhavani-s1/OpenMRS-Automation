package com.atmecs.openmrs.automation.testscripts;

import org.testng.annotations.Test;

import com.atmecs.openmrs.automation.pages.OpenMrsHomePage;
import com.atmecs.openmrs.automation.testbase.BaseTest;
import com.atmecs.openmrs.automation.utils.Reports;

public class TestScript extends BaseTest {

	Reports log = new Reports();

	/*@DataProvider
	public Object[][] getExcelData() {
		Object[][] data = Utils.getTestData("login", Constants.Login_xls);
		return data;
	}

	@Test(dataProvider = "getExcelData")

	public void login(String Username, String Password) throws InterruptedException {
	log.info("User login process");

	OpenMrsHomePage login = new OpenMrsHomePage(driver);
		login.login(Username,Password);
		log.info("User has been logged sucessfully");

      }
//}*/
	
	@Test
	public void loginpro() {
		OpenMrsHomePage login = new OpenMrsHomePage(driver);
        login.login();
	}
}

	
	

