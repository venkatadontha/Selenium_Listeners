package screenshotsOnTestFailure;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;


public class TC_ScreenshotOnTestFailure extends TestBase{
	
	@Test
	public static void TestScenario_FailureCondition() throws InterruptedException
	{
	 		dr.get("http://automationpractice.com/index.php");
		   	Thread.sleep(1000);
		   	
		   	dr.findElement(By.className("login")).click();
		   	dr.findElement(By.id("email_create")).sendKeys("prerana06@yopmail.com");
		   	dr.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
		   	Thread.sleep(1000);
		   	
		   	dr.findElement(By.id("id_gender1")).click();
		   	dr.findElement(By.id("customer_firstname")).sendKeys("Prerana");
		   	dr.findElement(By.id("customer_lastname")).sendKeys("Ramu");
		   	dr.findElement(By.id("passwd")).sendKeys("Test@12345");
		   	Thread.sleep(2000);

		   	dr.findElement(By.id("days")).sendKeys("21");
		   	Thread.sleep(2000);
		   	dr.findElement(By.id("months")).sendKeys("August");
		   	Thread.sleep(2000);
		   	dr.findElement(By.id("years")).sendKeys("2007");
		   	Thread.sleep(2000);
		   	dr.findElement(By.id("newsletter")).click();
		   	dr.findElement(By.id("optin")).click();
		   	
			dr.findElement(By.id("company")).sendKeys("Achary");
		   	dr.findElement(By.id("address1")).sendKeys("16 Palmer Way");
		   	dr.findElement(By.id("address2")).sendKeys("Longhedge");
		   	dr.findElement(By.id("city")).sendKeys("Salisbury");
		   	dr.findElement(By.id("id_state")).sendKeys("Hawaii");
		   	dr.findElement(By.id("postcode")).sendKeys("12345");
		   	dr.findElement(By.id("other")).sendKeys("This is my Additional Information section");
		   	dr.findElement(By.id("phone")).sendKeys("0123456789");
		   	dr.findElement(By.id("phone_mobile")).sendKeys("9876543210");
		   	dr.findElement(By.id("alias")).clear();
		   	dr.findElement(By.id("alias")).sendKeys("MyHOME");
		   	dr.findElement(By.xpath("//span[contains(text(),'Register1')]")).click();
		   	
		   	String  WelcomeMsg = dr.findElement(By.xpath("//p[@class='info-account']")).getText();
		   	System.out.println("My Account related note is : " + WelcomeMsg);
		   	Assert.assertEquals(WelcomeMsg, "Welcome to your account. Here you can manage all of your personal information and orders.");
		   	
	}
}

