package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragandDrop {

	public static void main(String[] args) throws InterruptedException {
 WebDriver d=new FirefoxDriver();
 d.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
 WebElement src = d.findElement(By.xpath("//h1[text()='Block 1']"));
 WebElement target = d.findElement(By.xpath("//h1[text()='Block 4']"));
 Actions a=new Actions(d);
 Thread.sleep(4000);
 a.dragAndDrop(src, target).perform();

	}

}
