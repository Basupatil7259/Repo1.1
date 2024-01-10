package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidPolicyno {

	public static void main(String[] args) throws InterruptedException {
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
 driver.findElement(By.id("policynumber")).sendKeys("123");
 driver.findElement(By.id("dob")).click();
 WebElement monthlistbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
 Select s=new Select(monthlistbox);
 s.selectByIndex(3);
 WebElement yearlistbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
 Select s1=new Select(yearlistbox);
 s1.selectByVisibleText("1998");
 driver.findElement(By.xpath("//a[text()='13']")).click();
 driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
 WebElement submitbutton = driver.findElement(By.id("renew_policy_submit"));
 submitbutton.click();
 Thread.sleep(2000);
 boolean result = submitbutton.isDisplayed();
 if(result) {
	 System.out.println("valid policy number is displayed");
	 
 }else {
	 System.out.println("valid policy number is not displayed");
 }
 
 
 
 

	}

}
