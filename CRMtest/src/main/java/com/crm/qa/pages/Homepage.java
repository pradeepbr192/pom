package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Homepage extends TestBase{
	
	Contactspage contactpage;

	@FindBy(xpath="//td[contains(text(),'User: Naveen K')]")
	WebElement username;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contacts;
	
	public Homepage() { // Initialize the page factory
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String Homepagetitle() {
		
		return driver.getTitle();
	}
	
	public boolean usernamedisplayed() {
		
		return username.isDisplayed();
	}
	public Contactspage Contactspage() {
		
	contacts.click();
	
	return new Contactspage();
	}
}
