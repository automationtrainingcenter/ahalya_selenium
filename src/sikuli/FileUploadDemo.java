package sikuli;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import basics.BrowserHelper;

public class FileUploadDemo extends BrowserHelper{
	public static void main(String[] args) throws Exception {
		launch("chrome", "https://smallpdf.com/word-to-pdf");
		locateElement("xpath", "//div[contains(text(),'Choose file')]").click();
		Thread.sleep(2000);
		//sikuli script
		Screen screen  = new Screen();
		Pattern fileName = new Pattern(".//sikuliimages//fileName.png");
		Pattern open = new Pattern(".//sikuliimages//open.png");
		screen.find(fileName);
		screen.type(fileName, "d:\\selenium\\extended selenium syllabus.doc");
		screen.find(open);
		screen.click(open);
		
		
	}
}
