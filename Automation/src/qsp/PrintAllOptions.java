package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {

	public static void main(String[] args) throws InterruptedException {
 WebDriver d=new ChromeDriver();
 d.get("file:///C:/Users/HP/Desktop/Hotel.html");
 WebElement mtrListbox = d.findElement(By.id("mtr"));
 Select s=new Select(mtrListbox);
 List<WebElement> allOptions = s.getOptions();
 System.out.println(allOptions);
 int count = allOptions.size();
 System.out.println(count);
for(int i=0;i<count;i++) {
	 String text = allOptions.get(i).getText();
	 Thread.sleep(3000);
	 System.out.println(text);
	 
 }
 d.quit();
 
	}

}
