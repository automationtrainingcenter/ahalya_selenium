package calenders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basics.BrowserHelper;

public class CalendersDemo extends BrowserHelper{
	public static void main(String[] args) {
		String checkindate = "23";
		boolean status = false;
		launch("chrome", "http:\\expedia.co.in");
		//click on the textfield which will open calender
		locateElement("id", "hotel-checkin-hp-hotel").click();
		
		//locate the calender table body
		WebElement calender = locateElement("xpath", "(//div[@class='datepicker-cal']//div[@class='datepicker-cal-month']/table/tbody)[1]");
		//locate all the rows
		List<WebElement> rows = calender.findElements(By.tagName("tr"));
		// iterate over the rows and get the dates
		for(WebElement row : rows) {
			List<WebElement> dates = row.findElements(By.tagName("td"));
			for(WebElement date : dates) {
				if(date.getText().contains(checkindate)) {
					System.out.println(date.getText());
					status = true;
					date.findElement(By.tagName("button")).click();
					break; //dates loop
				}
			}
			if(status) {
				break; //rows loop
			}
			
		}
		closeBrowser();
	}
}
