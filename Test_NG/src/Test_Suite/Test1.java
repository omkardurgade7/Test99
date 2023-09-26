package Test_Suite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	
	
	   @Test
	   public void  TC1()
	   {
		   Reporter.log("Run TC1",true);
	   }
	   
	   @Test
	   public void  TC2()
	   {
		   Reporter.log("Run TC2",true);
	   }
}
