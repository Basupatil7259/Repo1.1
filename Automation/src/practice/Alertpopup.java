package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertpopup {

	public static void main(String[] args)  {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.alertIsPresent());
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Alert a=driver.switchTo().alert();
	String text = a.getText();
	a.dismiss();
	System.out.println(text);
	driver.quit();
	

	}

}
