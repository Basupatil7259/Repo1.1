package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledorNot {

	public static void main(String[] args) throws InterruptedException {
 WebDriver d= new ChromeDriver();
 d.get("https://www.instagram.com/");
 Thread.sleep(2000);
 boolean res = d.findElement(By.xpath("//div[text()='Log in']")).isEnabled();
 if(res){
	 System.out.println("login button is enabled");
 }else {
	 System.out.println("login button is disabled");
 }
 d.quit();

	}

}
