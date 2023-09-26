package Annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider3 {

	  @Test(dataProvider="dd")
	  public void information(String name, String city)
	  {
		  System.out.println("Name:"+name+city+"City");
	  }
	  @DataProvider
	  public Object[][] dd()
	  {
		  Object[][] auto=new Object[3][2];
		  
		  auto[0][0]="John Snow";
		  auto[0][1]="Wall";
		  
		  auto[1][0]="Denereyes Targerian";
		  auto[1][1]="Stomborn";
		  
		  auto[2][0]="Tyrian Lannister";
		  auto[2][1]="Kings Landing";
		  
		  return auto;
	  }
	    
}
