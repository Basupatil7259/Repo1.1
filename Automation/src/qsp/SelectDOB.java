package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDOB {

	public static void main(String[] args) throws InterruptedException {
 WebDriver d=new ChromeDriver();
 d.get("https://www.facebook.com/");
 Thread.sleep(4000);
 d.findElement(By.linkText("Create new account")).click();
 Thread.sleep(4000);
 WebElement datebox = d.findElement(By.id("day"));
 WebElement monthbox = d.findElement(By.id("month"));
 WebElement yearbox = d.findElement(By.id("year"));
 Select s=new Select(datebox);
 s.selectByIndex(12);
 Thread.sleep(4000);
 s.selectByValue("13");
 Thread.sleep(4000);
 s.selectByVisibleText("13");
 Select s1=new Select(monthbox);
 s1.selectByIndex(3);
 s1.selectByValue("4");
 s1.selectByVisibleText("Apr");
 Select s2=new Select(yearbox);
 s2.selectByIndex(25);
 s2.selectByValue("1998");
 s2.selectByVisibleText("1998");
 d.quit();
	}
 
 

	
}
