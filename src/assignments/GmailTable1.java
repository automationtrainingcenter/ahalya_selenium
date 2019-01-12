package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTable1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/1/?tab=wm#inbox");
		driver.findElement(By.id("yDmH0d")).sendKeys("emailme.ahalya548@gmail.com");
//		driver.findElement(By.cssSelector(cssSelector))
		Thread.sleep(3000);
		driver.close();
		
	}

}
