package Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCount {

	/*1. invocationCount:
			Sometimes same test method/TC need to be executed multiple time which can be possible by using
		TestNG keyword "invocationCount"
		eg. @Test (invocationCount=5)  */

	  @Test(invocationCount=5)
	  public void TC01()
	  {
		  Reporter.log("Running Method TC1",true);    //execute 5 times
	  }
	  
	  @Test(invocationCount=2)
	  public void TC02()
	  {
		  Reporter.log("Running Method TC2",true);    //execute 2 times
	  }
	  
}
