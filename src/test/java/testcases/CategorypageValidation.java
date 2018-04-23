package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HoverElements;
import pageObjects.Landingpage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.support.ui.ExpectedConditions;

import resource.Base;


public class CategorypageValidation extends Base {

	
	public static Logger log =LogManager.getLogger(CategorypageValidation.class.getName());
	
	
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
	
public void  CategoryPageValidation() throws InterruptedException
  {
	
	driver.get(prop.getProperty("url"));
    HoverElements hover = new HoverElements(driver); 
	Landingpage lp = new Landingpage(driver);
	
	lp.MenuNav().click();
   // hover.HoverRefinement().build().perform();
    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //hover.Selectsize().click().perform();
	

   /* hover.pagination().click().build().perform();
   /* lp.Wait3();
/*    for(int i=0;i<=lp.content().getSize().width;i++)
	{
	   lp.Wait3();
		lp.Body().sendKeys(Keys.PAGE_DOWN);
		
	}*/
	long start = System.currentTimeMillis();
    
	hover.viewall().click().build().perform();
	lp.Wait3();
   for(int i=0;i<=lp.content().getSize().width;i++)
	{
	   lp.Wait3();
		lp.Body().sendKeys(Keys.PAGE_DOWN);
		
	}
   
    //JavascriptExecutor jse = (JavascriptExecutor)driver;
	 //  jse.executeScript("0,250"); 
	lp.Wait3();
   long finish = System.currentTimeMillis();
   
   long totalTime = finish - start; 
	System.out.println("Total Time for page load - "+totalTime); 
	
	double minutes = TimeUnit.MILLISECONDS.toMinutes(totalTime);
	
	System.out.println("Total time in minutes "+ minutes);
	
	
	log.info("Category page is scrolling successfully");
	
    
  }

@AfterTest
 public void teardown()
  {
	
	driver.close();	
  }
}
