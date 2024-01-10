package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test
	public void createCustomer() {
		Reporter.log("createcustomer",true);
	}
	@Test
	public void modifyCustomer() {
		Reporter.log("modifycustomer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("deletecustomer",true);
	}
}

