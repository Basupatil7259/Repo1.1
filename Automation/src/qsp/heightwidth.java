package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class heightwidth {

	public static void main(String[] args) {
 WebDriver driver = new ChromeDriver();
 driver.get("https://demo.actitime.com/");
 int a = driver.findElement(By.id("username")).getSize().getHeight();

int b= driver.findElement(By.id("username")).getSize().getWidth();

 int c=driver.findElement(By.name("pwd")).getSize().getHeight();
 int d=driver.findElement(By.name("pwd")).getSize().getWidth();
 if(a==b&&c==d) {
	 System.out.println("un and pwd textbox hieght and width is equal");
 }else {
	 System.out.println("un and pwd textbox hieght and width is not equal");
 }
 driver.quit();
 }
 
}



	

}
