package sikuli;

import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemo {
	
	public static void main(String[] args) throws Exception {
		Screen screen = new Screen();
		Pattern ff = new Pattern(".\\sikuliimages\\ff.png");
		Pattern ffsearch = new Pattern(".\\sikuliimages\\ffsearch.png");
		Pattern email = new Pattern(".\\sikuliimages\\email.png");
		Pattern gmailsignin = new Pattern(".\\sikuliimages\\gmailsignin.png");
		
		Pattern next = new Pattern(".\\sikuliimages\\next.png");
		Pattern password = new Pattern(".\\sikuliimages\\password.png");
		screen.find(ff);
		screen.click(ff);
		Thread.sleep(2000);
		screen.find(ffsearch);
		screen.type(ffsearch, "gmail.com");
		Thread.sleep(2000);
		screen.type(ffsearch, Key.ENTER);
		Thread.sleep(2000);
		screen.find(gmailsignin);
		screen.click(gmailsignin);
		screen.find(email).type("atcsurya");
		screen.find(next).click();
		Thread.sleep(2000);
		screen.find(password).type("password");
		screen.find(next).click();
	}

}
