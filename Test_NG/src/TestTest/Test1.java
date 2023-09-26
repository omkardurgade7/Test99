package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	
	   public static void main(String[] args) throws InterruptedException {
		
		   ChromeOptions Co=new ChromeOptions();
		   
		   WebDriver driver=new ChromeDriver(Co);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://demo.automationtesting.in/Register.html");
		   
		  driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")).click();
		  
		  WebElement english=driver.findElement(By.xpath("//a[text()='English']"));
		  Actions act=new Actions(driver);
		  
		  act.moveToElement(english).perform();
		  Thread.sleep(2000);
		  act.click().perform();
		   
	}
}
