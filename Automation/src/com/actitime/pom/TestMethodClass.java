package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestMethodClass {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com");
	LoginPage l=new LoginPage(driver);
	l.setLogin("admin","manager");

	}

}
