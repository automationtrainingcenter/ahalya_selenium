package assignments;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import basics.BrowserHelper;

public class SikuliFacebook 
{
	public static void main(String[] args) throws Exception 
	{
		Screen screen = new Screen();
		Pattern Chrome = new Pattern(".\\sikuliimages\\Chrome.png");
		Pattern ChromeSearch = new Pattern(".\\sikuliimages\\ChromeSearch.png");
		Pattern FacebookUserName = new Pattern(".\\sikuliimages\\FacebookUserName.png");
		Pattern FacebookPassword = new Pattern(".\\sikuliimages\\FacebookPassword.png");
		Pattern LoginButton = new Pattern(".\\sikuliimages\\LoginButton.png");
		
		screen.find(Chrome);
		screen.click(Chrome);
		Thread.sleep(2000);
		screen.find(ChromeSearch);
		screen.type(ChromeSearch, "https://www.facebook.com/");
		Thread.sleep(2000);
		screen.type(ChromeSearch, Key.ENTER);
		Thread.sleep(2000);
		screen.find(FacebookUserName);
		screen.type(FacebookUserName, "ahalya");
		screen.find(FacebookPassword).type("password");
		screen.find(LoginButton).click();
		
		
		
		
		
		
	}

}
