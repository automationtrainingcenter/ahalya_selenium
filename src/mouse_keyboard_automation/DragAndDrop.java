package mouse_keyboard_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basics.BrowserHelper;

public class DragAndDrop extends BrowserHelper{
	public static void main(String[] args) {
		launch("firefox", "https://jqueryui.com/droppable/");
		//switch to frame which contains drag and drop elements
		driver.switchTo().frame(0);
		//locate drag and drop elements
		WebElement dragEle = locateElement("id", "draggable");
		WebElement dropEle = locateElement("id", "droppable");
		// create an Actions class object
		Actions actions = new Actions(driver);
		
		//click and hold drag element, move to drop element, release
//		actions.clickAndHold(dragEle).moveToElement(dropEle).release().build().perform();
		
		//Actions class provides direct method to perform drag and drop
		actions.dragAndDrop(dragEle, dropEle).build().perform();
		closeBrowser();
	}

}
