package utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class HandleEvents implements WebDriverEventListener{

	public void beforeAlertAccept(WebDriver driver) {
		//System.out.println("This condition is to check for : Before accepting an Alert");
	}

	public void afterAlertAccept(WebDriver driver) {
		//System.out.println("This condition is to check for : After accepting an Alert");
	}

	public void afterAlertDismiss(WebDriver driver) {
		//System.out.println("This condition is to check for : After Dismissing an Alert");
	}

	public void beforeAlertDismiss(WebDriver driver) {
		//System.out.println("This condition is to check for : Before Dismissing an Alert");
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("This condition is to check for : Before Navigating to feature");
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("This condition is to check for : After Navigating to feature");
	}

	public void beforeNavigateBack(WebDriver driver) {
		//System.out.println("This condition is to check for : Before Navigating back feature");
	}

	public void afterNavigateBack(WebDriver driver) {
		//System.out.println("This condition is to check for : After Navigating back feature");
	}

	public void beforeNavigateForward(WebDriver driver) {
		//System.out.println("This condition is to check for : Before Navigating forward feature");
	}

	public void afterNavigateForward(WebDriver driver) {
		//System.out.println("This condition is to check for : After Navigating forward feature");
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		//System.out.println("This condition is to check for : Before navigating refresh feature");
	}

	public void afterNavigateRefresh(WebDriver driver) {
		//System.out.println("This condition is to check for : After navigating refresh feature");
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		//System.out.println("This condition is to check for : Before findBy feature");
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		//System.out.println("This condition is to check for : After findBy feature");
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		//System.out.println("This condition is to check for : Before Clickon feature");
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		//System.out.println("This condition is to check for : After Clickon feature");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		//System.out.println("This condition is to check for : Before Change Value Of feature");
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		//System.out.println("This condition is to check for : After Change Value of feature");
	}

	public void beforeScript(String script, WebDriver driver) {
		//System.out.println("This condition is to check for : Before script feature");
	}

	public void afterScript(String script, WebDriver driver) {
		//System.out.println("This condition is to check for : After script feature");
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		//System.out.println("This condition is to check for : Before Switching to window feature");
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		//System.out.println("This condition is to check for : After Switching to window feature");
	}

	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("This condition is to check for : On Exception feature");
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		//System.out.println("This condition is to check for : Before Getting the screenshot feature");
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		//ystem.out.println("This condition is to check for : After Getting the screnshot feature");
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("This condition is to check for : Before Gettext feature");
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("This condition is to check for : After Gettext feature");
	}

}

