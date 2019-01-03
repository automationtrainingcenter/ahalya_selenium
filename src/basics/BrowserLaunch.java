package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
//		set the System property for firefox driver executable file
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		
//		to launch a browser we have to create an object of the browser driver class
		WebDriver fObj = new FirefoxDriver();
		
//		navigate to a url using get() method of WebDriver interface
		fObj.get("http://www.facebook.com");
		
//		wait for some time 
		Thread.sleep(5000);
		
//		close the browser using close() method of webdriver interface
		fObj.close();
		
		
//		set the system property for chrome driver executable file
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
//		create an object of the chrome browser
		WebDriver cObj = new ChromeDriver();
		
//		naviga  te to a url
		cObj.get("http://www.seleniumhq.org");
		
		Thread.sleep(5000);
		
		cObj.close();
	}

}
