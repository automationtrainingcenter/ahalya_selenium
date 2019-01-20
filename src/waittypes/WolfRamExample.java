package waittypes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basics.BrowserHelper;

public class WolfRamExample extends BrowserHelper{
	
	public static void main(String[] args) {
		launch("chrome", "https://www.wolframalpha.com/");
		locateElement("id", "query").sendKeys("2+2"+Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement openCode = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='ng-scope codezone-first-pod']")));
		openCode.click();
		WebElement play = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()= 'Input']/ancestor::td/following-sibling::td//div[@class='wriResizable pa']")));
		play.click();
		WebElement out = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text() = '4']/parent::div[@class='lines']")));
		System.out.println(out.getText());
		closeBrowser();
		
	}

}
