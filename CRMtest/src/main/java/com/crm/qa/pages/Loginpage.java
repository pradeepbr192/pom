package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase {

	//Declaring object repositories
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;

	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	//Initializing the page objects
	
	public Loginpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	 
	public String validateloginpage() {
		return(driver.getTitle());
	}
	
	public Homepage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		return new Homepage();
	}
}


