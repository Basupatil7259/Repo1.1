package selectclass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicates {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/Hotel.html");
	WebElement mtrListbox = driver.findElement(By.id("mtr"));
    Select s= new Select(mtrListbox);
    Set<String>set=new HashSet<>();
    List<String>al=new ArrayList<>();
    List<WebElement> options = s.getOptions();
    for(int i=0;i<options.size();i++) {
    String text = options.get(i).getText();
    if(!set.add(text)) {
    	al.add(text);
    }
   
    }
    for(String string:al) {
    	System.out.println(string);
    }
	}

}
