package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * frames are used to display the web page with in a web page To work with
 * frames we have to switch focus from web driver to that particular frame. we
 * can switch to frames using frame index or frame id or name or frame element
 */
public class FramesHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
//		In the main window locate text field and fill it
		driver.findElement(By.id("displayed-text")).sendKeys("selenium");
		Thread.sleep(2000);
//		switch the focus to frame which you want to automate
		driver.switchTo().frame("courses-iframe");
//		now focus is in frame 
//		inside the frame locate search field and fill the data
		driver.findElement(By.id("search-courses")).sendKeys("java");
		Thread.sleep(2000);
//		switch the focus back to the main page
//		defaultContent() is used to switch focus from any frame to the main page
		driver.switchTo().defaultContent();
//		now focus is in main page
		driver.findElement(By.name("enter-name")).sendKeys("ahalya");
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
