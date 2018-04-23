package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sikuli.script.FindFailed;
import pageObjects.Landingpage;
import pageObjects.Patterns;
import resource.Base;


public class UITest extends Base {

	
	public static Logger log =LogManager.getLogger(UITest.class.getName());
	
	
@BeforeTest
   public void intialize() throws IOException
	{

	driver = InitializeDriver();
	log.info("driver is initialized"); 
		
	 }	
	
@Test(priority = 2)
public void CategoryUI() throws IOException, FindFailed
  {
	driver.get(prop.getProperty("url"));
	Landingpage l = new Landingpage(driver);
	Patterns p = new Patterns();
	p.pattern2();
	    
	    String text = l.MenuNav().getText();
	    System.out.println(text);
	
	    String color = l.MenuNav().getCssValue("color").trim();
	    System.out.println(color);
	   
	    String fontsize = l.MenuNav().getCssValue("font-size").trim();
	    System.out.println("font size"+""+fontsize);
	   
	    String fontweight = l.MenuNav().getCssValue("font-weight").trim();
	    System.out.println("font weight"+""+fontweight);
  }

@Test (priority = 1)
public void SiteTitle() throws FindFailed
{
	driver.get(prop.getProperty("url"));

	    Landingpage l = new Landingpage(driver);
	    Patterns p = new Patterns();
		p.pattern1();    
	   String width = l.getTitle().getCssValue("max-width").trim();
	   System.out.println(width);
	   
	   String color = l.getTitle().getCssValue("color").trim();
	   System.out.println("color"+""+color);
	   
	   String fontsize = l.getTitle().getCssValue("font-size").trim();
	   System.out.println("font size"+""+fontsize);
	   }
@Test (priority =3)
public void HeaderBanner() throws FindFailed 
{
	driver.get(prop.getProperty("url"));
	Landingpage l = new Landingpage(driver);
    Patterns p = new Patterns();
	p.pattern3();  
	String bgcolor = l.HeaderBanner().getCssValue("background-color").trim();
	 System.out.println(bgcolor);


}

@AfterTest
 public void teardown()
  {
    driver.close();	
  }

}
