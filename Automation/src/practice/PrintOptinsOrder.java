package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptinsOrder {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/mtr.html");
	WebElement mtrListbox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListbox);
	List<WebElement> options = s.getOptions();
	int count = options.size();
	ArrayList<String>al=new ArrayList<>();
	for(int i=0;i<count;i++) {
		String text = options.get(i).getText();
		al.add(text);
	}
	Collections.sort(al);
	for(int i=0;i<al.size();i++) {
		String optionss = al.get(i);
		System.out.println(optionss);
	}
	Set<String> set=new TreeSet<>();
	for(int i=0;i<count;i++) {
		String text = options.get(i).getText();
		set.add(text);
	
	}
	for(String AOptions:set) {
		System.out.println(AOptions);
	}

	}

}
