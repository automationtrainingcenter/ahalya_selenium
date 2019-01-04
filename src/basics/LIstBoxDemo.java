package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LIstBoxDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();

//		locate the list box element
		WebElement listbox = driver.findElement(By.id("multiple-select-example"));

//		create an object of Select class for list box
		Select fruitSelect = new Select(listbox);

//		verify element allows multiple selection or not
		if (fruitSelect.isMultiple()) {
			// select an option by using index
			fruitSelect.selectByIndex(1);
			Thread.sleep(2000);
			// select an option by using value
			fruitSelect.selectByValue("peach");
			Thread.sleep(2000);

			// get all the selected options
			List<WebElement> allSelectedOptions = fruitSelect.getAllSelectedOptions();
			for (WebElement selectedOption : allSelectedOptions) {
				System.out.println(selectedOption.getText());
			}
			// select an option by using visible text
			fruitSelect.selectByVisibleText("Apple");
			Thread.sleep(2000);

			// deselect an option by using index
			fruitSelect.deselectByIndex(2);
			Thread.sleep(2000);
			
			// deselect an option by using value
			fruitSelect.deselectByValue("apple");
			Thread.sleep(2000);
			
			// deselect an option by visible text
			fruitSelect.deselectByVisibleText("Orange");
			Thread.sleep(2000);
			
			
			// deselect all the options
//			fruitSelect.deselectAll();
//			Thread.sleep(2000);
		}

		driver.close();
	}
}
