package Annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider5 {

	
	@Test(dataProvider="DJ")
	public void login(String UN,String PASS)
	{
		System.out.println("USERNAME="+UN+PASS+"PASSWORD");
	}
	
	@DataProvider
	public Object[][]DJ()
	{
		Object[][] cc=new Object[2][2];
		
		cc[0][0]="VIRAT";
		cc[0][1]="Virat@123";
		
		cc[1][0]="ROHIT";
		cc[1][1]="Rohit@123";
		
		return cc;
	}
	  
}
