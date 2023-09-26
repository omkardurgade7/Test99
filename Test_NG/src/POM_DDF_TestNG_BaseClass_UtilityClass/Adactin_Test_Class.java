package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
                       
public class Adactin_Test_Class extends Base_Class {
	
    
	 Adactin_Login_Page login;
	 Adactin_Welcome_Page home;
	 String TestCaseID;
	 
	 @BeforeClass
	 public void openbrowser()
	 {
		 initializeBrowser();
		 
		 login=new Adactin_Login_Page(driver);
		 
	
		 home=new Adactin_Welcome_Page(driver);
	 }
	 
	 @BeforeMethod
	 public void logintoApp() throws IOException
	 {
		 //enter username > PF
		 login.enterUsername(Utility_Class.getDataFromPF("UserName"));
		//enter username > PF
		 login.enterPassword(Utility_Class.getDataFromPF("Password"));
		 //click login
		 login.clickLogin(); 
	 }
	 
	 @Test      //TC
	 public void verifyUsername() throws EncryptedDocumentException, IOException
	 {
		 //ActualUSername
		 String ActualUsername=home.getUsername();
		 String ExpectedUsername=Utility_Class.getDataFromExcel(0, 0);
		 
		 Assert.assertEquals(ActualUsername, ExpectedUsername);
	 }
	 
	 @Test(priority=1)
	 public void getTitleOfApp() throws EncryptedDocumentException, IOException
	 {
		 String actualTitle=driver.getTitle();
		 
		 String ExpectedTitle=Utility_Class.getTitleOfAppFromExcel(1, 0);
				 
				 Assert.assertEquals(actualTitle, ExpectedTitle);
	 }
	 
	 @AfterMethod
	 public void logoutFromApp(ITestResult Result) throws IOException
	 {
		 if(Result.getStatus()==ITestResult.FAILURE)
		 {
			 Utility_Class.captureScreenshot(driver, TestCaseID);
		 }
	     home.clicklogoutbutton();
	     home.loginagain();
	 }
	 
	 @AfterClass
	 public void closebrowser()
	 {
		 driver.quit();
	 }   
}
