package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TocheckEqual {

	public static void main(String[] args) {
  WebDriver d=new ChromeDriver();
  d.get("https://demo.actitime.com/login.do");
  WebElement un = d.findElement(By.id("username"));
  WebElement pwd = d.findElement(By.name("username"));
 int x1 = un.getSize().getHeight();
 int x2 = pwd.getSize().getHeight();
 if(x1==x2) {
	 System.out.println("un and pwd ht and wd is equal");
 }else {
	 System.out.println("un and pwd ht and wd is not equal");
 }
 d.quit();
  

	}

	
}
