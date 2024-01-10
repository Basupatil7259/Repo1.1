package handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowpopups {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com");
    driver.findElement(By.id("apple-signin-button")).click();
    driver.findElement(By.id("login-google-button")).click();
    String pwh = driver.getWindowHandle();
    Set<String> allwh = driver.getWindowHandles();
    int count = allwh.size();
    System.out.println(count);
    for(String wh:allwh) {
    	driver.switchTo().window(wh);
    	if(!(pwh.equals(wh))){
    	driver.close();
    }
   
	}
	
	}
}
