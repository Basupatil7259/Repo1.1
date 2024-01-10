package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
	WebDriver d= new ChromeDriver();
	d.get("https://www.facebook.com/");
	WebElement button = d.findElement(By.name("login"));
     boolean result = button.isEnabled();
     if(result) {
    	 System.out.println("login button is enabled");
     }else {
    	 System.out.println("login button is not enabled");
     }
     d.quit();
     

	}

}
