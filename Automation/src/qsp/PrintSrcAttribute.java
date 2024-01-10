package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSrcAttribute {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 WebElement image = driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));
 String value = image.getAttribute("src");
 System.out.println(value);

	}

}
