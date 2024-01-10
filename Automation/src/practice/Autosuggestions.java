package practice;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args)  {
		//System.out.println("Enter the url");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the url");
		String url=sc.nextLine();
		
 WebDriver driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.get(url);
 driver.findElement(By.name("q")).sendKeys("oneplus");
 List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[contains(text(),'oneplus"
 		+ "')]"));
 int count = autoSuggestions.size();
 System.out.println(count);
 for(int i=0;i<count;i++) {
	String text = autoSuggestions.get(i).getText();
	System.out.println(text);
 }
 autoSuggestions.get(count-2).click();

	}

}
