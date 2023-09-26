package Annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider1 {

	    @Test(dataProvider="m1")
	    public void login(String UN,String PSW)
	    {
	    	System.out.println("Username:"+UN+"Password:"+PSW);
	    }
	    
	    @DataProvider
	    public Object[][] m1()
	    {
	    	Object[][] data=new Object[3][2]; 
	    	data[0][0]="ROHIT";
	    	data[0][1]="12345";
	    	
	    	data[1][0]="VIRAT";
	    	data[1][1]="67890";
	    	
	    	data[2][0]="HARDIK";
	    	data[2][1]="011123";
	    	
	    	return data;
	    	
	    }
	    
	    
	    
	    
	    
}
