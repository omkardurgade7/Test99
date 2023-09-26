package Keywords2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {

	
	@Test                //2
	public void TC1()
	{
		Reporter.log("TC1",true);
	}
	@Test(priority=1)   //4
	public void TC2()
	{
		Reporter.log("TC2",true);
	}
	@Test(priority=-1)   //1
	public void TC3()
	{
		Reporter.log("TC3",true);
	}
	@Test(priority=2)    //5
	public void TC4()
	{
		Reporter.log("TC4",true);
	}
	@Test                //3
	public void TC5()
	{
		Reporter.log("TC5",true);
	}
}
