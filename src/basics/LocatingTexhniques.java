package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To locate elements selenium provides 8 locating mechanisms in By class
 * id - id attribute value of the element tag
 * name - name attribute value of the element tag
 * link text - complete text in between opening and closing a(anchor) tag
 * partial link text - part of the text in between opening and closing a(anchor) tag
 * xpath - xml path - //tagname{@attributename = 'attribute value']
 * css selector - tagname[attribute_name = 'attribute value']]
 * tag name - name of the element tag
 * class name - class attribute value
 * 
 * we can prepare xpath or css selector using any attribute value of the element tag
 * 
 * In WebDriver interface we have two methods which will locate the elements inside current page
 * using any one of the above locating mechanisms of By class
 * 
 * findElement(By arg) returns a WebElement interface reference if element located else it will throw 
 * NoSuchElementException
 * 
 * findElements(By arg) return a List of WebElement type objects if elements located, else it will return a 
 * List of size zero
 */
public class LocatingTexhniques {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");

//		to launch the browser create an object of the browser driver class
		WebDriver driver = new ChromeDriver();

//		get() which accepts a string argument, which is the url of the application we want to navigate
		driver.get("http://facebook.com");
		
//		id attribute
		String value = "email";
		By email_Id = By.id(value);
		WebElement emilField = driver.findElement(email_Id);
		
//		name attribute
		By firstName_Name = By.name("firstname");
		WebElement FirstNameField = driver.findElement(firstName_Name);
		
//		linkText
		By forgotPasword_linkText = By.linkText("Forgotten account?");
		WebElement forgotten_account_link = driver.findElement(forgotPasword_linkText);
		
//		partial link text
		WebElement whyDataOfBirth_link = driver.findElement(By.partialLinkText("date of birth"));
				
//		xpath
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		
//		css selector
		WebElement newPassword = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
		
//		tagname
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("number of links "+links.size());
		
//		class name
		List<WebElement> input_text_fields = driver.findElements(By.className("inputtext"));
		System.out.println("number of input text fileds "+input_text_fields.size());

	}

}
