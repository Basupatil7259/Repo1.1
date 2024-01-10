package actitime;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNg {
@Test
public void demo() {
	Reporter.log("welcome to testing", true);
}
@Test(enabled=false)
public void real() {
	Reporter.log("Testing is over",true);
}
@Test
public void realworld() {
	Reporter.log("testing is required",true);
}

}
