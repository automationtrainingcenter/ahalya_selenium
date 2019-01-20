package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basics.BrowserHelper;

public class GmailTable1 extends BrowserHelper
{
	public static void main(String[] args) throws InterruptedException
	{
		launch("chrome", "https://gmail.com");
		locateElement("id", "identifierId").sendKeys("chowdaryahalya5@gmail.com");
		locateElement("xpath", "//span[contains(text(),'Next')]").click();
		Thread.sleep(2000);
		locateElement("name", "password").sendKeys("Ahi@1234");
		locateElement("xpath", "//span[contains(text(),'Next')]").click();
		Thread.sleep(5000);
//		locateElement("xpath", "//a[contains(text(),'Gmail')]").click();
//		closeBrowser();
		
	}

}
