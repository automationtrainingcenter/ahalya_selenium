package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");

//		to launch the browser create an object of the browser driver class
		WebDriver driver = new ChromeDriver();

//		get() which accepts a string argument, which is the url of the application we want to navigate
		driver.get("http://facebook.com");
		
		String value = "email";
		By email_Id = By.id(value);
		WebElement emailField = driver.findElement(email_Id);
		
//		sendKeys(String arg) which will send the data to the text field or text area
		emailField.sendKeys("ahalya");
		
//		driver.findElement(By.name("firstname")).sendKeys("ahalya");
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("ahalya");
		
		Thread.sleep(2000);
		
//		clear() delete the contents of text field or text area
		firstName.clear();
		Thread.sleep(2000);
		
//		click() which will click on any element
		WebElement signup = driver.findElement(By.name("websubmit"));
//		signup.click();
//		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(2000);
		
//		submit() which will submit a form to the server\
//		emailField.submit();
//		firstName.submit();
		
//		getTagName() return String value which is tag name of the given element
		System.out.println(emailField.getTagName());
		System.out.println(signup.getTagName());
		System.out.println(driver.findElement(By.linkText("Forgotten account?")).getTagName());
		
//		getAttribute(String arg) returns a string value which is the value of the given attribute name
		System.out.println(firstName.getAttribute("aria-label"));
		System.out.println(emailField.getAttribute("type"));
		
//		getCssValue(String arg) returns a String value which is value of given CSS property
		System.out.println(firstName.getCssValue("border-radius"));
		
//		getText() returns inner text of a given element if any
		System.out.println(signup.getText());
		
//		getLocation() return Point class object which is x and y co ordinate values of the given 
//		element from the top left corner of the page
		System.out.println(signup.getLocation());
		
//		getSize() return Dimension class object which is width and height of the given element
		System.out.println(signup.getSize());
		
//		isDisplayed() return true if an element is displyed in the page
		System.out.println(signup.isDisplayed());
		System.out.println(driver.findElement(By.name("reg_email_confirmation__")).isDisplayed());

//		isEnabled() return true if an element is in enabled(active) state
		System.out.println(firstName.isEnabled());
		
//		isSelected() return true if an option is selected in drop down list or list box
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
