package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Welcome_Page {
	//POM Class-II
		/* 1. Data members/Global Variables should be declared globally with access level 
	       private by using @Findby Annotation  */
	
	  @FindBy(xpath="//input[@value='Hello Omkar12345!']")  private WebElement UserShow;
	  @FindBy(xpath="//a[text()='Logout']")  private WebElement LogOutBTN;
	  @FindBy(xpath="//a[text()='Click here to login again']")  private WebElement LoginAgain;
	  
	  //2. Initialize within a constructor with access level public using PageFactory Class
	  Adactin_Welcome_Page(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  
	//3. Utilize within a method with access level public
	  public String getUsername()
	  {
		  String s1=UserShow.getAttribute("value");  //Hello  //Velocity!
		  
		  String a1[]=s1.split(" ");
		  
		  String z1=a1[0];
		  String ActualUN=a1[1];
		  
		  return ActualUN;
	  }
	
	  public void clicklogoutbutton()
	  {
		 LogOutBTN.click(); 
	  }
	  
	  public void loginagain()
	  {
		  LoginAgain.click();
	  }
	
	  
	  
	  
}
