package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {

	public static void main(String[] args){
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.bbc.com/");
 
 List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(@class,'top-list-item__bullet')]/../h3"));
 int count = autosugg.size();
 System.out.println(count);
 for(int i=0;i<count;i++) {
	 String text = autosugg.get(i).getText();
	 System.out.println(text);
 }
 autosugg.get( count-1).click();
 driver.quit();
 

	}

}
