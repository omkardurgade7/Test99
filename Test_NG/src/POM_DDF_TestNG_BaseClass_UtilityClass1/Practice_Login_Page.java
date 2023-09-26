package POM_DDF_TestNG_BaseClass_UtilityClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practice_Login_Page {

	
	 @FindBy(xpath="//input[@id='username']") private WebElement UN;
	 @FindBy(xpath="//input[@id='password']") private WebElement PSW;
	 @FindBy(xpath="//button[@id='submit']") private WebElement LOGINclk;
	 
	 Practice_Login_Page(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	  
	public void enterusername(String user)
	{
		UN.sendKeys(user);
	}
	
	public void enterpassword(String pass)
	{
		PSW.sendKeys(pass);
	}
	
	public void clicklogin()
	{
		LOGINclk.click();
	}
	  
}
