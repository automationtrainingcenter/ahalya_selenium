package mouse_keyboard_automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basics.BrowserHelper;

public class SliderDemo extends BrowserHelper{	
	public static void main(String[] args) throws InterruptedException {
		launch("firefox", "https://jqueryui.com/slider/");
		//switch to frame which contains slider
		driver.switchTo().frame(0);
		//locate slider head
		WebElement sliderHead = locateElement("css", "#slider>span");
		//create Actions class object
		Actions actions = new Actions(driver);
		// click and hold on slider head, move to some location and release
		actions.clickAndHold(sliderHead).moveByOffset(150, 0).build().perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(sliderHead, -100, 0).build().perform();
		closeBrowser();
	}

}
