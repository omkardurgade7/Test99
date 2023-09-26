package Assertion_Assert_Class;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
	    /*     AssertEquals
	     assertEquals() method used to verify expected and actual result, if both results are same
	      then output is pass otherwise fail. */
	
	  @Test
	  public void TC1()
	  {
		  String expectedresult="Forgotton Password!";
		  String actualresult="Forgotton Password!";
		  
		  Assert.assertEquals(actualresult,expectedresult);   //pass beacuse actual and exp are same
	  }
	  
	  @Test
	  public void TC2()
	  {
		  String expected="okay";
		  String actual="ok";
		  
		  Assert.assertEquals(actual,expected);       //fail because actual and exp are not same
	  }
	  


}
