package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Contactspage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.util.Testutil;

public class Homepagetest extends TestBase {

	Loginpage loginpage;
	Homepage homepage;
	Testutil testut;
	Contactspage contactspage;

	public Homepagetest() {

		super();

	}

	@BeforeMethod

	public void setup() {

		initialization();
		loginpage = new Loginpage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		testut= new Testutil();
		contactspage = new Contactspage();
	}

	@Test(priority = 1)
	public void Homepagetitletest() {

		String homepagetitle = homepage.Homepagetitle();
		Assert.assertEquals(homepagetitle, "Free CRM software in the cloud powers sales and customer service",
				"Home page title is not correct");
	}

	@Test(priority = 2)

	public void Verifyusername() {
		testut.Switchtoframe();
		Assert.assertTrue(homepage.usernamedisplayed());

	}
	
	@Test(priority=3)

	public void Contactspagelink() {
		
		testut.Switchtoframe();
		contactspage= homepage.Contactspage();
	}
	
	@AfterMethod

	public void teardown() {
		driver.quit();
	}

}
