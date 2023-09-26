package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login_Page {
	          //POM Class-I
	/*1. Data members/Global Variables should be declared globally with access 
	   level private by using @Findby Annotation */	
	  @FindBy(xpath="//input[@id='username']") private WebElement UN;
	  @FindBy(xpath="//input[@name='password']") private WebElement PSW;
	  @FindBy(xpath="//input[@type='Submit']")   private WebElement LoginBTN;
	  
	  
	  /*2. Initialize within a constructor with access level public 
	  using PageFactory Class  */
	  Adactin_Login_Page(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
	  //3. Utilize within a method with access level public
	  public void enterUsername(String User)
	  {
		  UN.sendKeys(User);
	  }
	  
	  public void enterPassword(String Pass)
	  {
		  PSW.sendKeys(Pass);
	  }
	  
	  public void clickLogin()
	  {
		  LoginBTN.click();
	  }
	  
	  
}
