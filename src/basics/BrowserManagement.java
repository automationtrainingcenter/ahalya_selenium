package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManagement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");

//		to launch the browser create an object of the browser driver class
		WebDriver driver = new ChromeDriver();

//		get() which accepts a string argument, which is the url of the application we want to navigate
		driver.get("http://facebook.com");
		
		Options manage = driver.manage();
		Window window = manage.window();
		
//		get the default window size
		Dimension size = window.getSize();
		System.out.println("width = "+size.getWidth()+" height = "+size.getHeight());
		Thread.sleep(3000);
		
//		get the location of the browser window
		Point position = window.getPosition();
		System.out.println("x = "+position.getX()+" y = "+position.getY());
		Thread.sleep(3000);
		
//		maximize the browser window
		//driver.manage().window().maximize();
		window.maximize();
		Thread.sleep(3000);
		
//		open browser window full screen mode
		window.fullscreen();
		Thread.sleep(3000);
		
		
//		set browser size to some value
		window.setSize(new Dimension(750, 550));
		Thread.sleep(2000);
		
//		set the browser position to a location
		window.setPosition(new Point(500, 250));
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
