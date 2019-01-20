package waittypes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basics.BrowserHelper;

public class ExplicitWait extends BrowserHelper{
	public static void main(String[] args) {
		launch("chrome", "http://gmail.com");
		locateElement("id", "identifierId").sendKeys("atcsurya");
//		locateElement("xpath", "//span[contains(text(),'Next')]").click();
//		create WebDriverWait class object
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		password.sendKeys("password"+Keys.ENTER);
		
	}

}
