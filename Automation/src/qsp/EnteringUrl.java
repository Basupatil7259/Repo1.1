package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringUrl {

	public static void main(String[] args)throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.quit();

	}

}
