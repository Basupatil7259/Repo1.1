package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printhtandwidth {

	public static void main(String[] args) {
  WebDriver d=new ChromeDriver();
  d.get("https://www.facebook.com/");
  WebElement ele = d.findElement(By.name("login"));
 int hieght = ele.getSize().getHeight();
 int width = ele.getSize().getWidth();
 System.out.println(hieght);
 System.out.println(width);
 if(hieght==width) {
	 System.out.println("login button of hieght and width is equal");
 }else {
	 System.out.println("login button of hieght and width is not equal");
	 
 }  
 d.quit();

	}

	
}
