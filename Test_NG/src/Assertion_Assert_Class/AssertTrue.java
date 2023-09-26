package Assertion_Assert_Class;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
	    /*
	                      assertTrue()
	      assertTrue() method used to verify condition are true or false,
          if condition is true output is pass otherwise fail. */
	
	     @Test
	     public void TC1()
	     {
	    	 boolean Actual=true;
	    	 
	    	 Assert.assertTrue(Actual);    //it pass because asserttrue=true
	     }
	     
	     @Test
	     public void TC2()
	     {
	    	 boolean Actual=false;
	    			 
	    	 Assert.assertTrue(Actual);	    //it fails because asserttrue=false	 
	     }
                                            
}
