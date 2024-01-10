package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllselectedoptions {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("");
	WebElement mtrListbox = driver.findElement(By.id("mtr"));
    Select s=new Select(mtrListbox);
    List<WebElement> aoptions = s.getAllSelectedOptions();
    int count = aoptions.size();
    for(int i=0;i<count;i++) {
    	String text = aoptions.get(i).getText();
    	System.out.println(text);
    }
    driver.quit();
	}

}
