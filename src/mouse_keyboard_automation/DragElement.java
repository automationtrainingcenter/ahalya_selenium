package mouse_keyboard_automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basics.BrowserHelper;

public class DragElement extends BrowserHelper{
	public static void main(String[] args) {
		launch("firefox", "https://jqueryui.com/draggable/");
		// switch to frame which contains drag element
		driver.switchTo().frame(0);
		//locate drag element
		WebElement dragElement = locateElement("id", "draggable");
		// Create an Actions class object
		Actions actions = new Actions(driver);
		// move to drag element, click and hold it, move it to another location and release it
//		actions.clickAndHold(dragElement).moveByOffset(300, 250).release(dragElement).build().perform();
		
		//Actions class provides direct method to perform drag and drop by
		actions.dragAndDropBy(dragElement, 300, 250).build().perform();
		closeBrowser();
		
		
	}
}
