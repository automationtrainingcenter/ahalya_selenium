package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:\\Users\\Ahalya\\Documents\\course_workspace\\ahalya_selenium\\frames");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		/*
		 * frames are used to display the web page with in a web page To work with
		 * frames we have to switch focus from web driver to that particular frame we
		 * can switch to frames using frame index or frame id or name or frame element
		 */

		// locate all the frames inside the page
		

		/******************* we want to automate frame 2 *******************/
		// switch focus to main page

		// now focus in main page

		// switch to frame 2
		// now focus is in frame 2

		
		
		// now focus is in frame 2
		/******************* automate the content in frame 4 *******************/
		// switch to frame 3 from main page

		// switch to frame 4 which is in frame 3

		// now we are in frame 4

		
		
		/*************** we want to automate frame 3 ****************/

		// switch focus to frame 3

		// now focus is in frame 3

		
		
		// now focus is in frame 3
		/******************** we want to automate frame 1 ******************/

		driver.close();
	}

}
