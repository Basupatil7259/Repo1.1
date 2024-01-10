package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle {
@Test
public void verifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("");
	String eTitle="Soogle";
	String aTitle=driver.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(aTitle,eTitle);
	driver.quit();
}
}
