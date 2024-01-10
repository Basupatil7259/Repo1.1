package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlloptionsWithoutForloop {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/Hotel.html");
	WebElement mtrListbox = driver.findElement(By.id("mtr"));
    Select s=new Select(mtrListbox);
    WebElement options = s.getWrappedElement();
    String text = options.getText();
    System.out.println(text);
    driver.quit();
	}

}
