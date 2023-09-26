package POM_DDF_TestNG_BaseClass_UtilityClass1;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice_Test extends Base_Class {

	 Practice_Login_Page login;
	@BeforeClass
	public void OpenBrowser()
	{
		InitializeBrowser();
		
		login=new Practice_Login_Page(driver);
	}
	
	@BeforeMethod
	public void logintopage() throws IOException
	{
		login.enterusername(Utility_Class.getdatafromPF("USERNAME"));
		login.enterpassword(Utility_Class.getdatafromPF("PASSWORD"));
		login.clicklogin();
	}
	@Test
	public void veify()
	{
		Reporter.log("Okay",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@AfterClass
	public void close()
	{
		Reporter.log("close",true);
	}
	
}
