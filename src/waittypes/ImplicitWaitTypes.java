package waittypes;

import java.util.concurrent.TimeUnit;

import basics.BrowserHelper;

public class ImplicitWaitTypes extends BrowserHelper{
	
	public static void main(String[] args) {
		launch("chrome", "http://google.com");
		//page load timeout : will wait until the page loads completely
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
//		implicit wait : will wait for every element in the to load for certain amount of time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//set script timeout: will wait until javascript in the page has executed
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		driver.close();
	}

}
