package Compatibility_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C_T_3 {

	
	  @Parameters("BrowserName")
	  @Test
	  public void TC1(String BrowserName) throws InterruptedException
	  {
		  WebDriver driver=null;
		  
		  if(BrowserName.equals("Firefox"))
		  {
			  driver=new FirefoxDriver();
		  }
		  else if(BrowserName.equals("Edge"))
		  {
			  driver=new EdgeDriver();
		  }
		  else if(BrowserName.equals("Chrome"))
		  {
			  driver=new ChromeDriver();
		  }
		  
			 driver.manage().window().maximize();
			 
			 driver.get("https://parabank.parasoft.com/parabank/index.htm");
			 
			 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("John_Cena");
			 
			 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("John@123");
			 
			 driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
			 
			 String expamount="$1000.00";
			 String actamount=driver.findElement(By.xpath("//b[text()='$1000.00']")).getText();
			 
			 if(expamount.equals(actamount))
			 {
				 System.out.println("Pass");
			 }
			 else
			 {
				 System.out.println("Fail");
			 }	 
				 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//a[text()='Log Out']")).click();
			 
			 Thread.sleep(2000);
			 driver.quit();

	  }
}
