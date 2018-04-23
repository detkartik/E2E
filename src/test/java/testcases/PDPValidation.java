package testcases;

//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HoverElements;
//import pageObjects.HoverElements;
//import pageObjects.Landingpage;
import pageObjects.Landingpage;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;

import resource.Base;


public class PDPValidation extends Base {

	
	public static Logger log =LogManager.getLogger(PDPValidation.class.getName());
	
	
	@BeforeTest
     public void intialize() throws IOException
	{

	driver = InitializeDriver();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	log.info("driver is initialized"); 
		
	 }	
	
@Test
	
public void ProductPageValidation() throws InterruptedException
  {
	driver.get(prop.getProperty("url"));
    HoverElements hover = new HoverElements(driver); 
	Landingpage lp = new Landingpage(driver);
	lp.MenuNav().click();
	log.info("Successfully navigated to Category landing page");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	lp.Product().click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	log.info("Successfully navigated to PDP");
	
	//hover.prodcolor().click().build().perform();
	hover.prodsize().click().build().perform();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//
	//JavascriptExecutor executor2 = (JavascriptExecutor) driver;
	//executor2.executeScript("arguments[0].click();", lp.Prodsize());

//    JavascriptExecutor executor1 = (JavascriptExecutor) driver;
	//executor1.executeScript("arguments[0].click();", lp.Prodcolor());
	
	hover.addtocart().click().perform();
	
/*		
	lp.Body().sendKeys(Keys.PAGE_DOWN);	
	JavascriptExecutor executor2 = (JavascriptExecutor) driver;
	executor2.executeScript("arguments[0].click();", lp.Prodsize());

	
	
	JavascriptExecutor executor3 = (JavascriptExecutor) driver;
	executor3.executeScript("arguments[0].click();",lp.addtocart());
	lp.addtocart().click();
  */  
  }
@AfterTest
 public void teardown()
  {
	
	driver.close();	
  }

}
