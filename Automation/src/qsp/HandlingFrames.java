package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
 WebDriver d=new FirefoxDriver();
 d.get("file:///C:/Users/HP/Desktop/Page1.html");
 d.switchTo().frame(0);
 d.findElement(By.id("t2")).sendKeys("jsp");
 d.switchTo().defaultContent();
 Thread.sleep(3000);
 d.findElement(By.id("t1")).sendKeys("qsp");
 d.quit();

	}

}
