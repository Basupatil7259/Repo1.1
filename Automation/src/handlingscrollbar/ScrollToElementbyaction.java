package handlingscrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElementbyaction {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bbc.com");
	WebElement ele = driver.findElement(By.xpath("//span[@class='planet--title']"));
    Actions a=new Actions(driver);
    a.scrollToElement(ele).perform();
	}

}
