package mouse_keyboard_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basics.BrowserHelper;

/*
 * To automation mouse actions Selenium provides
 * Actions class. This class provides several methods to automate mouse actions
 * we can perform individual actions or combined actions also
 * each and every action is a method in Actions class
 * after calling that method we have to call build() and perform()
 * to build multiple actions and to perform those actions
 */
public class MouseHover extends BrowserHelper{
	public static void main(String[] args) throws InterruptedException {
		launch("chrome", "https://www.amazon.in/");
		//locate shop by category
		WebElement shopByCat = locateElement("id", "nav-link-shopall");
		//create Actions class object
		Actions actions = new Actions(driver);
		//move the mouse to an element
		actions.moveToElement(shopByCat).build().perform();
		Thread.sleep(2000);
		//locate menu option i.e. mobiles and computers
		WebElement mobilesAndComputers = driver.findElement(By.xpath("//span[contains(text(),'Mobiles, Computers')]"));
		// move to the mobile and computers element
		actions.moveToElement(mobilesAndComputers).build().perform();
		Thread.sleep(2000);
		// locate power bank
		WebElement powerBanks = driver.findElement(By.xpath("//span[contains(text(),'Power Banks')]"));
		Thread.sleep(2000);
		// move to power banks and click on that elemnet
		actions.moveToElement(powerBanks).click().build().perform();
		Thread.sleep(2000);
		closeBrowser();
		
		
	}
}
