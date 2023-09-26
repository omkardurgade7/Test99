package Assertion_Assert_Class;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals {
	    /*        AssertNotEquals
	       assertNotEquals() method used to verify expected and actual result, if both results are 
	      not same then output is pass otherwise fail. */

         @Test
         public void TC1()
         {
        	 String exp="okay";
        	 String act="okay";
        	 
        	Assert.assertNotEquals(act,exp);    //it fails because exp and act are same  
         }
         
         @Test
         public void TC2()
         {
        	 String want="okay";
        	 String get="ok";
        	 
        	 Assert.assertNotEquals(get, want);  //it will pass because exp and act are not same
         }
         



}
