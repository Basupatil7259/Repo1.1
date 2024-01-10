package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinksOfUrl {

	public static void main(String[] args) {
 WebDriver d=new ChromeDriver();
 d.get("https://www.google.com/");
 d.findElement(By.id("APjFqb")).sendKeys("wipro jobs"+Keys.ENTER);
 List<WebElement> url = d.findElements(By.xpath("//a"));
 int count = url.size();
 System.out.println(count);
 for(int i=0;i<count;i++) {
	 String links = url.get(i).getAttribute("href");
	 System.out.println(links);
 }
 d.quit();
	 
 }
 
 
	}
