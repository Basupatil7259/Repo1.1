package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtmlcode {

	public static void main(String[] args) {
	WebDriver d= new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.google.com/");
	String htmlcode= d.getPageSource();
	System.out.println(htmlcode);
	d.quit();

	}

}
