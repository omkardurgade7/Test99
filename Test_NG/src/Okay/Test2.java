package Okay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test2 {

	
	//POM Class-II
		//1. Data members/Global Variables should be declared globally with access level private by using @Findby Annotation
		@FindBy(xpath="//input[@name='username_show']") private WebElement  UserShow;  //private WebElement UserShow=driver.findelement(By.xpath("//input[@name='username_show']"));	
		@FindBy(xpath="//a[text()='Logout']") private WebElement LogoutBtn; //private WebElement LogoutBtn=driver.findelement(By.xpath("//a[text()='Logout']"));	
		 //2. Initialize within a constructor with access level public using PageFactory Class
		public Test2(WebDriver driver)   //Information
		{
			PageFactory.initElements(driver,this);
		}
	//3. Utilize within a method with access level public
		 
		 public void getUsername(String ExpectedUsername)   ////Velocity!
		 {
			String S1=UserShow.getAttribute("value");  //Hello Velocity!
			     String[]  A1=S1.split(" ");  //Hello[0]           Velocity![1]
			    
			     String Z1=A1[0];  //Hello[0]  
			      
			     String  ActualUsername= A1[1]; //Velocity![1]
			     
			     
			     
			       //Velocity!              //Velocity!
			     if(ExpectedUsername.equals(ActualUsername)) 
			     {
			    	 System.out.println("Pass");
			     }
			     else 
			     {
			    	 System.out.println("Fail");
			     }
			     
			     
			     
		 }
		 public void clicklogoutbutton() 
		 {
			 LogoutBtn.click();
		 }
}
