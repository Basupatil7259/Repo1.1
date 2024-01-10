package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosccenarios {

	public static void main(String[] args) throws InterruptedException {
  WebDriver d=new ChromeDriver();
  d.get("https://demo.actitime.com/");
   d.  findElement(By.id("username")).sendKeys("admin");
   d. findElement(By.name("pwd")).sendKeys("manager");
   d.findElement(By.xpath("//div[text()='Login ']")).click();
   Thread.sleep(4000);
   d.findElement(By.id("logoutLink")).click();
   d.quit();

  

	}

	
}
