package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSoptions {

	public static void main(String[] args) throws InterruptedException {
 WebDriver d=new ChromeDriver();
 d.get("file:///C:/Users/HP/Desktop/Hotel.html");
 WebElement slvListbox = d.findElement(By.id("mtr"));
 Select s=new Select(slvListbox);
 List<WebElement> allOptions = s.getOptions();
 int count = allOptions.size();
 System.out.println(count);
 for(int i=0;i<count;i++) {
	 Thread.sleep(500);
	 s.selectByIndex(i);
	 }
 for(int i=count-1;i>=0;i--) {
	 Thread.sleep(500);
	 s.deselectByIndex(i);
 }
 d.quit();
 

	}

}
