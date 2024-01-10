package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofIsEnabled {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//boolean res= driver.findElement(By.name("login")).isEnabled();
		boolean res= driver.findElement(By.xpath("//div[text()='Log in']/..")).isEnabled();
	    if(res) {
			System.out.println("login button is enabled");
		}else {
			System.out.println("login button is disabled");
		}
	    driver.quit();
		

	}

}
