package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printatosuggestion {
	public static void main(String[]args) throws InterruptedException{
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		d.findElement(By.name("q")).sendKeys("oneplus");
		Thread.sleep(2000);
		List<WebElement> allsugg = d.findElements(By.xpath("//li[@class='Y5N33s']"));
		int count=allsugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text=allsugg.get(i).getText();
			System.out.println(text);
			
		}
			allsugg.get(count-1).click();
			d.quit();
		
	}

}
