package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScollToParticularElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
	    WebElement ele = driver.findElement(By.xpath("//span[text()='Future Planet']"));
	    Actions a=new Actions(driver);
	    a.scrollToElement(ele).perform();
		

	}

}
