package TestNGproject.TestNGproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
	
	import org.testng.annotations.BeforeMethod;

	import org.testng.annotations.Test;

import junit.framework.Assert;

	public class testNGpriority {
		public WebDriver driver;
		
	  @BeforeMethod
	  public void loginpage() {
		  
		 System.setProperty("webdriver.chrome.driver" , "C:\\Users\\pradeep\\Documents\\GitHub\\Java\\drivers\\chromedriver.exe");
		 driver= (WebDriver) new ChromeDriver();
		 driver.get("http://google.com");
		 
	  }
	  
	  @Test
	  public void testMethod() {
		  String title = driver.getTitle();
		 
		  Assert.assertEquals(title,"Google");
		  //System.out.println("Test case to be called");	  
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }
	  	 
	}


