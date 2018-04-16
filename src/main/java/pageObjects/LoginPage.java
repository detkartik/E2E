package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public WebDriver driver;
	
	By username = By.xpath("//input[@class='input-text email required'][@data-emailcapturepoint='Account Log-in']");
	By password = By.xpath(" (//input[@class='input-text password required'])[2]");
	By submit = By.xpath("//button[@class='spc-login-btn']");
	
	public LoginPage(WebDriver driver2) {
	
		// TODO Auto-generated constructor stub
	this.driver =driver2;
	
	}

	public  WebElement getUsername()
	{
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.presenceOfElementLocated(username)); 
		return driver.findElement(username);
	   }

   public WebElement getPassword()
   {
	    
	  return driver.findElement(password);
	   
   }

   public WebElement Login()
   {
	   return driver.findElement(submit);
	   
   }
   
   
}  
