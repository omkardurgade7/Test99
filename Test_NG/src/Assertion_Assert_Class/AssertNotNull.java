package Assertion_Assert_Class;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {

	    /* assertNotNull
	     assertNotNull() method is use to verify component or text fields empty or not,
	     if it is not empty output is pass otherwise fail. */
	
	     @Test
	     public void TC1()
	     {
	    	 String actual=null;
	    	 
	    	 Assert.assertNotNull(actual);   //it pass because actual is null
	     }
	     
	     @Test
	     public void TC2()
	     {
	    	 String actual="XYZ";
	    	 
	    	 Assert.assertNotNull(actual);   //it fails because actual = some value means 
	     }
	
	  
}
