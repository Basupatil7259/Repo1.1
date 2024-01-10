package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlepropertyfiles {

	public static void main(String[] args) throws IOException  {
 FileInputStream fis=new FileInputStream("./data/commondata.property.txt");
 Properties p=new Properties();
 p.load(fis);
 String url = p.getProperty("Url");
 String un = p.getProperty("username");
 String pw = p.getProperty("password");
 System.out.println(url); 
 System.out.println(un);
 System.out.println(pw);
 

	}

}
