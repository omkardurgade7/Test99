package Assertion_SoftAssert_Class;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {

	
	    /*     SoftAssert
	    How do we perform assertion/verification in selenium?
         By using Assert class and Soft Assert class we can perform the verification and 
         assertion. There are different method by using those methods we can perform the verification */
	
	   @Test
	   public void TC1()
	   {
		   SoftAssert soft=new SoftAssert();
		   
		   String k1="Hi";
		   
		   String k2="Hello";
		   
		   String k3="Good Night";
		   
		   soft.assertEquals(k2, k1);   //Hi=Hello it fails because both are not same
		   
		   soft.assertNotEquals(k1, k2);  //Hi=Hello it passes because both are different
		   
		   soft.assertEquals(k2, k3);    //Hello=Good Night it fails because both are different
		   
		   soft.assertNotEquals(k2, k3);  //Hello=Good Night it pass because both are different
		   
		   soft.assertAll();
		   
	   }

}
