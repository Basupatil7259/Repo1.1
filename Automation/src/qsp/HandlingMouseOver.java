package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingMouseOver {

	public static void main(String[] args) {
 WebDriver d=new ChromeDriver();
 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 d.get("https://www.vtiger.com/");
 WebElement target = d.findElement(By.partialLinkText("Resources"));
 Actions a=new Actions(d);
 a.moveToElement(target).perform();
 d.findElement(By.partialLinkText("Contact Us")).click();
 WebElement text = d.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]"));
 String phno = text.getText();
 System.out.println(phno);
 d.quit();
 
	 
 
 

	}

}
