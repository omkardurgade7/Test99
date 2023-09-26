package POM_DDF_TestNG_BaseClass_UtilityClass2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class extends Base_Class {

	// public WebDriver driver;
	  
	  Registration_Page regPage;
	  String TCID;
	  
	  @BeforeClass
	  public void OpenBrowser()
	  {
		  initializeBrowser();
		  
		   regPage=new Registration_Page(driver);
	  }
	  
	  @BeforeMethod
	  public void Login()
	  {
		Reporter.log("login",true);  
	  }
	  
	  @Test 
	  public void Registration() throws EncryptedDocumentException, IOException, InterruptedException 
	  {   
		  regPage.enterfn(Utility_Class.getDataFromExcelSheet(0, 1));
 		  regPage.enterln(Utility_Class.getDataFromExcelSheet(1, 1));
 		  regPage.enteraddress(Utility_Class.getDataFromExcelSheet(2, 1));
 		  regPage.enteremail(Utility_Class.getDataFromExcelSheet(3, 1));
 		  regPage.enterphone(Utility_Class.getDataFromExcelSheet(4, 1));
		 
		  regPage.selectgender();
 		  regPage.selecthobbies1();
 		  regPage.selecthobbies2();
 		  //regPage.enterlangauge();
		  regPage.selectskills();
 		  //regPage.selectCountry();
		  regPage.selectCountry2();
 		  regPage.selectyear();
 		  regPage.selectmonth();
 		  regPage.selectday();
 		  regPage.enterpassword(Utility_Class.getDataFromExcelSheet(6, 1));
 		  regPage.confirmpassword(Utility_Class.getDataFromExcelSheet(7, 1));
		  // regPage.clicksubmit();
	  }
	  
	  @AfterMethod
	  public void Logout(ITestResult Result) throws IOException
	  {
		  if(Result.getStatus()==ITestResult.FAILURE)
		  {
			  Utility_Class.getss(driver, TCID);
		  }
		  Reporter.log("logout",true);  
	  }
	  
	  @AfterClass
	  public void CloseBrowser()
	  {
		  Reporter.log("close",true); 	
		  driver.close();
	  }
	  
}
