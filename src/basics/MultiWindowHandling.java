package basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/SSTS/ahalya/automation_workspace/selenium_concepts/frames/framesDemo.html");
		driver.manage().window().maximize();
		
//		click on open windows button in main page
		driver.findElement(By.id("opentTab")).click();
		Thread.sleep(5000);
		
//		the above button click will open multiple windows
		List<String> handles = new ArrayList<>(driver.getWindowHandles());
		
//		for(int i = 0; i< handles.size(); i++) {
//			driver.switchTo().window(handles.get(i));
//			System.out.println(driver.getTitle());
//		}
//		switch to facebook 
		driver.switchTo().window(handles.get(1));
//		driver focus is in facebook page
		driver.findElement(By.id("email")).sendKeys("9876776655");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("pass")).submit();
		Thread.sleep(2000);
		
//		switch focus to google page
		driver.switchTo().window(handles.get(3));
		driver.findElement(By.name("q")).sendKeys("selenium webdriver");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(4000);
		
//		switch to youtube page
		driver.switchTo().window(handles.get(2));
		driver.findElement(By.id("search")).sendKeys("selenium");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(4000);
		
//		switch to parent window
		driver.switchTo().window(handles.get(0));
		driver.findElement(By.id("opentWin")).click();
		Thread.sleep(4000);
		
		driver.quit();
	
	}
}
