package tabshandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Thread.sleep(3000);
	Set<String> allWh = driver.getWindowHandles();
	for(String wh : allWh) {
	driver.switchTo().window(wh);
	Thread.sleep(3000);
	driver.close();
	}
	

	}

}
