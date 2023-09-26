package POM_DDF_TestNG_BaseClass_UtilityClass2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Utility_Class {

	    @Test
	    public static String getDataFromExcelSheet(int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException
	    {
	    	
	    	FileInputStream file=new FileInputStream("D:\\Selenium Excel Sheet\\Parameterization Excel sheet.xlsx");
	    	
	    	String value=WorkbookFactory.create(file).getSheet("Sheet10").getRow(RowIndex).getCell(CellIndex).getStringCellValue();
	    
	    	return value;
	    }
	    
	    @Test
	    public static void getss(WebDriver driver,String TCID) throws IOException
	    {
	    	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	File dest=new File("D:\\"+TCID+".jpg");
	    	FileHandler.copy(source, dest);
	    }
}
