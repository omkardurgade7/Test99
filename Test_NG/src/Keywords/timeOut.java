package Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOut {

	     /*            timeOut:
        If test class contains multiple test methods if one of the test
        method is time consuming to execute then TestNG bydefault fail 
        that TC & executes the other TC.
        eg. @Test(timeOut=8000)   */
	
	
	 @Test(timeOut=5000)
	  public void TC01() throws InterruptedException   //only this will execute
	  {
		  Thread.sleep(2000);
		  Reporter.log("Running TC01",true); 
	  }
	  
	  @Test()
	  public void TC02()
	  {
		  Reporter.log("Running TC02",true); 
	  }    
	
	
}
