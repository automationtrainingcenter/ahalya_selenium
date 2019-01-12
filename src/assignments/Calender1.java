package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basics.BrowserHelper;

public class Calender1 extends BrowserHelper {
	public static void main(String[] args) {
		String checkoutdate = "14";
		boolean status = false;
		launch("chrome", "http:\\\\expedia.co.in");
		locateElement("id", "hotel-checkout-hp-hotel").click();
		WebElement calender = locateElement("xpath","(//div[@class='datepicker-cal']//div[@class='datepicker-cal-month']/table/tbody)[2]");
		List<WebElement> rows = calender.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			List<WebElement> dates = row.findElements(By.tagName("td"));
			for (WebElement date : dates) {
				if (date.getText().contains(checkoutdate)) {
					System.out.println(date.getText());
					status = true;
					date.findElement(By.tagName("button")).click();
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
