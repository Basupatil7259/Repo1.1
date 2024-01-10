package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiveElement {

	public static void main(String[] args) {
 WebDriver d=new FirefoxDriver();
 d.get("https://www.google.com/");
 d.switchTo().activeElement().sendKeys("java");

	}

}
