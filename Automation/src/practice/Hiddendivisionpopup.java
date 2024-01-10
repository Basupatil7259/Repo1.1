package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hiddendivisionpopup {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
 driver.findElement(By.id("policynumber")).sendKeys("123");
 driver.findElement(By.id("dob")).click();
 WebElement daybox = driver.findElement(By.xpath("//td[@data-handler='selectDay']"));
 Select s2=new Select(daybox);
 s2.selectByIndex(12);
 WebElement monthlistbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
 Select s=new Select(monthlistbox);
 s.selectByIndex(3);
 WebElement yearlistbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
 Select s1=new Select(yearlistbox);
 s1.selectByVisibleText("1998");
 
 
	}
}