package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printxandyaxis {

	public static void main(String[] args) {
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.facebook.com/");
int x1 =driver.findElement(By.name("login")).getLocation().getX();
int x2=driver.findElement(By.name("login")).getLocation().getY();
System.out.println(x1);
System.out.println(x2);
driver.quit();
 
 

	}

}
