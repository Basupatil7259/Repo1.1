package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofIddisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 WebElement image = driver.findElement(By.xpath("//img[contains(@class,'fb')]"));
		 boolean result = image.isDisplayed();
		 if(result) {
			 System.out.println("webelement is displayed");
		 }
		 else {
			 System.out.println("web element is not displayed");
		 }
		 driver.quit();
		
		

	}

}
