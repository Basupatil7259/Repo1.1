package booleanvalues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement image = driver.findElement(By.xpath("//img[contains(@class,'fb')]"));
	boolean result=image.isDisplayed();
	if(result) {
		System.out.println("image is displayed");
	}
	else{
		System.out.println("image is not displayed");
	}
	WebElement button = driver.findElement(By.name("login"));
    boolean res=button.isEnabled();
    if(res) {
    	System.out.println("button is enabled");
    }
    else {
    	System.out.println("button is not enabled");
    }
    WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
    String value = link.getAttribute("href");
    System.out.println(value);
   String tag = link.getTagName();
   System.out.println(tag);
   String src = image.getAttribute("src");
   System.out.println(src);
  String clas = image.getAttribute("class");
  System.out.println(clas);
  String text = link.getText();
  System.out.println(text);
  int hieght = button.getSize().getHeight();
  int width = button.getSize().getWidth();
  System.out.println(hieght);
  System.out.println(width);
 WebElement phnotf = driver.findElement(By.id("email"));
 int x1=phnotf.getLocation().getX();
 WebElement pwtf = driver.findElement(By.id("pass"));
 int x2=pwtf.getLocation().getX();
 if(x1==x2) {
	 System.out.println("txf are alligned");
 }else {
	 System.out.println("not alligned");
 }
 System.out.println(x1);
 System.out.println(x2);
 String color = link.getCssValue("color");
 System.out.println(color);
 
	}

}
