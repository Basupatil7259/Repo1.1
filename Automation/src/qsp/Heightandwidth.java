package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heightandwidth {

	public static void main(String[] args) {
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://demo.actitime.com/login.do");
			 int a = driver.findElement(By.id("username")).getSize().getHeight();

			int b= driver.findElement(By.id("username")).getSize().getWidth();

			 int c=driver.findElement(By.name("pwd")).getSize().getHeight();
			 int d=driver.findElement(By.name("pwd")).getSize().getWidth();
			 if(a==c && b==d) {
				 System.out.println("un and pwd textbox hieght and width is equal");
			 }else {
				 System.out.println("un and pwd textbox hieght and width is not equal");
			 }
			 driver.quit();
	}

}
