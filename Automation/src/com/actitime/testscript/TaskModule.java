package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
	@Test
public void createTask() {
	Reporter.log("createtask",true);
}
	@Test
public void modifyTask() {
	Reporter.log("modifytask",true);
}
	@Test
public void deleteTask() {
	Reporter.log("deletetask",true);
}
}
