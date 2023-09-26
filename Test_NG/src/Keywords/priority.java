package Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {

	    /* priority:
	    To change test method/TC execution order we need to use TestNG keyword "priority".
        eg. @Test (priority=1)
        Note: priority can be 
        1. bydefault=0
        2. +ve integer
        3. -ve integer
        4. Duplicate 
        5.priority can't be in the form of "Decimals" and "Variables"   */
 
	   @Test(priority=1)
	   public void TC01()    //this execute second
	   {
		   Reporter.log("Running TC01",true);
	   }
	   
	   @Test(priority=2)     //last this will be execute
	   public void TC02()
	   {
		   Reporter.log("Running TC02",true);
	   }
	   
	   @Test
	   public void TC03()     //this execute first
	   {
		   Reporter.log("Running TC03",true);
	   }
	
}
