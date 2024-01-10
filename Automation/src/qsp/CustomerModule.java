package qsp;

import org.junit.Test;
import org.testng.Reporter;

public class CustomerModule {
	@ Test 
	public void createcustomer() {
		Reporter.log("createcustomer", true);
	}
	@Test
	public void modifycustomer() {
		Reporter.log("modifycustomer", true);
	}
	@Test
	public void deletecustomer(){
	    Reporter.log("deletecustomer", true);	
	}
	

}
