package handlingscrollbar;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollByusingActionclass {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bbc.com");
	Actions a=new Actions(driver);
	a.scrollByAmount(0,3000).perform();
	Thread.sleep(4000);
	driver.quit();

	}

}
