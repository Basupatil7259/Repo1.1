package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCancel {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://demo.automationtesting.in/Alerts.html");
	d.findElement(By.xpath("//a[@href='#CancelTab']")).click();
	WebElement button = d.findElement(By.xpath("//button[@class='btn btn-primary']"));
	button.click();
	Thread.sleep(3000);
	Alert a = d.switchTo().alert();
    a.dismiss();
	Thread.sleep(3000);
	boolean result = button.isDisplayed();
	if(result) {
		System.out.println("your pressed cancel text is displayed");
	}else {
		System.out.println("your pressed cancel text is not displayed");
	}
	
	

	}

}
