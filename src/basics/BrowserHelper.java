package basics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserHelper {
	protected static WebDriver driver;

	// get system date and time
	public static String getDate() {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MMM-dd_HH-mm-ss_z");
		return df.format(date);
	}
	
	public static void launch(String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Invalid brwoser name");
		}
		driver.get(url);
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static WebElement locateElement(String by, String using) {
		by = by.toLowerCase();
		By byUsing = null;
		WebElement element;
		switch (by) {
		case "id":
			byUsing = By.id(using);
			break;
		case "name":
			byUsing = By.name(using);
			break;
		case "xpath":
			byUsing = By.xpath(using);
			break;
		case "css":
			byUsing = By.cssSelector(using);
			break;
		case "linktext":
			byUsing = By.partialLinkText(using);
			break;
		default:
			System.out.println("invalid by");
			break;
		}
		return driver.findElement(byUsing);
	}

	public static void closeBrowser() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (driver.getWindowHandles().size() > 1) {
			driver.quit();
		} else {
			driver.close();
		}
	}

}
