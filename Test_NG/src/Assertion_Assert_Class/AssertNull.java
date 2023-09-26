package Assertion_Assert_Class;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
	     /*  	assertNull() 
	       method is use to verify component or text fields empty or not, 
	      if it is empty output is pass otherwise fail.*/
	
	   @Test
	   public void TC1()
	   {
		   String actual="XYZ";
	   
	       Assert.assertNull(actual);    //it fail because it has a some value
	   }
	   
	   @Test
	   public void TC2()
	   {
		   String actual=null;           //it pass because it has a null
		   
		   Assert.assertNull(actual);
	   }
}
