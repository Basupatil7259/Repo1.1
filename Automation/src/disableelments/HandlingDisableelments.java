package disableelments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisableelments {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/disabled.html");
	driver.findElement(By.id("d1")).sendKeys("basu");
	RemoteWebDriver r=(RemoteWebDriver)driver;
	r.executeScript("document.getElementById('d2').value='manager'");
	driver.quit();

	}

}
