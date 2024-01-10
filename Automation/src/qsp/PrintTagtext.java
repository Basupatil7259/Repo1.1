package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTagtext {

	public static void main(String[] args) {
 WebDriver d=new ChromeDriver();
 d.get("https://demo.actitime.com/login.do");
 WebElement button = d.findElement(By.id("loginButton"));
 String text = button.getText();
 System.out.println(text);
 d.quit();
 

	}

}
