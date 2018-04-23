package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class HoverElements {

	public WebDriver driver;
	
	
	
   By signin  = By.xpath("//span[@class='show-desktop']");
   By title  =  By.xpath("(//img[@alt='Christopher & Banks'])[1]");
   By Menu   =   By.xpath("//div[@class='mega-menu-content menu-content-border']");
   By MenuNav = By.xpath("//ul[@class='menu-category level-1']/li[1]");	
   By Subcat  =  By.xpath("//a[@href='https://dev.christopherandbanks.com/missy-4-16/dresses-and-skirts/']");
   By sizeref = By.xpath("(//span[@class='text-width'])[1]");
   By refsize = By.xpath("(//span[@class='refsize-value'])[1]"); 	
   By prodcolor = By.xpath("(//img[@alt=\"0126-WHITE\"])[1]");
   By prodsize = By.xpath("(//a[@class=\"swatchanchor size\"])[1]");
   By addtocart = By.xpath("//button[@id='add-to-cart']");
   By pagination = By.xpath("(//a[@class=\"page-4\"])[1]");
   By viewall = By.xpath("(//a[@class='all-links'])[1]");
   
   public HoverElements(WebDriver driver2) {
	
		// TODO Auto-generated constructor stub
	this.driver =driver2;
	
	}

	public  Actions HoverLogin()
	{
		Actions action = new Actions(driver);    
		return action.moveToElement(driver.findElement(signin));

	}
	
	
   

   public  Actions HoverMenu()
   {
	   Actions action = new Actions(driver);
	   return  action.moveToElement(driver.findElement(MenuNav));
		   
	 }

   
   


public Actions HoverSubCat()
   {
	Actions action = new Actions(driver);
	   return action.moveToElement(driver.findElement(Subcat));   
   	   
   }
   
public Actions HoverRefinement()
{ 
	Actions action = new Actions(driver);
	return action.moveToElement(driver.findElement(sizeref));
	}
public Actions Selectsize()
{
	Actions action = new Actions(driver);
	return action.moveToElement(driver.findElement(refsize));
  }

public Actions prodcolor()
{
  Actions action = new Actions(driver);
  return action.moveToElement(driver.findElement(prodcolor));
 }

public Actions prodsize()
{
  Actions action = new Actions(driver);
  return action.moveToElement(driver.findElement(prodsize));
 }
public Actions addtocart()
{
  Actions action = new Actions(driver);
  return action.moveToElement(driver.findElement(addtocart));
 }


public Actions pagination()
{
	  Actions action = new Actions(driver);
	  return action.moveToElement(driver.findElement(pagination));
	}

public Actions viewall()
{
	  Actions action = new Actions(driver);
	  return action.moveToElement(driver.findElement(viewall));

}


}
