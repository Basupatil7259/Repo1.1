package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyurl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/"))
		{
		System.out.println("url is navigating succesfully and pass");
		}
		else 
		{
			System.out.println("url is not navigating succesfully and fail");
			
		}
		driver.quit();
		
	}

}
