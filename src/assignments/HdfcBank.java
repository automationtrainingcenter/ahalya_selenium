package assignments;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {
	
	/*
	 * xpath for continue to netbanking link
	 * (//a[text()='Continue to NetBanking'])[2]
	 */
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginsubmit\"]")).click();
		Thread.sleep(4000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<>(windowHandles);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[text()='Continue to NetBanking'])[2]")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();
		TargetLocator switchTo = driver.switchTo();
		Alert alert = switchTo.alert();
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();
		Thread.sleep(4000);
		driver.quit();
		
	}

}
