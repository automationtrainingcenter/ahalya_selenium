package basics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * This class explains the methods inside the WebDriver interface
 * 
 */
public class WebDriverMethods {

	public static void main(String[] args) {
//		set the system property for driver executable path
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");

//		to launch the browser create an object of the browser driver class
		WebDriver driver = new ChromeDriver();

//		get() which accepts a string argument, which is the url of the application we want to navigate
		driver.get("http://facebook.com");

//		getTitle() which will return title (the inner text in between opening and closing title tag in head tag) of the current web page
		String title = driver.getTitle();
		System.out.println(title);

//		getCurrentUrl() which will return url of the current web page
		String url = driver.getCurrentUrl();
		System.out.println(url);

//		getPageSource() which will return the html source code the current web page
		String pageSource = driver.getPageSource();
		System.out.println(pageSource.contains("Facebook helps you connect and share with the people in your life."));

		/*
		 * getWindowHandle() which will return a string value which id of the current
		 * browser window Selenium provides uniques ids to each and every instance of
		 * the browser window
		 */
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);

		/*
		 * getWindowHandles() which will return a set of String values which are unique
		 * ids of the browser windows opened by the driver instance
		 */
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds);

		/*
		 * findElement() which will accepts By class argument and returns WebElement
		 * reference this method is used to locate an element inside the webpage using
		 * some locating technique provided in By class and returns the element it
		 * located. If element is not found with the locating technique we specified
		 * this method will throw a NoSuchElementException
		 */
		WebElement email = driver.findElement(By.id("email"));

		
		/*
		 * findElements() which locate list of elements with the locating technique we
		 * provided. if no element found with locating technique we specified it will
		 * return a list of size 0
		 */
		List<WebElement> inputs = driver.findElements(By.tagName("input"));
		System.out.println(inputs.size());
		/*
		 * close() which will close the current browser window
		 */
		driver.close();

		/*
		 * quit() which will close all the browser windows opened by the driver instance
		 */
		driver.quit();

	}

}
