package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {

	
	   @Test
	   public void TC01()
	   {
		   Reporter.log("Running TC01", true);
	   }
	   @Test
	   public void TC02()
	   {
		   Reporter.log("Running TC02", true);
	   }
	   @Test
	   public void TC03()
	   {
		   Reporter.log("Running TC03", false);	  
	   }
	   @Test
	   public void TC04()
	   {
		   Reporter.log("Running TC04");
	   }
	   @Test
	   public void TC05()
	   {
		   System.out.println("Runnig TC05");
	   }
}
