package Okay;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 extends Test4 {

	public WebDriver driver;
	
		Test1 Login;
		Test2 Home;
		@BeforeClass
		public void OpenBrowser() 
		{
			InitilizeBrowser();
			//Create Object Of POM-I
			Login=new Test1(driver);
			//Create Object Of POM-II
			Home=new Test2(driver);
		}
		@BeforeMethod
		public void LoginToAPP() throws IOException 
		{
			//Enter UN-->PF
			Login.enterUsername(Test5.getDataFromPF("UserName"));  //Velocity
			//Enter PSW-->PF
			Login.enterPassword(Test5.getDataFromPF("Password"));   //U1YP1G 
			//Click Login Button
			Login.clickloginbutton();
		}
		@Test                          //Test Method/case
		public void SearchHotel() 
		{
			Reporter.log("Running Method TC1: Search Hotel", true);
		}
		@AfterMethod
		public void LogoutFromApp() 
		{
			Reporter.log("Logout from App", true);
		}
		@AfterClass
		public void CloseBrowser() 
		{
			Reporter.log("Close Browser", true);
		}
}
