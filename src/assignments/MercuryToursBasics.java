package assignments;
/*
 * navigate to http://newtours.demoaut.com/ in google chrome browser
 * click on register link
 * fill the form except country selection
 * click on submit button
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryToursBasics 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement registerField = driver.findElement(By.linkText("REGISTER"));
		registerField.click();
		WebElement firstNameField = driver.findElement(By.name("firstName"));
		firstNameField.sendKeys("Charishma");
		WebElement lastNameField = driver.findElement(By.name("lastName"));
		lastNameField.sendKeys("Jasti");
		WebElement phoneField = driver.findElement(By.name("phone"));
		phoneField.sendKeys("9848022333");
		WebElement emailField = driver.findElement(By.name("userName"));
		emailField.sendKeys("cherry@123");
		WebElement addressField = driver.findElement(By.name("address1"));
		addressField.sendKeys("Flatno:101,Rk Towers,kukatpally");
		WebElement cityField = driver.findElement(By.name("city"));
		cityField.sendKeys("Hyderabad");
		WebElement stateField = driver.findElement(By.name("state"));
		stateField.sendKeys("Telangana");
		WebElement postCodeField = driver.findElement(By.name("postalCode"));
		postCodeField.sendKeys("500014");
		WebElement dropDownField = driver.findElement(By.name("country"));
		Select country1 = new Select(dropDownField);
		country1.selectByVisibleText("INDIA ");
		WebElement userNameField = driver.findElement(By.name("email"));
		userNameField.sendKeys("Cherry@123");
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Cherry1@123");
		WebElement ConfirmPasswordField = driver.findElement(By.name("confirmPassword"));
		ConfirmPasswordField.sendKeys("Cherry1@123");
		WebElement submitButton = driver.findElement(By.name("register"));
		submitButton.click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
	

}
