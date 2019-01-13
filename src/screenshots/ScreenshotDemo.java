package screenshots;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basics.BrowserHelper;

public class ScreenshotDemo extends BrowserHelper{
	public static void main(String[] args) throws IOException {
		launch("firefox", "http://www.amazon.in");
		//create TakeScreenshot Interface reference
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcImg = ts.getScreenshotAs(OutputType.FILE);
		File desImg = new File(".\\screenshots\\image"+getDate()+".png");
		BufferedImage bi = ImageIO.read(srcImg);
		ImageIO.write(bi, "png", desImg);
		closeBrowser();
	}
}
