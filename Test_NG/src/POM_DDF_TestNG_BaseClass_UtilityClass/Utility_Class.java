package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Utility_Class {

	   @Test
	   public static String getDataFromPF(String key) throws IOException
	   {
		   
		   //to reach upto propertyfile
		   FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Test_NG\\PropertyFile.properties");
	       
		   //create object of properties class
		   Properties prop=new Properties();
	       
		   //open property file
	       prop.load(file);
	       
	       //to fetch data from property file
	       String value1=prop.getProperty(key);
	       
	       return value1;
	   }
	   @Test
	   public static String getDataFromExcel(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
	   {
		   //to reach excel sheet
		 FileInputStream filee=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
		 
		 String value2=WorkbookFactory.create(filee).getSheet("Sheet9").getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		 
		 return value2;
	   }
	   
	   
	   @Test
	   public static String getTitleOfAppFromExcel(int RowIndex,int RowCell) throws EncryptedDocumentException, IOException
	   {
			 FileInputStream filee=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
              
			 String value3=WorkbookFactory.create(filee).getSheet("Sheet9").getRow(RowIndex).getCell(RowCell).getStringCellValue();
			 
			 return value3;
	   }
	   
	   @Test
	   public static void captureScreenshot(WebDriver driver, String TestCaseID) throws IOException
	   {
		   File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   
		   File dest=new File("D:\\TestingScreenshot."+TestCaseID+".jpg");
		   
		   FileHandler.copy(source, dest);
		   
	   }
	   
	   
	   
	   
	   
	   
	   
}
