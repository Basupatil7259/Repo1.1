package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("file:///C:/Users/HP/Desktop/static.html");
	d.findElement(By.tagName("a")).click();
	d.navigate().back();
	d.findElement(By.id("d1")).click();
	d.navigate().back();
	d.findElement(By.name("n1")).click();
	d.navigate().back();
	d.findElement(By.className("c1")).click();
	d.quit();
	}
}
	