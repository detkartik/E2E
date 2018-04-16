package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.testng.Assert;
import pageObjects.Landingpage;
import resource.Base;


public class CategoryNavigation extends Base {

	
	public static Logger log =LogManager.getLogger(CategoryNavigation.class.getName());
	
	
	@BeforeTest
     public void intialize() throws IOException
	{

	driver = InitializeDriver();
	log.info("driver is initialized"); 
		
	 }	
	
@Test
	
public void basePageNavigation() throws IOException
  {
	driver.get(prop.getProperty("url"));
	
    Landingpage l = new Landingpage(driver);
      l.MenuNav().click();
  
  }

@AfterTest
 public void teardown()
  {
    driver.close();	
  }

}
