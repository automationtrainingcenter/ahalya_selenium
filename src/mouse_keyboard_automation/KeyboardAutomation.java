package mouse_keyboard_automation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basics.BrowserHelper;

public class KeyboardAutomation extends BrowserHelper{
	public static void main(String[] args) {
		launch("firefox", "http:\\google.com");
		WebElement search = locateElement("name", "q");
//		Actions actions = new Actions(driver);
//		actions.keyDown(search, Keys.SHIFT).sendKeys("selenium").keyUp(search,Keys.SHIFT).build().perform();
		search.sendKeys(Keys.chord(Keys.SHIFT, "selenium"));
		closeBrowser();

	}

}
