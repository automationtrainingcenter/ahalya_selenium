package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basics.BrowserHelper;

public class MakemyTripCalender extends BrowserHelper
{
	public static void main(String[] args) throws InterruptedException 
	{
		String departdate = "14";
		boolean status = false;
		
		launch("chrome", "https://www.makemytrip.com");
		locateElement("id", "hp-widget__depart").click();
		Thread.sleep(2000);
		WebElement calender = locateElement("xpath", "(//table[@class = 'ui-datepicker-calendar']//tbody)[2]");
		Thread.sleep(2000);
		List<WebElement> rows = calender.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			List<WebElement> dates = row.findElements(By.tagName("td"));
			for (WebElement date : dates) {
				if (date.getText().contains(departdate)) {
					System.out.println(date.getText());
					status = true;
					date.findElement(By.tagName("a")).click();
					break;
				}

			}
			if (status) {
				break;
			}
		}
		closeBrowser();
		
		
		}		
	
		
	}


