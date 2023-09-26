package Compatibility_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C_T_1 {

	
	   @Parameters("browserName")
	   @Test
	   public void TC1(String browserName) throws InterruptedException
	   {
		   WebDriver driver=null;
		   
		   if(browserName.equals("Chrome"))
		   {
			   ChromeOptions CO=new ChromeOptions();
			   driver=new ChromeDriver(CO);	   
		   }
		   else if(browserName.equals("Firefox"))
		   {
			   driver=new FirefoxDriver();
		   }
		   else if(browserName.equals("Edge"))
		   {
			   driver=new EdgeDriver();
		   }
		   
		   driver.manage().window().maximize();
		   //to get url
		   driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		   
		   driver.manage().window().maximize();
			 
			 //wait
			 Thread.sleep(2000);
			 
		



			// Step-II:Enter Username
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Velocity");
			 
			//wait
			 Thread.sleep(2000); 
			 
			// Step-III: Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("U1YP1G"); 
			 
			//wait
			 Thread.sleep(2000); 
			 
			// Step-IV: Click Login Button
		driver.findElement(By.xpath("//input[@name='login']")).click(); 
			 
			//wait
			 Thread.sleep(2000); 

			//Step-V: Test Case: Verify Username	
		   String ExpectedUsername="Velocity!";
			
		  //Get Actual Username 
	String  S1=driver.findElement(By.xpath("//input[@name='username_show']")).
	getAttribute("value");  //Hello Velocity!
		      
		          String  A1[]=S1.split(" ");  //Hello[0]               // Velocity![1]
		
		                     String  Z1=A1[0];  //Hello
		                     String ActualUsername=A1[1];  // Velocity!

		                     //System.out.println(Z1); 
		                    // System.out.println(ActualUsername);
		                     
		             // Velocity!           // Velocity!
		        if(ExpectedUsername.equals(ActualUsername)) //true  //false
		        {
		        	System.out.println("Pass");
		        }             
		        else 
		        {
		        	System.out.println("Fail");
		        }   
	         
		Thread.sleep(1000);  
	 
		  driver.quit();
		        
		}

	   
}
