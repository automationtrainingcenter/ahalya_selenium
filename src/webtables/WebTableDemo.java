package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basics.BrowserHelper;

public class WebTableDemo extends BrowserHelper{
	
	public static void main(String[] args) {
		launch("chrome","https://learn.letskodeit.com/p/practice");
		//locate table body
		WebElement tableBody = driver.findElement(By.cssSelector("#product>tbody"));
		// locate all the rows inside the table body using tag name tr
		List<WebElement> rows = tableBody.findElements(By.tagName("tr"));
		// iterate over every row
		for(WebElement row : rows) {
			// locate all the cells inside every row
			List<WebElement> cells = row.findElements(By.tagName("td"));
			//iterate over every cell and get the data
			for(WebElement cell : cells) {
				System.out.print(cell.getText()+"\t");
			}
			System.out.println();
		}
		
		
		closeBrowser();
	}
	

}
