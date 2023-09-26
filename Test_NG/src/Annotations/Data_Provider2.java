package Annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider2 {

	
	    @Test(dataProvider="k1")
	    public void signin(String id,String password)
	    {
	    	System.out.println("ID"+id+"PASSWORD"+password);
	    }
	    @DataProvider
	    public Object[][] k1()
	    {
	    	Object[][] data=new Object[5][2];
	    	
	    	data[0][0]="ROHIT";
	    	data[0][1]="ascnjnd";
	    	
	    	data[1][0]="VIRAT";
	    	data[1][1]="s4d5ndsn";
	    	
	    	data[2][0]="HARDIK";
	    	data[2][1]="dlkflld";
	    	
	    	data[3][0]="KANE";
	    	data[3][1]="dskkd";
	    	
	    	data[4][0]="DAVID";
	    	data[4][1]="scjchdl";
	    	
	    	return data;
	    }
}
