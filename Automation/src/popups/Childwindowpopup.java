package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowpopup {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
	driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
	Set<String> allwh = driver.getWindowHandles();
	int count = allwh.size();
	System.out.println(count);
	for(String wh:allwh) {
		System.out.println(wh);
	}
	Thread.sleep(4000);
	driver.quit();
	
	

	}

}
