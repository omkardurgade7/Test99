package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class normal_class {

	
	  @Test
	    public void openfacebok()
	    {
	    	ChromeOptions CO=new ChromeOptions();
	    	WebDriver driver=new ChromeDriver(CO);
	    	
	    	driver.manage().window().maximize();
	    	//Thread.sleep(2000);
	    	
	    	driver.get("https://www.facebook.com/");
	    	
	    	
	    }
}
