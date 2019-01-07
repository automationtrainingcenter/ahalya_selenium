package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("opentab")).click();
//		the above button click will open multiple windows
//		get all the window handles or ids using getWindowHandles method
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<>(windowHandles);
		/*
		 * index 0 of windows list have parent window index 1 have first child window
		 * index 2 have second child window .. etc
		 */

//		now focus is in parent window only so switch the focus to child window
		driver.switchTo().window(windows.get(1));
//		now focus is in child window
		// locate elements in child window and perform actions
		driver.findElement(By.id("search-courses")).sendKeys("Java");
		Thread.sleep(3000);
//		now switch the focus back to parent window
		driver.switchTo().window(windows.get(0));
//		now focus is in parent window
		driver.findElement(By.id("name")).sendKeys("surya");
		Thread.sleep(2000);
		driver.quit();
	}

}
