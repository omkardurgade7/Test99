package Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Parallel3 {

	    @Test
	    public void openinstagram()
	    {
	    	 ChromeOptions CO=new ChromeOptions();
	      	  WebDriver driver=new ChromeDriver(CO);
	    	
	      	  driver.get("https://www.instagram.com/accounts/login/");
	    	
	    }
}
