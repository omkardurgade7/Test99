package POM_DDF_TestNG_BaseClass_UtilityClass2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Registration_Page {
public WebDriver driver;
	   @FindBy(xpath="//input[@ng-model='FirstName']") private WebElement FirstName;
	   @FindBy(xpath="//input[@ng-model='LastName']") private WebElement LastName;
	   @FindBy(xpath="//textarea[@rows='3']") private WebElement Address;
	   @FindBy(xpath="//input[@type='email']") private WebElement Email;
	   @FindBy(xpath="//input[@type='tel']") private WebElement Phone;
	   @FindBy(xpath="//input[@value='Male']") private WebElement Gender;
	   @FindBy(xpath="//input[@value='Cricket']") private WebElement Hobbies1;
	   @FindBy(xpath="//input[@value='Movies']") private WebElement Hobbies2;
	 //  @FindBy(xpath="//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']") private WebElement Language;
	   @FindBy(xpath="//select[@id='Skills']") private WebElement Skills;
	   //@FindBy(xpath="//select[@ng-model='country']") private WebElement Country;
	   @FindBy(xpath="//*[@class='select2-selection select2-selection--single']") private WebElement SelectCountry;
	   @FindBy(xpath="//select[@ng-model='yearbox']") private WebElement Year;
	   @FindBy(xpath="//select[@ng-model='monthbox']") private WebElement Month;
	   @FindBy(xpath="//select[@ng-model='daybox']") private WebElement Day;
	   @FindBy(xpath="//input[@id='firstpassword']") private WebElement Password;
	   @FindBy(xpath="//input[@id='secondpassword']") private WebElement ConfirmPassword;
	   @FindBy(xpath="//button[@name='signup']") private WebElement Submit;
	   
	    Registration_Page(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	    public void enterfn(String un)
	    {
	    	FirstName.sendKeys(un);
	    }   
	   public void enterln(String ps)
	   {
		  LastName.sendKeys(ps); 
	   }	   
	   public void enteraddress(String ad)
	   {
		   Address.sendKeys(ad); 
	   }	   
	   public void enteremail(String mail)
	   {
		 Email.sendKeys(mail);  
	   }	   
	   public void enterphone(String phn)
	   {
		 Phone.sendKeys(phn);  
	   }   
	   public void selectgender()
	   {
		   Reporter.log("Click gender",true);
		 Gender.click();
	   }	   
	   public void selecthobbies1()
	   {
		   Hobbies1.click();
	   }	   
	   public void selecthobbies2()
	   {
		   Hobbies2.click();
	   }	   
	  /* public void enterlangauge() throws InterruptedException
	   {
		 //  Reporter.log("Enter langauage",true);
		   Language.click();
		  WebElement english=driver.findElement(By.xpath("(//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']//li)[8]"));
		   
		  //WebElement english=driver.findElement(By.xpath("//a[text()='English']"));
			  Actions act=new Actions(driver);
			  
			  act.moveToElement(english).perform();
			  Thread.sleep(2000);
			  
			 // act.click().perform();  
	   }  */
	   
	   public void selectskills()
	   {
		  Select skilll=new Select(Skills);	  
		  skilll.selectByVisibleText("Engineering");		  
	   } 
	 /*  public void selectCountry()
	   {
		   Select cntry=new Select(Country);
		   cntry.selectByVisibleText("Select Country");
	   }   */
	   public void selectCountry2() throws InterruptedException
	   {
		   SelectCountry.click();
		   Thread.sleep(500);
		   
		  /* driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("india");
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
	   public void selectyear()
	   {
		   Select yr=new Select(Year);
		   yr.selectByVisibleText("1999");
	   }  
	   public void selectmonth()
	   {
		   Select mnt=new Select(Month);
		   mnt.selectByVisibleText("September");
	   } 
	   public void selectday()
	   {
		   Select dy=new Select(Day);
		   dy.selectByVisibleText("30"); 
	   }  
	   public void enterpassword(String psps)
	   {
		   Password.sendKeys(psps);
	   }	   
	   public void confirmpassword(String cp)
	   {
		  ConfirmPassword.sendKeys(cp); 
	   }	   
	 /*  public void clicksubmit()
	   {
		 Submit.click();  
	   }  */
	   
}
