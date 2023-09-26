package Assertion_Assert_Class;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertFalse {
       /*      assertFalse
       	assertFalse() method use to verify condition are true or false, 
         if condition is false output is pass otherwise fail.
        */
	    @Test
	    public void TC1()
	    {
	    	boolean actual=false;
	    	
	    	Assert.assertFalse(actual);   //it pass because assertFalse=false;
	    }
	    
	    @Test
	    public void TC2()
	    {
	    	boolean actual=true;
	    	
	    	Assert.assertFalse(actual);   //it fails because assertFalse=true;
	    }
}
