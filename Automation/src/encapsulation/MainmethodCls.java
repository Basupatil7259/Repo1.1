package encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainmethodCls {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	LoginPage l=new LoginPage(driver);
	l.setLogin("admin1","manager1");
	Thread.sleep(3000);
	l.setLogin("admin","manager");
	

	}

}
