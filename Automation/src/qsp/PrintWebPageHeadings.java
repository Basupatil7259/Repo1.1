package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintWebPageHeadings {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.get("https://demo.actitime.com/");
 driver.findElement(By.id("username")).sendKeys("admin");
 driver.findElement(By.name("pwd")).sendKeys("manager");
 driver.findElement(By.id("loginButton")).click();
 driver.manage().window().maximize();
 driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
 driver.findElement(By.linkText("About your actiTIME")).click();
 driver.findElement(By.linkText("Read Service Agreement")).click();
 List<WebElement> allheadings = driver.findElements(By.xpath("//h2"));
 int count = allheadings.size();
 System.out.println(count);
 for(int i=0;i<count;i++) {
	 String text = allheadings.get(i).getText();
	 System.out.println(text);
 }
 driver.quit();

	}

}
