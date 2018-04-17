package pageObjects;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class  Patterns {

		

	public  Screen home= new Screen();
	 
	  Pattern pattern1 = new Pattern("C:\\Users\\kgautam\\E2E\\ApplicationImages\\Sitetitle.PNG");
	  Pattern pattern2 = new Pattern("C:\\Users\\kgautam\\E2E\\ApplicationImages\\categorynav.PNG");
	  Pattern pattern3 = new Pattern("C:\\Users\\kgautam\\E2E\\ApplicationImages\\HeaderBar.PNG");
	  Pattern pattern4 = new Pattern("C:\\Users\\kgautam\\E2E\\ApplicationImages\\Login-logo.PNG");
	  Pattern pattern5 = new Pattern("C:\\Users\\kgautam\\E2E\\ApplicationImages\\Login-logo.PNG");
	  Pattern pattern6 = new Pattern("C:\\Users\\kgautam\\E2E\\ApplicationImages\\minicart logo.PNG");
	  Pattern pattern7 = new Pattern("C:\\Users\\kgautam\\E2E\\ApplicationImages\\storelogo.PNG"); 
	  
	   	 
	   public void pattern1() throws FindFailed
	   {
		   home.wait(pattern1,5000);
		   home.hover(pattern1);   
	   }

	   public void pattern2() throws FindFailed
	   {
		   home.wait(pattern2,5000);
		   home.hover(pattern2);   
	   }
	  
	   public void pattern3() throws FindFailed
	   {
		   home.wait(pattern3,5000);
		   home.click(pattern3);   
	   }
	   public void pattern4() throws FindFailed
	   {
		   home.wait(pattern4,5000);
		   home.click(pattern4);   
	   }

	   public void pattern5() throws FindFailed
	   {
		   home.wait(pattern5,5000);
		   home.click(pattern5);   
	   }
	   public void pattern6() throws FindFailed
	   {
		   home.wait(pattern6,5000);
		   home.click(pattern6);   
	   }
	   public void pattern7() throws FindFailed
	   {
		   home.wait(pattern7,5000);
		   home.click(pattern7);   
	   }
}
	 