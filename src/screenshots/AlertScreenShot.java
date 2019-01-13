package screenshots;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basics.BrowserHelper;

public class AlertScreenShot extends BrowserHelper{
	public static void main(String[] args) throws Exception {
		launch("chrome", "https://learn.letskodeit.com/p/practice");
		//locate the alert button and click on it
		locateElement("id", "alertbtn").click();
		// capture the screenshot of alert
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Robot r = new Robot();
		BufferedImage img = r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(img, "png", new File(".\\screenshots\\image.png"));
		//accept the alert
		driver.switchTo().alert().accept();
		closeBrowser();
	}
}
