package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.Testutil;

//Parent class for all other classes
public class TestBase {

	public static Properties prop; // is a global variable
	public static WebDriver driver;
	public TestBase() {  //create a constructor of the class and read the property file
		
		
		try
		{
			prop= new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\pradeep\\eclipse-workspace\\CRMtest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		
		String browsername= prop.getProperty("browser");
		
		if (browsername.equals("firefox")){
			System.setProperty("webdriver.Firefox.driver","H:\\uiautomation\\Java\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT,TimeUnit.SECONDS);	
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	
}
