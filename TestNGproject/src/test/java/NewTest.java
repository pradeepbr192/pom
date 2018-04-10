import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeSuite
	public void beforesuite() {
	
		System.out.println("First method to be called");
		
	}
	
	
	@BeforeTest
	public void beforetest() {
	
		System.out.println("Second method to be called");
		
	}
	
	@BeforeClass
	public void beforeclass() {
	
		System.out.println("Third method to be called");
		
	}
  @BeforeMethod
  public void beformethod() {
	  
	  System.out.println("fourth method to be called");
  }
  
  @Test
  public void testMethod() {
	  
	  System.out.println("Test case to be called");	  
  }
  
  
  
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After test method is called method is called");
  }
  
  @AfterClass
  public void afterClassMethod() {
	  System.out.println("After class is called");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("After class is called");
  }

  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite is called finally");
  
  }
}
