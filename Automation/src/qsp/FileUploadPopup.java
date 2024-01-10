package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
 WebDriver d=new ChromeDriver();
 Thread.sleep(5000);
 d.get("file:///C:/Users/HP/Desktop/File.html");
 Thread.sleep(5000);
 File f=new File("./data/Resume.docx");
 String absolutepath = f.getAbsolutePath();
 d.findElement(By.id("cv")).sendKeys(absolutepath);
d.quit();
	}

}
