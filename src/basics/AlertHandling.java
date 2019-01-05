package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * To handle alerts selenium provides Alert class with several methods
 * switch the driver focus to alert using switchTo() method WebDriver interface
 * and alert() method of TargetLocator interface
 * driver.switchTo().alert()
 * 
 * Alert class methods
 * accept() which will click on OK button of the alert
 * dismiss() which will click on Cancel button of the alert
 * getText() which will get the text of the alert
 * sendKeys() which will sent some data to the alert text field
 */

public class AlertHandling {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		String name = "ahlaya";
//		locate text field and enter your name
		driver.findElement(By.id("name")).sendKeys(name);
		Thread.sleep(2000);
		
//		locate the alert button and click on it
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		
		TargetLocator switchTo = driver.switchTo();
		Alert alert = switchTo.alert();
//		get the text of the alert and verify it contains name or not
		String alertText = alert.getText();
//		accept the alert
		alert.accept();
		System.out.println("alert text contains name "+alertText.contains(name));
		
		Thread.sleep(3000);
//		locate the confirm button and click on it
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.dismiss();
		System.out.println("alert text contains name "+alertText.contains(name));
		Thread.sleep(2000);
		driver.close();
	}

}
