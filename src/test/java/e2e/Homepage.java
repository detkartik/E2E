package e2e;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.LoginPage;
import resource.Base;
//import resource.ExcelDriven;

//import resource.ExcelDriven;



public class Homepage extends Base {

public static Logger log =LogManager.getLogger(Homepage.class.getName());

	
@BeforeTest
public void intialize() throws IOException
{
	driver = InitializeDriver();
 log.info("driver is initialized"); 
 
 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 driver.manage().deleteAllCookies();
 driver.manage().window().maximize();
 driver.get(prop.getProperty("url"));
	log.info("Navigated to Homepage");

}
	
	
@Test(dataProvider="getData")	
	
public void basePageNavigation(String Username,String Password, String Text) throws IOException
 {
	
	
	
	Landingpage LP = new Landingpage(driver);
	LoginPage login = new LoginPage(driver);
	
	LP.getLogin().click();
	
     login.getUsername().sendKeys(Username);
	login.getPassword().sendKeys(Password);
	login.Login().click();
	log.trace(Text);	
 }

@AfterTest
public void teardown()
{
  driver.close();	
}

/*@DataProvider
public Object[][] getData()
{
Object[][] data	= ExcelDriven.TestData("Login");
return data;
}*/


@DataProvider
public Object[][] getData(String username, String password, String Text) throws IOException
{
 
 Object[][] data = new Object[3][3];	
  //0th row 
  data[0][0]="kgautam@pfsweb.com";
  data[0][1]="India@123";
  data[0][2]="Restricted Text";
  //1st row 
  data[1][0]="dksingh@pfsweb.com";
  data[1][1]="India@123";
  data[1][2]="Restricted Text";
  
  data[2][0]="neelima@rev.com"; 
  data[2][1]="Jesuscom5";
  data[2][2]="successfully logged in";
		  return data;
 
 }

}
