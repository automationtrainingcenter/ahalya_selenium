package assignments;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import basics.BrowserHelper;

public class FileUpload1 extends BrowserHelper
{
	public static void main(String[] args) throws Exception
	{
		launch("chrome", "https://www.freepdfconvert.com/");
		locateElement("xpath", "//div[@class='text']").click();
		Thread.sleep(2000);
		Screen screen = new Screen();
		Pattern Filename1=new Pattern(".//sikuliimages//Filename1.png");
		Pattern Open1=new Pattern(".//sikuliimages//Open1.png");	
		screen.find(Filename1);
		screen.type(Filename1,"C:\\Users\\Ahalya\\Documents\\course_workspace\\ahalya_selenium\\sikuliimages");
		screen.find(Open1);
		screen.click(Open1);
	}
	

}
