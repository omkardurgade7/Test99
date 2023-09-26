package Keywords2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCount {

	
	
	  @Test
	  public void TC1()
	  {
		  Reporter.log("SignIn",true);
	  }
	  @Test(invocationCount=4)
	  public void TC2()
	  {
		  Reporter.log("Login",true);
	  }
	  @Test
	  public void TC3()
	  {
		  Reporter.log("Logout",true);
	  }
}
