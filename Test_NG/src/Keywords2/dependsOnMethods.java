package Keywords2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods {

	  
	@Test
	public void signin()
	{
		Reporter.log("SignIn",true);
	}
	@Test(dependsOnMethods= {"signin"})
	public void login()
	{
		Reporter.log("login",true);
	}
	
	
	
}
