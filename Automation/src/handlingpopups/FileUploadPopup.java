package handlingpopups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("");
	File f=new File("./data/Resume.docx");
    String absolutePath = f.getAbsolutePath();
    driver.findElement(By.id("cv")).sendKeys(absolutePath);
	}

}
