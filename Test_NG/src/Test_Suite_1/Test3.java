package Test_Suite_1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {

	
	@Test
	   public void  TC5()
	   {
		   Reporter.log("Run TC5",true);
	   }
	@Test
	   public void  TC6()
	   {
		Assert.fail();   //this tc will fail but after fic it we run by include saperately
		   Reporter.log("Run TC6",true);
	   }
}
