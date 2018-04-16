package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class HoverElements {

	public WebDriver driver;
	Actions action = new Actions(driver);
	
	
   By signin  = By.xpath("//span[@class='show-desktop']");
   By title  =  By.xpath("(//img[@alt='Christopher & Banks'])[1]");
   By Menu  =   By.xpath("//div[@class='mega-menu-content menu-content-border']");
   By MenuNav = By.xpath("(//ul[@class='menu-category level-1']/li)[1]");	
   By Subcat =  By.xpath("//a[@href='https://dev.christopherandbanks.com/missy-4-16/dresses-and-skirts/']");
       
	
	
	
	public HoverElements(WebDriver driver2) {
	
		// TODO Auto-generated constructor stub
	this.driver =driver2;
	}

	public  Actions HoverLogin()
	{
	    
		return action.moveToElement(driver.findElement(signin));

	}
	
	
   

   public  Actions HoverMenu()
   {
	   
	   return action.moveToElement(driver.findElement(MenuNav));
			   
	 }

   
   


public Actions HoverSubCat()
   {
	   return action.moveToElement(driver.findElement(Subcat));   
   	   
   }
   
}
