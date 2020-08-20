package listenersTestScenarios;

import org.testng.annotations.Test;

import base.TestBase;


public class TC_ListenersTesting extends TestBase{
	
	@Test
	public static void TestScenario() throws InterruptedException
	{
	 		dr.get("https://www.bmihealthcare.co.uk");
		   	Thread.sleep(1000);
	}
}
