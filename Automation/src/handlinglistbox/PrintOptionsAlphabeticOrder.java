package handlinglistbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionsAlphabeticOrder {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.get("file:///C:/Users/HP/Desktop/Hotel.html");
 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
 Select s=new Select(mtrlistbox);
 List<WebElement> options = s.getOptions();
 int count = options.size();
 ArrayList<String>al=new ArrayList<>();
 for(int i=0;i<count;i++) {
	 String text = options.get(i).getText();
	 al.add(text);
 }
 Collections.sort(al);
 for(int i=0;i<al.size();i++) {
	String option = al.get(i);
	System.out.println(option);
	 
 }

	}

}
