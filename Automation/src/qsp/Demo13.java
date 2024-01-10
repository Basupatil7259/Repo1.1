package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException {
 WebDriver driver=new ChromeDriver();
 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
 
	}

}
