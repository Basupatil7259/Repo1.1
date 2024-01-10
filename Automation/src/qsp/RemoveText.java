package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText {

	public static void main(String[] args) {
   WebDriver d= new ChromeDriver();
   d.get("https://opensourcebilling.org/");
   d.findElement(By.name("email-633")).clear();

	}

}
