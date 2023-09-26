package Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Parallel2 {

	   
	@Test
    public void opensnapchat()
    {
   	      ChromeOptions CO=new ChromeOptions();
      	  WebDriver driver=new ChromeDriver(CO);
    	
      	  driver.get("https://accounts.snapchat.com/accounts/v2/login");
    	
    }
}
