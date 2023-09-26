package Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {

	
	 /*            enabled:
   	Disabling a test method/TC in TestNG can be achieved by setting
    the enabled attribute of the @Test annotation to false.
     eg. @Test (enabled=false)    */

  @Test
  public void TC01()   //only this will execute
  {
	  Reporter.log("Running TC01",true); 
  }
  
  @Test(enabled=false)
  public void TC02()
  {
	  Reporter.log("Running TC02",true); 
  }
}
