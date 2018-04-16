package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Landingpage {

	public WebDriver driver;
	By signin = By.xpath("//span[@class='show-desktop']");
	By title =  By.xpath("(//img[@alt='Christopher & Banks'])[1]");
	By Menu =   By.xpath("//div[@class='mega-menu-content menu-content-border']");
    By MenuNav = By.xpath("(//a[@class='has-sub-menu'])[1]");	
	By Subcat = By.xpath("//a[@href='https://dev.christopherandbanks.com/missy-4-16/dresses-and-skirts/']");
	By MenuBar = By.xpath("//div[@class='level-2 megamenudrop']");
       
    public Landingpage(WebDriver driver2) {
	
		// TODO Auto-generated constructor stub
	this.driver =driver2;
	
	
	}

	public  WebElement getLogin()
	{
		
		return driver.findElement(signin);
	}
	
	public  WebElement getTitle()
	{
	    
		return driver.findElement(title);
	}

   public WebElement getNav()
   {
	   return driver.findElement(Menu);
	   
   }

   public WebElement MenuNav()
   {
	  return driver.findElement(MenuNav);
	 }

   public WebElement MenuBar()
   {
	   return driver.findElement(MenuBar);
	   
   }
   
   
   public WebElement SubCatNav()
   {
	  return driver.findElement(Subcat);   
   	   
   }
   
}
