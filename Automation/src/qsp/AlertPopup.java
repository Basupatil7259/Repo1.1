package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://demo.automationtesting.in/Alerts.html");
	Thread.sleep(5000);
	d.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	Thread.sleep(5000);
	Alert a = d.switchTo().alert();
	String text = a.getText();
	System.out.println(text);
	a.accept();
	Thread.sleep(2000);
	d.quit();

	}

}
