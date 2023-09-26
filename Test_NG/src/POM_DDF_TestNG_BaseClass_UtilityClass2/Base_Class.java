package POM_DDF_TestNG_BaseClass_UtilityClass2;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_Class {

	
	    public WebDriver driver;
	    
	    public void initializeBrowser()
	    {
	    	ChromeOptions CO=new ChromeOptions();
	    	driver=new ChromeDriver(CO);
	    	
	    	driver.get("https://demo.automationtesting.in/Register.html");
	    	
	    	driver.manage().window().maximize();
	    	
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	
	    }
}
