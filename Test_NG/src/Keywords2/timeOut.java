package Keywords2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOut {

	
	   @Test
	   public void TC1()
	   {
		   Reporter.log("tc1",true);
	   }
	   @Test
	   public void TC2()
	   {
		   Reporter.log("tc2",true);
	   }
	   @Test(timeOut=6000)
	   public void TC3()
	   {
		   Reporter.log("tc3",true);
	   }
}
