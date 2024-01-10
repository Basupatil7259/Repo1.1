package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
 WebDriver d=new ChromeDriver();
 d.get("https://demo.actitime.com/");
 WebElement button = d.findElement(By.id("keepLoggedInCheckBox"));
 button.click();
 boolean result = button.isSelected();
 if(result) {
	 System.out.println("checkbox is selected");
 }else {
	 System.out.println("checkbox is not selected");
 }
 d.quit();
 

	}

}
