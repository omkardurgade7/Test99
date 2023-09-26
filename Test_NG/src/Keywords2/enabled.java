package Keywords2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {

	
	@Test
	public void TC1()
	{
		Reporter.log("Runn TC1",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("Runn TC2",true);
	}
	@Test(enabled=false)
	public void TC3()
	{
		Reporter.log("RunnTC3",true);
	}
}
