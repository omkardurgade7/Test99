package Compatibility_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C_T_2 {

	  
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
		else if(browserName.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	
		WebElement username=driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));
		username.sendKeys("Rocky");
		
		username.clear();

		username.sendKeys("Rocky Bhai");
		
		
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input"));
		password.sendKeys("Admin@123");

		password.clear();
		password.sendKeys("Rocky@123");
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]"));
		firstname.sendKeys("Rock");
		
		firstname.clear();

		firstname.sendKeys("Rocky");
		
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]"));
		
		lastname.sendKeys("Bhoi");
		
		lastname.clear();
		
		lastname.sendKeys("bhai");
		
		driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("Gali no.420, Lokhandwala");
		
		
		driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Mumbai");
		
		driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("Maharashtra");
		
		driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("400053");
		
		driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("AAA-GG-SSSS");
		
		driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("Rocky_Bhai");
		
		driver.findElement(By.xpath("//input[@name='customer.password']")).sendKeys("Rocky@12345");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("Rocky@12345");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		String expecteddefect="Password confirmation is required.";
		String actualdefect=driver.findElement(By.xpath("//span[text()='Password confirmation is required.']")).getText();
		
		if(expecteddefect.equals(actualdefect))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}	
}
