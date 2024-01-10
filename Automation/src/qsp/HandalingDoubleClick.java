package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandalingDoubleClick {

	public static void main(String[] args) throws InterruptedException {
WebDriver d=new FirefoxDriver();
d.get("https://www.vtiger.com/");
WebElement target = d.findElement(By.partialLinkText("Resources"));
Actions a=new Actions(d);
a.moveToElement(target).perform();
Thread.sleep(3000);
d.findElement(By.partialLinkText("Customers")).click();
WebElement dclick = d.findElement(By.id("loginspan"));
a.doubleClick(dclick).perform();
}

}
