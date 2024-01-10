package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12{

	public static void main(String[] args) throws InterruptedException {
 WebDriver driver=new ChromeDriver();
 driver.get("https://demo.actitime.com/");
 WebElement text = driver.findElement(By.id("keepLoggedInLabel"));
 String tag = text.getTagName();
 System.out.println(tag);
 String value = text.getAttribute("style");
 System.out.println(value);
 
 }
 

	}


