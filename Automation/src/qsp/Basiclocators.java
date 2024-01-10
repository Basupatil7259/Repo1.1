package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiclocators {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.automationpractice.pl/index.php");
    WebElement searchbox=driver.findElement(By.id("search_query_top"));
    searchbox.sendKeys("T-shirts");
    driver.findElement(By.name("submit_search")).click();
    driver.findElement(By.linkText("Printed Chiffon Dress"));
   // driver.findElement(By.partialLinkText("Chiffon Dress"));
	

	}

}
