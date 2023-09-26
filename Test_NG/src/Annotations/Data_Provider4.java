package Annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider4 {

	  @Test(dataProvider=("a1"))
	  public void login(String username,String password)
	  {
		  System.out.println("Username:"+username+password+"Password:");
	  }
	  @DataProvider
	  public Object[][] a1()
	  {
		  Object[][] data=new Object[3][2];
		  
		  data[0][0]="Omkar";
		  data[1][1]="12345";
		  
		  data[1][0]="Omkar";
		  data[1][1]="12345";
		  
		  data[2][0]="Omkar";
		  data[2][1]="12345";
		  
		  return data;
		  
	  }
}
