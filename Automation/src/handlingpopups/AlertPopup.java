package handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alert.html");
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	Alert a = driver.switchTo().alert();
	String text = a.getText();
	a.accept();
	driver.quit();
	

	}

}
