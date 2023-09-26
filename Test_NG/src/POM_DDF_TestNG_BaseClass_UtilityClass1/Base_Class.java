package POM_DDF_TestNG_BaseClass_UtilityClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_Class {

	
	  public WebDriver driver;
	  
	  public void InitializeBrowser()
	  {
		  ChromeOptions CO=new ChromeOptions();
		  driver=new ChromeDriver(CO);
		  
		  driver.get("https://practicetestautomation.com/practice-test-login/");
		  
		  driver.manage().window().maximize();
		  
		  
	  }
	
}
