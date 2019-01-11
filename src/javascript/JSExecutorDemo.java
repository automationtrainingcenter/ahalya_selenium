package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import basics.BrowserHelper;

public class JSExecutorDemo extends BrowserHelper{
	public static void main(String[] args) throws InterruptedException {
		launch("chrome", "http:\\www.facebook.com");
		
		WebElement firstname = locateElement("name", "firstname");
		
//		firstname.sendKeys("surya");
		Thread.sleep(3000);
		//create an object of JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = 'ahalya'", firstname);
		
		String value = (String)js.executeScript("return arguments[0].value", firstname);
		System.out.println(value);
		closeBrowser();
	}
	
	

}
