package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pageObjects.HoverElements;
import pageObjects.Landingpage;
//import org.testng.Assert;
import resource.Base;


public class SubcategoryNav extends Base {

	
	public static Logger log =LogManager.getLogger(Base.class.getName());
	
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
	
public void SubcategorypageNavigation() throws IOException
  {
	driver.get(prop.getProperty("url"));
	Landingpage lp = new Landingpage(driver);
    HoverElements hover = new HoverElements(driver);
    hover.HoverMenu().build().perform();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    lp.Wait();
	hover.HoverSubCat().perform();
	lp.SubCatNav().click();
	log.info("Successfully navigated to subcategory landing page");
	
  }

@AfterTest
 public void teardown()
  {
    driver.close();	
  }

}
