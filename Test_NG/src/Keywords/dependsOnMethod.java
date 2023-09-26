package Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethod {
          
	@Test
	public void login()
	{
		Reporter.log("Login to app",true);
	}
	
	@Test(dependsOnMethods={"login"})
	public void logout()
	{
		Reporter.log("Logout from app",true);
	}
	
}
