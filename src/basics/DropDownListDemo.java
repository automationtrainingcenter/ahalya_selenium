package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*
 * Selenium provides Select class to work with drop down list or list box
 * In Select class we have several methods to select and deselect the options of dd list or list box
 * to call these methods we have to create an object of Select class by using WebElement interface reference
 * 
 */


public class DropDownListDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		WebElement ddlist = driver.findElement(By.id("carselect"));
		
		// Create a Select class object
		Select carSelect = new Select(ddlist);
		
		// get the default selected option
		WebElement selectedOption = carSelect.getFirstSelectedOption();
		System.out.println(selectedOption.getText());
		
		// select an option using index of the option and index number start from 0
		carSelect.selectByIndex(1);
		Thread.sleep(2000);
		
		// select an option using value of the value attribute of option tag
		carSelect.selectByValue("honda");
		Thread.sleep(2000);
		
		// select an option using visible text i.e. the inner text in between opening and closing option tags
		carSelect.selectByVisibleText("BMW");
		Thread.sleep(2000);
		
		// get all the options of the ddlist
		List<WebElement> options = carSelect.getOptions();
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		
		driver.close();
	}

}
