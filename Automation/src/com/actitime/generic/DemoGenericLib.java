package com.actitime.generic;

import java.io.IOException;

public class DemoGenericLib {

	public static void main(String[] args) throws IOException {
	FileLib f=new FileLib();
	String url = f.getPropertyData("url");
	String un = f.getPropertyData("username");
	String pw = f.getPropertyData("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pw);
	f.setExcelData("student table",1, 2,"patil");
	String cn = f.getExcelData("student table", 1, 2);
	System.out.println(cn);
	

	}

}
