package Compatibility_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C_T_P_1 {
	@Parameters("BrowserName")
	@Test
	public void TC01(String BrowserName)
	{
	   WebDriver driver=null;
	   
	   if(BrowserName.equals("Chrome"))
	   {
		   ChromeOptions CO=new ChromeOptions();
		   driver=new ChromeDriver(CO);
	   }
	   else if(BrowserName.equals("Firefox"))
	   {
		   driver=new FirefoxDriver();
	   }
	   else if(BrowserName.equals("Edge"))
	   {
		   driver=new EdgeDriver();
	   }
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://practicetestautomation.com/practice-test-login/");
	   
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
	   
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
	   
	   driver.findElement(By.xpath("//button[text()='Submit']")).click();
	   
	   //verify
	   
	   String expectedresult="Congratulations student. You successfully logged in!";
	   
	   String actualresult=driver.findElement(By.xpath("//strong[text()='Congratulations student. You successfully logged in!']")).getText();
	   
	   if(expectedresult.equals(actualresult))
	   {
		   System.out.println("Pass");
	   }
	   else
	   {
		   System.out.println("Fail");
	   }
	   
	   driver.quit();
   	   }
	
	   
}
