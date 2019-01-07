package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoForm 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/a/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/ul/li[3]/a/span/span")).click();
		driver.findElement(By.name("firstname")).sendKeys("Amita");
		driver.findElement(By.name("lastname")).sendKeys("Jasti");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[14]/label")).click();
		driver.findElement(By.id("exp-1")).click();
		driver.findElement(By.id("datepicker")).sendKeys("12/12/2000");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
		Select sel1 = new Select(driver.findElement(By.id("continents")));
		sel1.selectByVisibleText("Asia");
		sel1.selectByVisibleText("Australia");
		driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[5]")).click();
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
	

}
