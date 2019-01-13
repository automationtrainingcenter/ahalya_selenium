package screenshots;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basics.BrowserHelper;

public class MulitpleScreenshot extends BrowserHelper{
	public static void main(String[] args) throws Exception {
		launch("chrome", "http://amazon.in");
		Thread.sleep(2000);
		/* find scroll height and client hieght of the webpage
		 * we can find them using Javascript
		 * so create an object of JavaScriptExecutor
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// find client height
		Long clientHeight = (Long)js.executeScript("return document.documentElement.clientHeight");
		// find scroll height
		Long scrollHeight = (Long)js.executeScript("return document.documentElement.scrollHeight");
		int temp = 0;
		do {
			// capture the screenshot of current view of the page
			File img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			BufferedImage bi = ImageIO.read(img);
			ImageIO.write(bi, "png", new File(".\\screenshots\\amazon"+getDate()+".png"));
			//scroll the page by client height
			js.executeScript("document.documentElement.scrollBy(0, arguments[0])", clientHeight);
			Thread.sleep(4000);
			scrollHeight -= clientHeight;
		}while(scrollHeight>0);
		
		closeBrowser();
	}
}
