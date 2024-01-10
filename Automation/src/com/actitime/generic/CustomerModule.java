package com.actitime.generic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule extends BaseClass {
@Test
public void createCustomer() {
	Reporter.log("createcustomer",true);
	Assert.fail();
}
@Test
public void modifyCustomer() {
	Reporter.log("modifycustomer",true);
	Assert.fail();
}
@Test
public void deleteCustomer() {
	Reporter.log("deletecustomer",true);
}

}
