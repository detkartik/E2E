package e2e;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Patterns;
import resource.Base;




public class HomeContentTest extends Base {

public static Logger log =LogManager.getLogger(HomeContentTest.class.getName());

	
@BeforeTest
public void intialize() throws IOException
{

	driver = InitializeDriver();
    driver.manage().window().maximize(); 
	log.info("driver is initialized"); 
}
	
	

@Test
public void basePageNavigation() throws IOException, FindFailed
 {
	
	driver.get(prop.getProperty("url"));
	log.info("Navigated to Homepage");
	
	Patterns p = new Patterns();
	p.home.click(p, 5000);
   
	   
    
  //screen.click();   
		
 }

@AfterTest
public void teardown()
{
  driver.close();	
}

 
 }


