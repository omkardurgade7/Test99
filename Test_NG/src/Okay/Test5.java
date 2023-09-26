package Okay;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Test5 {

	@Test                     //UserName   Password
	public static String  getDataFromPF(String key) throws IOException 
	{
		//To reach upto Property File
	FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Test_NG\\PropertyFile.properties");
	//Create Object of Properties Class
	Properties Prop=new Properties();
	//To Open property File
	  Prop.load(file);
	//To fetch data/value from Property File
	String  Value1=Prop.getProperty(key);   //UserName---->Velocity    
	                                       //Password---->U1YP1G
	  return Value1;  //Velocity   //U1YP1G 
	}
}
