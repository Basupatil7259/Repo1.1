package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
 WebDriver d=new ChromeDriver();
 d.get("https://www.facebook.com/");
 WebElement image = d.findElement(By.xpath("//img[contains(@class,'fb')]"));
 boolean result = image.isDisplayed();
 if(result) {
	 System.out.println("web element is displayed");
 }else {
	 System.out.println("web element is not displayed");
 }
 d.quit();
 
 

	}

}
