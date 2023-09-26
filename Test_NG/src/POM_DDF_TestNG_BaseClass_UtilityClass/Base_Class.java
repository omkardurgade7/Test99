package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base_Class {

	
	  public WebDriver driver;
	
	  public void initializeBrowser()
	  {
		
		  ChromeOptions CO=new ChromeOptions();
		  CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		  driver=new ChromeDriver(CO);
		  
		  //enter url
		  driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
		  
		  driver.manage().window().maximize(); 
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
	  }
}
