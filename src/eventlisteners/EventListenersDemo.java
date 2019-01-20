package eventlisteners;

import org.bridj.cpp.std.list;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Create a class which will implement method of WebdriverEventListener interface
 * Create an object of EventFiringWebDriver class by passing webdriver object reference after creating
 * and object of WebDriver with any browser class
 * Create Listener class object we created in step 1
 * Register Listner class object with EventFiringWebDriver object
 */

public class EventListenersDemo{
	WebDriver wdriver;
	EventFiringWebDriver driver;
	
	//launch browser method
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		wdriver = new ChromeDriver();
		//create EventFiringWebDriver object
		driver = new EventFiringWebDriver(wdriver);
		//Create Listener class object
		Listener listener = new Listener();
		//register above object with EventFiringWebDriver object
		driver.register(listener);
		driver.manage().window().maximize();
		driver.get("http://www.srssprojects.in");
	}
	
	//login test
	public void loginTest() {
		//locate username and fill it
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		//locate password and fill it
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		//locate login button and click on it
		driver.findElement(By.id("login")).click();
	}
	
	//role creation test
	public void roleCreationTest() {
		//locate role button in admin home page and click on it
		driver.findElement(By.xpath("//a[@href='Admin_Roles_details.aspx']")).click();
		//locate new role button and click on it
		driver.findElement(By.id("btnRoles")).click();
		//locate role name and fill it
		driver.findElement(By.id("txtRname")).sendKeys("wastemanager");
		//locate role description and fill it
		driver.findElement(By.id("txtRDesc")).sendKeys("waste fellow");
		//locate role type and select it 
		new Select(driver.findElement(By.id("lstRtypeN"))).selectByVisibleText("E");
		//locate submit button and click on it
		driver.findElement(By.id("btninsert")).click();
		driver.switchTo().alert().accept();
	}
	
	
	//logout test
	public void logoutTest() {
		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		driver.close();
	}
	
	
	public static void main(String[] args) {
		EventListenersDemo obj = new EventListenersDemo();
		obj.launchBrowser();
		obj.loginTest();
		obj.roleCreationTest();
		obj.logoutTest();
	}

}
