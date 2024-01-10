package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrcAttribute {

	public static void main(String[] args) {
 WebDriver d=new ChromeDriver();
 d.get("https://www.facebook.com/");
 WebElement logo = d.findElement(By.xpath("//img[contains(@class,'fb')]"));
 String value = logo.getAttribute("src");
 System.out.println(value);
 d.quit();

	}

}
