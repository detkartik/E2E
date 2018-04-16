package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverTest {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kgautam\\E2E\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.christopherandbanks.com/");
		Actions a = new Actions(driver);
	WebElement subcat = driver.findElement(By.xpath("//a[@href='https://dev.christopherandbanks.com/missy-4-16/dresses-and-skirts/']"));
		
		a.moveToElement(subcat).build().perform();
		
	}
	
}
