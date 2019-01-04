package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");

//		to launch the browser create an object of the browser driver class
		WebDriver driver = new ChromeDriver();

//		get() which accepts a string argument, which is the url of the application we want to navigate
		driver.get("http://facebook.com");
		
		Navigation navigate = driver.navigate();
		
//	 	automates back button of browser window
		navigate.back();
		Thread.sleep(2000);
		
//		automates forward button of browser window
		navigate.forward();
		Thread.sleep(2000);
		
//		automate refersh button of browser window
		navigate.refresh();
		Thread.sleep(2000);

		
		driver.close();

	}

}
