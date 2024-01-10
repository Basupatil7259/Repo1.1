package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByusingActionclass {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.bbc.com/");
	Actions a=new Actions(driver);
	a.scrollByAmount(0,3000).perform();

	}

}
