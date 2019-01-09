package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basics.BrowserHelper;

public class NSEIndiaDemo extends BrowserHelper {

	public static void main(String[] args) {
		launch("chrome",
				"https://www.nseindia.com/live_market/dynaContent/live_watch/pre_open_market/pre_open_market.htm");
		
		String companyCode = "wipro";
		// locate the table
		WebElement tableBody = locateElement("css", "#preOpenNiftyTab>tbody");
		// locate table rows
		List<WebElement> rows = tableBody.findElements(By.tagName("tr"));
		for (int i = 2; i < rows.size(); i++) {
			// locate cells in every row
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			if(cells.get(0).getText().equalsIgnoreCase(companyCode)) {
				System.out.println(cells.get(3).getText());
				break;
			}
			
		}
		closeBrowser();

	}

}
