package testcases;

//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import pageObjects.HoverElements;
//import pageObjects.Landingpage;
import pageObjects.Landingpage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import resource.Base;


public class PDPNavigation extends Base {

	
	public static Logger log =LogManager.getLogger(PDPNavigation.class.getName());
	
	
	@BeforeTest
     public void intialize() throws IOException
	{

	driver = InitializeDriver();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	log.info("driver is initialized"); 
		
	 }	
	
@Test
	
public void ProductpageNavigation() throws InterruptedException
  {
	driver.get(prop.getProperty("url"));
   // HoverElements hover = new HoverElements(driver); 
	Landingpage lp = new Landingpage(driver);
	lp.MenuNav().click();
	log.info("Successfully navigated to Category landing page");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	lp.Product().click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	log.info("Successfully navigated to PDP");
	
	//hover.HoverMenu().build().perform();
    
  }

@AfterTest
 public void teardown()
  {
	
	driver.close();	
  }

}
