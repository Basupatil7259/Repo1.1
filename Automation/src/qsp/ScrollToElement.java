package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.bbc.com/");
  int x = driver.findElement(By.xpath("//span[text()='Future Planet']")).getLocation().getX();
 Actions a=new Actions(driver);
 a.scrollToElement(point);

	}

}
