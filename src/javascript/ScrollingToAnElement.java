package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import basics.BrowserHelper;

public class ScrollingToAnElement extends BrowserHelper{
	public static void main(String[] args) {
		launch("chrome", "http:\\amazon.in");
		WebElement element = locateElement("linkText", "Instagram");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		closeBrowser();
	}

}
