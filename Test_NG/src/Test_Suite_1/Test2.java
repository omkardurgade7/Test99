package Test_Suite_1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {

	
	@Test
	   public void  TC3()
	   {
		Assert.fail();     //this tc will fail but after fic it we run by include saperately
		   Reporter.log("Run TC3",true);
	   }
	
	@Test
	   public void  TC4()
	   {
		   Reporter.log("Run TC4",true);
	   }
}
