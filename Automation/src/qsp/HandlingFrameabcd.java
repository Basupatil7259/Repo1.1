package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrameabcd {

	public static void main(String[] args){
WebDriver d=new FirefoxDriver();
d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
d.get("file:///C:/Users/HP/Desktop/Page1.html");
d.findElement(By.id("t1")).sendKeys("a");
d.switchTo().frame("f1");
d.findElement(By.id("t2")).sendKeys("b");
d.switchTo().defaultContent();
d.findElement(By.id("t1")).sendKeys("c");
WebElement e = d.findElement(By.xpath("//iframe"));
d.switchTo().frame(e);
d.findElement(By.id("t2")).sendKeys("d");
d.quit();



	}

}
