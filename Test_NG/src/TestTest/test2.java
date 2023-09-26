package TestTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test2 {

	
	 public static void main(String[] args) throws InterruptedException {
		
		 ChromeOptions CO=new ChromeOptions();
	    	WebDriver driver=new ChromeDriver(CO);
	    	
	    	driver.get("https://demo.automationtesting.in/Register.html");
	    	
	    	driver.manage().window().maximize();
	    		    	
	    	driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--single']")).click();
	    	 Thread.sleep(500);
	    /*driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("india");
	    	 Thread.sleep(500);
	    	List<WebElement> options=driver.findElements(By.xpath("//*[@id='select2-country-results']//li"));
	    	
	    	for(WebElement ctry:options)
	    	{ Thread.sleep(500);
	    		String text=ctry.getText();
	    		
	    		if(text.equals("India"))
	    		{
	    			ctry.click();
	    			break;
	    		}
	    	} */
	    	 
	    	 WebElement mouse=driver.findElement(By.xpath("//li[text()='India']"));
	    	 
	    	 Actions act=new Actions(driver);
	    
	          act.moveToElement(mouse).perform();
	          
	          act.click().perform();
	          
	          
	    		}
}
