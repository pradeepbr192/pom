package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class Loginpagetest extends TestBase {
	Loginpage login;
	Homepage homepage;

	public Loginpagetest() {
		super(); // To initialize the properties which is defined in the base class. IT is
					// compulsory to call test base class constructor

	}

	@BeforeMethod
	public void setup() {
		initialization();
		login = new Loginpage();

	}

	@Test(priority = 1)
	public void Loginpagetitletest() {

		String title = login.validateloginpage();
		Assert.assertEquals(title, "Free CRM in the cloud software boosts sales");
	}

	@Test(priority = 2)
	public void loginTest() {

		homepage = login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod

	public void teardown() {
		driver.close();
	}
}
