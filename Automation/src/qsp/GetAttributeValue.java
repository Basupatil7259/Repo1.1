package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {

	public static void main(String[] args) {
 WebDriver d=new ChromeDriver();
 d.get("https://www.facebook.com/");
 WebElement link = d.findElement(By.xpath("//a[text()='Forgotten password?']"));
 String value = link.getAttribute("href");
 System.out.println(value);
 String tag = link.getTagName();
 System.out.println(tag);
 d.quit();

	}

}

