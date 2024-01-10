package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectListbox {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.get("file:///C:/Users/HP/Desktop/Hotel.html");
 WebElement mtrListBox = driver.findElement(By.id("mtr"));
 select s=new select();
	}

}
