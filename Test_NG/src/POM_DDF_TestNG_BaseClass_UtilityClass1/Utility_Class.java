package POM_DDF_TestNG_BaseClass_UtilityClass1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Utility_Class {

	 @Test
	public static String getdatafromPF(String key) throws IOException
	{
		
		 FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Test_NG\\PropertyFile1.properties");
		
		 Properties proper=new Properties();
		 
		 proper.load(file);
		 
		 String value=proper.getProperty(key);
		 
		 return value;
	}
}
