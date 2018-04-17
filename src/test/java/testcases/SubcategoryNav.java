package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pageObjects.HoverElements;
import pageObjects.Landingpage;
import org.testng.Assert;
import resource.Base;


public class SubcategoryNav extends Base {

	
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
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
    HoverElements hover = new HoverElements(driver);
     boolean menu = l.MenuBar().isEnabled();
     hover.HoverMenu().build().perform();
     
    Assert.assertTrue(menu);
     hover.HoverMenu().moveToElement(l.SubCatNav()).click().build().perform();
  }

@AfterTest
 public void teardown()
  {
    driver.close();	
  }

}
