package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisableElements {

	public static void main(String[] args) {
 WebDriver driver=new FirefoxDriver();
 driver.get("file:///C:/Users/HP/Desktop/Disabled.html");
 driver.findElement(By.id("d1")).sendKeys("admin");
 RemoteWebDriver r=(RemoteWebDriver)driver;
 r.executeScript("document.getElementById('d2').value='manager'");
 r.executeScript("document.getElementById('d3').click()");

	}

}
