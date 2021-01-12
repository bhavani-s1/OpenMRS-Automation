package com.atmecs.openmrs.automation.testscripts;

import org.testng.annotations.Test;

import com.atmecs.openmrs.automation.pages.Registerpage;
import com.atmecs.openmrs.automation.testbase.BaseTest;
import com.atmecs.openmrs.automation.utils.Reports;

public class RegisterTest extends BaseTest {

	
	Reports log = new Reports();
	@Test
  public void register() throws Exception {
	  Registerpage reg = new Registerpage(driver);
      reg.register();
}
}
	
	

