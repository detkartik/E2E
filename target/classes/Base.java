package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



	public class Base {
		
		public static WebDriver driver;
		
		public Properties prop = new Properties();
		
		

		
		public WebDriver InitializeDriver() throws IOException
		{
			
			FileInputStream file = new FileInputStream("C:\\Users\\kgautam\\E2E\\src\\main\\java\\data.properties");
		
			prop.load(file);
			String browserName = prop.getProperty("browser");
			System.out.println(browserName);
		   				
	/*--------------------------------------------------Browsers-----------------------------------------------------------------*/
			if(browserName.equals("chrome"))
			{
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\kgautam\\E2E\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
				
				driver = new ChromeDriver();
				
			}
			else if(browserName.equals("firefox"))  
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\kgautam\\E2E\\BrowserDriver\\geckodriver-v0.20.0-win64 (1)\\geckodriver.exe");

				driver = new FirefoxDriver(); 
			}
			
			else if(browserName.equals("IE"))
			{
				System.setProperty("webdriver.ie.driver" ,"C:\\Users\\kgautam\\E2E\\BrowserDriver\\IEDriverServer_x64_3.9.0 (1)\\IEDriverServer.exe");		
				 driver = new InternetExplorerDriver();
			}
			
				
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 		
			return driver;
	
		}
	
    /*---------------------------------------------Screenshot capture ---------------------------------------------------------------------------*/
		public void getScreenshot(String result) throws IOException
		{
			int i=1;
			i++;
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kgautam\\E2E\\Screenshots\\screenshot"+result+"\\screenshot"+i +".png");
		
		FileUtils.copyFile(source,destination);
			
		}

	

		
		
	}


	
	
