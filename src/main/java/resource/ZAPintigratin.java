package resource;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ZAPintigratin extends Base {
	
	Base b = new Base();

	public void setUp() throws Exception {
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("localhost:8090");
        proxy.setFtpProxy("localhost:8090");
        proxy.setSslProxy("localhost:8090");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, proxy);
        
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
        driver = new FirefoxDriver(firefoxOptions);
        this.setUp();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
	
	
	public DesiredCapabilities getDesiredCapabilities() {
	String browser = b.prop.getProperty("browser");
	
		DesiredCapabilities desiredCapabilities;
		   if ("firefox".equals(browser)) {
		      desiredCapabilities = DesiredCapabilities.firefox();
		      desiredCapabilities.setCapability(FirefoxDriver.PROFILE, true);

		   } else if ("chrome".equals(browser)) {
		      desiredCapabilities = DesiredCapabilities.chrome();
		    //  desiredCapabilities.setVersion(browserVersion);
		      desiredCapabilities.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));

		   } else if ("internetexplorer".equals(browser)) {
		      desiredCapabilities = DesiredCapabilities.internetExplorer();

		   } else {
		      throw new IllegalArgumentException(browser + " not supported");
		   }
		   
		    
		   desiredCapabilities.setCapability(CapabilityType.PROXY, createProxy());
		   desiredCapabilities.setPlatform(desiredCapabilities.getPlatform());
		   return desiredCapabilities;
		}

		public Proxy createProxy() {
			String httpProxy = b.prop.getProperty("httpProxy");
			return new Proxy().setHttpProxy(httpProxy);
		}


}
