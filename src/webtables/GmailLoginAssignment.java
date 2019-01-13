package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/1/?tab=wm#inbox");
		driver.findElement(By.id("identifierId")).sendKeys("emailme.ahalya548@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
