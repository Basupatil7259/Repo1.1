package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class GetFirstSelectedOption {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("Thread.sleep(3000);");
	WebElement slvListbox = driver.findElement(By.id("slv"));
	Select s=new Select(slvListbox);
	WebElement fsoption = s.getFirstSelectedOption();
	String text = fsoption.getText();
	System.out.println(text);
	driver.quit();


	}

}
