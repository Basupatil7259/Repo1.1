package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckAlignmentonYaxis {

	public static void main(String[] args) throws InterruptedException {
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 driver.findElement(By.linkText("Create new account")).click();
 Thread.sleep(3000);
 int x1 = driver.findElement(By.id("day")).getLocation().getY();
 int x2 = driver.findElement(By.id("month")).getLocation().getY();
 int x3 = driver.findElement(By.id("year")).getLocation().getY();
 if(x1==x2&&x2==x3) {
	 System.out.println("radio buttons are properly alligned");
 }else {
	 System.out.println("radio buttons are not properly alligned");
 }
	 
 }
 

	}


