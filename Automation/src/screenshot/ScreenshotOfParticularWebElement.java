package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOfParticularWebElement {

	final public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.royalchallengers.com/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.className("hdr-logo"));
    File src=ele.getScreenshotAs(OutputType.FILE);
    File dest=new File("./Screenshot/rcb.jpj");
    FileUtils.copyFile(src, dest);
    driver.quit();
	}

}
