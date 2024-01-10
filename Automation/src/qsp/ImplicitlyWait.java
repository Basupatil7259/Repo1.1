package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
 WebDriver d=new ChromeDriver();
 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 d.get("https://demo.actitime.com/");
 d.  findElement(By.id("username")).sendKeys("admin");
 d. findElement(By.name("pwd")).sendKeys("manager");
 d.findElement(By.xpath("//div[text()='Login ']")).click();
 d.findElement(By.id("logoutLink")).click();
 d.quit();


	}

}
