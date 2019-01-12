package assignments;

import org.openqa.selenium.WebElement;

import basics.BrowserHelper;

public class MakemyTripCalender extends BrowserHelper
{
	public static void main(String[] args) throws InterruptedException 
	{
		String departdate = "15";
		boolean status = false;
		launch("chrome", "https://www.makemytrip.com");
		locateElement("id", "hp-widget__depart").click();
		WebElement calender = locateElement(xpath, using)
		closeBrowser();
		
	}

}
