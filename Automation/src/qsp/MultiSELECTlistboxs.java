package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSELECTlistboxs {

	public static void main(String[] args) throws InterruptedException {
 WebDriver driver=new ChromeDriver();
 driver.get("file:///C:/Users/HP/Desktop/Hotel.html");
 WebElement mtrListBox= driver.findElement(By.id("mtr"));
 Select s=new Select(mtrListBox);
 s.selectByIndex(2);
 Thread.sleep(2000);
 s.selectByValue("d");
 Thread.sleep(2000);
 s.selectByVisibleText("idly");
 Thread.sleep(2000);
 s.deselectByIndex(2);
 Thread.sleep(2000);
 s.deselectByValue("d");
 Thread.sleep(2000);
 s.deselectByVisibleText("idly");
 Thread.sleep(2000);
 System.out.println(s.isMultiple());
 driver.quit();
 
 
 
 
 


	}

	
}
