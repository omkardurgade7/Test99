package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 {

	    @BeforeClass
	    public void OpenBrowser()
	    {
	    	Reporter.log("Open Browser",true);
	    }
	    @BeforeMethod
	    public void LoginToApp()
	    {
	    	Reporter.log("Login",true);
	    }
	    @Test
	    public void SearchHotel()
	    {
	    	Reporter.log("TC1 Search Hotels",true);
	    }
	    @AfterMethod
	    public void LogOutFromApp()
	    {
	    	Reporter.log("Logout",true);
	    }
	    @AfterClass
	    public void CloseBrowser()
	    {
	    	Reporter.log("Close Browser",true);
	    }
}
