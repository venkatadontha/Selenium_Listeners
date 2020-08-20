package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.HandleEvents;

public class TestBase {
	
	public static EventFiringWebDriver dr = null;
	public static Properties CG = null;
	
	@BeforeClass(alwaysRun = false)
	public static void Initialise() throws IOException 
		{
			CG = new Properties();
			FileInputStream is = new FileInputStream ("C:\\Users\\Windows\\Documents\\JAVA\\listeners\\src\\main\\java\\config\\ConfigProperties.Properties");
			CG.load(is);
		
			if (CG.getProperty("browser").equals("FF"))
			{
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver(); 
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 		driver.manage().window().maximize();
		 		
		 		dr = new EventFiringWebDriver(driver);
		 		HandleEvents he = new HandleEvents();
		 		dr.register(he);
			}
			
			else if (CG.getProperty("browser").equals("CH"))
			{
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver(); 
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.manage().window().maximize();
		 		
		 		dr = new EventFiringWebDriver(driver);
		 		HandleEvents he = new HandleEvents();
		 		dr.register(he);
			}
		}
	
	
	@AfterMethod
	public void ScreenshotOnFailure(ITestResult testResult) throws IOException
	{
		if(testResult.getStatus() ==ITestResult.FAILURE)
		{
			utilities.Screenshots.takeScreenshot(dr, testResult.getName());
		}
		dr.quit();
	}
	
	
	
	
	  @AfterClass 
	  public static void TearDown()
	  {
		  System.out.println("Closing or Quitting the Browser");
		  dr.quit(); 
	  }
	
	
}
