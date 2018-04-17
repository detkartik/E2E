package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	
public void basePageNavigation()
  {
	driver.get(prop.getProperty("url"));
	
   
  
  }

@AfterTest
 public void teardown()
  {
    driver.close();	
  }

}
