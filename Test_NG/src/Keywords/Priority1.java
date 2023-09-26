package Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 {

	    @Test(priority=1)  //5     //this execute fifth
	    public void TC01()
	    {
	    	Reporter.log("Running TC01",true);
	    }
	    @Test
	    public void TC02()  //2    //this execute second because alphabetical order 1st compare to TC03 and TC04
	    {
	    	Reporter.log("Running TC02",true);
	    }
	    @Test
	    public void TC03() //3    //this execute third because alphabetical order 
	    {
	    	Reporter.log("Running TC03",true);
	    }
	    @Test
	    public void TC04() //4    //this will execute forth because of alphabetical order
	    {
	    	Reporter.log("Running TC04",true);
	    }
	    @Test(priority=-1)
	    public void TC05()  //1               //this will execute first
	    {
	    	Reporter.log("Running TC05",true);
	    }
}
