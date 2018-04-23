package pageObjects;


//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Landingpage {

	public WebDriver driver;
	
	
	
	By signin = By.xpath("//span[@class='show-desktop']");
	By title  = By.xpath("(//img[@alt='Christopher & Banks'])[1]");
	By Menu   = By.xpath("//div[@class='mega-menu-content menu-content-border']");
    By MenuNav= By.xpath("//ul[@class=\"menu-category level-1\"]/li[1]");	
	By Subcat = By.xpath("//a[@href='https://dev.christopherandbanks.com/missy-4-16/dresses-and-skirts/']");
	By MenuBar= By.xpath("(//div[@class=\"level-2 megamenudrop\"])[1]");
	By headerbanner = By.xpath("//div[@class='header-banner desktoponly homepromo-banner']");   
	By Body   = By.xpath("//body[@itemtype='http://schema.org/WebPage']");
	By product= By.xpath("//img[@title=\"3/4 Sleeve Satin Trim Essential Tee\"]");
	By prodcolor = By.xpath("(//img[@alt=\"0126-WHITE\"])[1]");
	By prodsize = By.xpath("(//a[@class=\"swatchanchor size\"])[1]");
	By addtocart = By.xpath("//button[@id='add-to-cart']");
     By content = By.xpath("//div[@class='search-result-content']");
     By viewall = By.xpath("(//a[@class='all-links'])[1]");
    By viewallbottom = By.xpath("//div[@class='search-result-options viewAll-bottom']");
     
    
     
    By primarycontent = By.xpath("//div[@class='primary-content']");
	
	public Landingpage(WebDriver driver2) {
	
		// TODO Auto-generated constructor stub
	this.driver =driver2;
	
	
	}

	/*@FindBy(xpath="//span[@class='show-desktop']")
	WebElement signin;
	
	@FindBy(xpath="(//img[@alt='Christopher & Banks'])[1]")
	WebElement title;
	
	@FindBy(xpath="//div[@class='mega-menu-content menu-content-border']")
	WebElement Menu;
	*/
	
	
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
  
     public WebElement HeaderBanner()
     {
    	 return driver.findElement(headerbanner);
    	 
     }

     public  WebElement Wait()
     {
    	 WebDriverWait wait = new WebDriverWait(driver, 30);
         WebElement  element = wait.until(ExpectedConditions.visibilityOf(MenuBar()));
	return element;
     }
     
     public WebElement Body()
     {
  	   WebElement body = driver.findElement(Body);
  	   return body ;
       }

    public WebElement Product()
    {
    	WebElement prod = driver.findElement(product);
    	
    	return prod;
    }
    
    public WebElement Prodcolor()
 {
	 WebElement color = driver.findElement(prodcolor);
	 return color;
	 
	 }
  
    public WebElement Prodsize()
   {
     WebElement size = driver.findElement(prodsize);
     return size;
    }

    public WebElement addtocart()
    {
    	WebElement add2cart = driver.findElement(addtocart);
    	return add2cart; 	
    }

 public WebElement content()
 {
	 WebElement contents = driver.findElement(content);
	 return contents;
 }
 public WebElement viewallbottom()
 {
	 WebElement view = driver.findElement(viewallbottom);
	 return view;
	 
 }
 
 public  WebElement Wait2()
 {
	 WebDriverWait wait = new WebDriverWait(driver, 30);
     WebElement  element = wait.until(ExpectedConditions.visibilityOf(content()));
return element;
 }
 
public WebElement viewall()
{
	
 WebElement view = driver.findElement(viewall);
 return view;
}
public  WebElement Wait3()
{
	 WebDriverWait wait = new WebDriverWait(driver, 50);
    WebElement  element = wait.until(ExpectedConditions.visibilityOf(viewallbottom()));
return element;
}


 }

 


