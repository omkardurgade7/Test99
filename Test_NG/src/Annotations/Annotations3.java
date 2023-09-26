package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 {

	   
	 @BeforeClass
	  public void OpenBrowser()
	  {
		  Reporter.log("Open Browser",true);
	  }
	  @BeforeMethod
	  public void Login()
	  {
		  Reporter.log("Login",true);
	  }
	  @Test
	  public void FetchAmount()
	  {
		  Reporter.log("TC3 Fetch Amount",true);
	  }
	  @Test
	  public void ChangePassword()
	  {
		  Reporter.log("TC1 Change Password",true);
	  }
	  @Test
	  public void SearchHotel()
	  {
		  Reporter.log("TC2 Search Hotels",true);
	  }
	  @AfterMethod
	  public void Logout()
	  {
		  Reporter.log("LogOut",true);
	  }
	  @AfterClass
	  public void CloseBrowser()
	  {
		  Reporter.log("Close Browser",true);
	  }
}
